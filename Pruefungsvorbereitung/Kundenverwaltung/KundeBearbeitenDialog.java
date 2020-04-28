import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KundeBearbeitenDialog extends JDialog {
	public KundeBearbeitenDialog(JFrame parent, Kunde kunde) {
		super(parent);

		JTextField vornameField;
		JTextField nachnameField;
		JButton button;

		setTitle("Kunde bearbeiten");
		setLayout(new GridLayout(3, 2));
		setModal(true);

		add(new JLabel("Nachname: "));
		vornameField = new JTextField(kunde.getVorname());
		add(vornameField);

		add(new JLabel("Vorname: "));
		nachnameField = new JTextField(kunde.getNachname());
		add(nachnameField);

		button = new JButton("Abbrechen");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		add(button);

		button = new JButton("Speichern");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kunde.setVorname(vornameField.getText());
				kunde.setNachname(nachnameField.getText());
				dispose();
			}
		});
		add(button);

		pack();
		setVisible(true);
	}
}
