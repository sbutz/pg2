import java.awt.event.*;
import javax.swing.*;

public class DummyFrame extends JFrame {

	class ExitActionListener implements ActionListener {

		public void actionPerformed(ActionEvent arg) {
			dispose();
		}
	}

	public DummyFrame() {
		setTitle("Dummy");
		setSize(500, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);

		JMenu menuFile = new JMenu("Datei");
		bar.add(menuFile);

		JMenuItem itemOpen = new JMenuItem("Oeffnen");
		menuFile.add(itemOpen);
		JMenuItem itemSave = new JMenuItem("Speichern");
		menuFile.add(itemSave);
		JMenuItem itemDivider = new JMenuItem("Trennstrich");
		menuFile.add(itemDivider);

		menuFile.addSeparator();
		JMenuItem itemExit = new JMenuItem("Beenden");
		itemExit.addActionListener(new ExitActionListener());
		menuFile.add(itemExit);


		JMenu menuEdit = new JMenu("Bearbeiten");
		bar.add(menuEdit);

		JMenuItem itemCut = new JMenuItem("Ausschneiden");
		menuEdit.add(itemCut);
		JMenuItem itemCopy = new JMenuItem("Kopieren");
		menuEdit.add(itemCopy);
		JMenuItem itemPaste = new JMenuItem("Einfuegen");
		menuEdit.add(itemPaste);


		setVisible(true);
	}

	public static void main(String[] args) {
		new DummyFrame();
	}
}
