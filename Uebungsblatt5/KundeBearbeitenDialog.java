import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class KundeBearbeitenDialog extends JDialog {
	class MyOkHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			kunde.setNachname(txtNachname.getText());
			kunde.setVorname(txtVorname.getText());
			dispose();
		}
	}

	class MyCancelHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}

	private Kunde kunde;

	private JTextField txtNachname;
	private JTextField txtVorname;

	public KundeBearbeitenDialog(JFrame parent, Kunde kunde) {
		super(parent);

		setModal(true);
		setTitle("Kunde bearbeiten");
		setSize(400, 300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		this.kunde = kunde;

		setLayout(new GridLayout(3, 2));

		add(new JLabel("Nachname:"));
		this.txtNachname = new JTextField(kunde.getNachname());
		add(this.txtNachname);
		add(new JLabel("Vorname:"));
		this.txtVorname = new JTextField(kunde.getVorname());
		add(this.txtVorname);

		JButton cmdok = new JButton("OK");
		cmdok.addActionListener(new MyOkHandler());
		add(cmdok);

		JButton cmdcancel = new JButton("Abbrechen");
		cmdcancel.addActionListener(new MyCancelHandler());
		add(cmdcancel);

		pack();
		setVisible(true);

	}
}
