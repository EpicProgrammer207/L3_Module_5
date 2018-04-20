package data_structures;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JPanel panel;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JFrame frame;
	String s1 = "Hangman";
	String s2 = "Programming";
	String s3 = "Language";
	String s4 = "Dab";
	ArrayList<JLabel> list = new ArrayList<>();
	ArrayList<String> listdos = new ArrayList<>();
	int i = new Random().nextInt(4);

	void start() {
		panel = new JPanel();
		frame = new JFrame();
		frame.addKeyListener(this);
		addWords();
		setToUnderscores(list.get(i));
		panel.add(list.get(i));
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	void addWords() {
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		listdos.add(s1);
		listdos.add(s2);
		listdos.add(s3);
		listdos.add(s4);
		label1.setText(s1);
		label2.setText(s2);
		label3.setText(s3);
		label4.setText(s4);
		list.add(label1);
		list.add(label2);
		list.add(label3);
		list.add(label4);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	void setToUnderscores(JLabel jlabel) {
		String s = "";
		for (int j = 0; j < jlabel.toString().length(); j++) {
			s += "_";
		}
		jlabel.setText(s);
	}

	private void updateSpacesWithUserInput(char keyChar) {
		for (int j = 0; j < listdos.get(i).length(); i++) {
			if (listdos.get(i).charAt(i) == keyChar) {
				list.get(i).setText("" + keyChar);
			}
		}
	}

	private String getCurrentAnswer() {
		StringBuffer answer = new StringBuffer();
		for (JLabel textBox : list) {
			answer.append(textBox.getText());
		}
		return answer.toString();
	}
}
