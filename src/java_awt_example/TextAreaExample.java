package java_awt_example;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaExample {
	JTextArea area;
	JFrame f;

	TextAreaExample() {
		f = new JFrame();
		area = new JTextArea(300, 300);
		area.setBounds(10, 30, 300, 300);
		area.setBackground(Color.RED);
		area.setForeground(Color.white);
		f.add(area);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new TextAreaExample();
	}
}
