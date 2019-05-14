import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

class KundenVerwaltung extends JFrame {

	private ListSelectionModel kundeSelectionModel;
	private KundeTableModel kundeTableModel;

	private JMenuItem miEdit;

	public KundenVerwaltung(Kunde[] kunden) {

		setTitle("Kundenverwaltung");
		setSize(500, 400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);

		JMenu menu = new JMenu("Datei");
		menubar.add(menu);

		miEdit = new JMenuItem("Kunde bearbeiten");
		miEdit.setEnabled(false);
		miEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editKunde();
			}
		});
		menu.add(miEdit);

		JMenuItem mi = new JMenuItem("Beenden");
		mi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		menu.add(mi);

		kundeTableModel = new KundeTableModel(kunden);
		JTable table = new JTable(kundeTableModel);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		kundeSelectionModel = table.getSelectionModel();
		kundeSelectionModel.setSelectionMode(
			ListSelectionModel.SINGLE_SELECTION);
		kundeSelectionModel.addListSelectionListener(
			new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent event) {
					if (event.getFirstIndex() != -1) {
						miEdit.setEnabled(true);
					} else {
						miEdit.setEnabled(false);
					}
				}
			}
		);
		table.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent event) {
				if (event.getClickCount() == 2)
					editKunde();
			}
		});

		JScrollPane scrollpane = new JScrollPane(table);
		JPanel titlepane = new JPanel();
		titlepane = new JPanel();
		titlepane.setBorder(BorderFactory.createTitledBorder(
			BorderFactory.createEtchedBorder(), "Tabellenansicht"));
		titlepane.setLayout(new BorderLayout());
		titlepane.add(scrollpane);

		add(titlepane);

		setVisible(true);
	}

	private void editKunde() {
		int row = kundeSelectionModel.getMinSelectionIndex();
		new KundeBearbeitenDialog(this, kundeTableModel.getKunde(row));
		kundeTableModel.fireTableRowsUpdated(row, row);
	}

	public static void main(String[] args) {
		Kunde[] kunden = new Kunde[3];
		kunden[0] = new Kunde("Meier", "Josef");
		kunden[1] = new Kunde("Huber", "Franziska");
		kunden[2] = new Kunde("Schmidt", "Helmut");
		new KundenVerwaltung(kunden);
	}
}
