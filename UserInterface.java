package daniel2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import javax.swing.JFrame;

public class UserInterface extends JPanel {

	private JPanel pnlNorth = new JPanel(new BorderLayout());
	private JPanel pnlCenter = new JPanel(new BorderLayout());
	private JPanel pnlSouth = new JPanel();

	private JButton add = new JButton("Add");
	private JButton remove = new JButton("Remove");
	private JButton find = new JButton("Find");

	private JButton oneNew = new JButton("New");
	private JButton multipleNew = new JButton("Multiple");
	private JButton print = new JButton("Skriv ut");

	private JTextArea text = new JTextArea("Wadup fam");

	private Font font = new Font("SansSerif", Font.BOLD, 14);

	public UserInterface() {

		setPreferredSize(new Dimension(400, 200));
		setLayout(new BorderLayout(10, 5));

		add(pnlNorth, BorderLayout.NORTH);
		pnlNorth.add(add, BorderLayout.WEST);
		add.setFont(font);
		add.setPreferredSize(new Dimension(120, 40));
		pnlNorth.add(remove, BorderLayout.CENTER);
		remove.setFont(font);
		remove.setPreferredSize(new Dimension(120, 40));
		pnlNorth.add(find, BorderLayout.EAST);
		find.setFont(font);
		find.setPreferredSize(new Dimension(120, 40));

		add(pnlCenter, BorderLayout.CENTER);
		pnlCenter.add(oneNew, BorderLayout.WEST);
		oneNew.setFont(font);
		oneNew.setPreferredSize(new Dimension(120, 40));

		pnlCenter.add(multipleNew, BorderLayout.CENTER);
		multipleNew.setFont(font);
		multipleNew.setPreferredSize(new Dimension(120, 40));

		pnlCenter.add(print, BorderLayout.EAST);
		print.setFont(font);
		print.setPreferredSize(new Dimension(120, 40));

		add(pnlSouth, BorderLayout.SOUTH);
		pnlSouth.add(text);
		text.setPreferredSize(new Dimension(400, 110));

		addListeners();

	}

	private void addListeners() {
		UserInterfaceListener listen = new UserInterfaceListener();
		add.addActionListener(listen);
		remove.addActionListener(listen);
		find.addActionListener(listen);
		oneNew.addActionListener(listen);
		multipleNew.addActionListener(listen);
		print.addActionListener(listen);

	}

	public void start() {
		JFrame frame = new JFrame("UserInterface");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new UserInterface(), 0);
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);

	}

	public static void main(String[] args) {

		UserInterface app = new UserInterface();
		app.start();
	}

	private class UserInterfaceListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == add) {
				System.out.println("Hej");
			}

			if (e.getSource() == remove) {

			}

			if (e.getSource() == find) {

			}
			if (e.getSource() == oneNew) {

			}
			if (e.getSource() == multipleNew) {

			}
			if (e.getSource() == print) {

			}
		}
	}

}
