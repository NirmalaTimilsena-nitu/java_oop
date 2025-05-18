package java_awt_example;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JImageIconDemo {
	public JImageIconDemo() {
		JFrame f = new JFrame("Swing Demo");
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon image1 = new ImageIcon("E:\\From Phone\\Clicks\\20230305_064253.jpg");
		JLabel l = new JLabel(image1);
		f.add(l);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new JImageIconDemo();
	}

}
