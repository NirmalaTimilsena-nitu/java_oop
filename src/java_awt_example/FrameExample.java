package java_awt_example;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameExample {
	public static void main(String[] args) {
		JFrame f = new JFrame();// creating instance of JFrame  
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		JLabel l = new JLabel("This is a Label");
		JButton b = new JButton("click");// creating instance of JButton  
		p.add(l);
		p.add(b);
		f.add(p);
		b.setBounds(130, 100, 100, 40);// x axis, y axis, width, height  
		f.add(b);// adding button in JFrame  
		f.setSize(400, 500);// 400 width and 500 height  
		f.setLayout(null);// using no layout managers  
		f.setVisible(true);// making the frame visible 
	}
}
