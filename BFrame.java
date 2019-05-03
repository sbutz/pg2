import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BFrame extends JFrame {
	class OkActionHandler implements ActionListener {
		public void actionPerformed(ActionEvent arg) {
			input.setText(input.getText() + "!");
		}
	}

	private JTextField input;

	public BFrame(String initValue) {
		setTitle("Betone!");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new GridLayout(2, 1));

		
		input = new JTextField(initValue);
		add(input);

		JButton ok = new JButton("OK");
		add(ok);
		ok.addActionListener(new OkActionHandler());

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new BFrame("xxxxxxxxxxxxxxxxxxxxxxxx");
	}
}
