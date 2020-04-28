import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.List;

class Kundenverwaltung extends JFrame {
	private ListSelectionModel selectionModel;
	private KundenTableModel model;

	public Kundenverwaltung(List<Kunde> kunden) {
		setTitle("Kundenverwaltung");
		setSize(400, 400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JMenuBar menuBar;
		JMenu menu;
		JMenuItem item;
		JTable table;
		JPanel titlePane;
		JScrollPane scrollPane;

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menu = new JMenu("Datei");
		menuBar.add(menu);
		
		item = new JMenuItem("Kunde bearbeiten");
		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editKunde();
			}
		});
		menu.add(item);

		item = new JMenuItem("Speichern");
		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					KundenFileManager.save(kunden);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(
						Kundenverwaltung.this, "Fehler beim Schreiben", "Fehler",
						JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		menu.add(item);

		item = new JMenuItem("Beenden");
		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		menu.add(item);

		model = new KundenTableModel(kunden);
		table = new JTable(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent event) {
				if (event.getClickCount() == 2)
					editKunde();
			}
		});
		selectionModel = table.getSelectionModel();
		selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		titlePane = new JPanel();
		titlePane.setBorder(BorderFactory.createTitledBorder(
			BorderFactory.createEtchedBorder(), "Tabellenansicht"));
		titlePane.setLayout(new BorderLayout());
		
		scrollPane = new JScrollPane(table);
		titlePane.add(scrollPane);

		add(titlePane);

		setVisible(true);
	}

	private void editKunde() {
		int row = selectionModel.getMinSelectionIndex();
		new KundeBearbeitenDialog(this, model.getKunde(row));
		model.fireTableRowsUpdated(row, row);
	}

	public static void main(String args[]) {
		Kunde k1 = new Kunde("Max",  "Mustermann");
		Kunde k2 = new Kunde("Luisa",  "Mustermann");
		Kunde k3 = new Kunde("Herbert",  "Mustermann");
		Kunde k4 = new Kunde("Anna",  "Mustermann");
		Kunde k5 = new Kunde("Johann",  "Mustermann");
		Kunde k6 = new Kunde("Felix",  "Mustermann");

		KundenFileManager kundenFileManager = new KundenFileManager();
		try {
			List<Kunde> kunden = kundenFileManager.load();
			new Kundenverwaltung(kunden);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
