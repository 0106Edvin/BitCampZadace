package ba.bitcamp.edvin.DummyXO;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DummyXO extends JFrame {
	private static final long serialVersionUID = 3330683426622050401L;
	/**
	 * Creating 9 buttons and sign that will be used as X or O
	 */
	JButton[] buttons = new JButton[9];
	public String sign = "";

	public DummyXO() {
		/**
		 * Setting grid layout with 3 rows and 3 columns
		 */
		setLayout(new GridLayout(3, 3));

		/**
		 * Adding buttons and action listener to every button
		 */
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(new Action());

			add(buttons[i]);

		}
		/**
		 * Setting title, size location on center of display enabling to close
		 * on exit and set window visible
		 */
		setTitle("DUMMY X-O");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DummyXO();

	}

	private class Action implements ActionListener {

		@Override
		/**
		 * Adding sign X or O to buttons, and changing the sign every time user click on button
		 */
		public void actionPerformed(ActionEvent e) {
			for (int j = 0; j < buttons.length; j++) {
				if (e.getSource() == buttons[j]) {
					if (sign.equals("X")) {
						sign = "O";
					} else
						sign = "X";

					buttons[j].setText(sign);

				}

			}
		}

	}
}
