package data_structures;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	boolean b = false;
	ArrayList<String> list = new ArrayList<>();
	int random = new Random().nextInt(4);
	String s;


	public static void main(String[] args) {
		HangMan h = new HangMan();
		h.makeWord();

	}

	void makeWord() {
		
		frame = new JFrame();
		panel = new JPanel();
		frame.addKeyListener(this);

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// if (!b) {
		
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			
			label = new JLabel();
			label.setText(s);
			panel.add(label);
			frame.repaint();

		}
		// }
	}

	private void updateSpacesWithUserInput(char keyChar) {
		for (int i = 0; i < puzzle.length(); i++) {
			if (puzzle.charAt(i) == keyChar) {
				boxes.get(i).setText("" + keyChar);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
