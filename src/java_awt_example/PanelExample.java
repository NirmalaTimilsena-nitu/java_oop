package java_awt_example;

import java.awt.*;

public class PanelExample {
	PanelExample() {
		Frame f = new Frame("NIMS Panel Example");
		Panel p1 = new Panel();
		p1.setBounds(40, 80, 200, 200);
		p1.setBackground(Color.red);
		Button b1 = new Button("On");
		b1.setBounds(50, 100, 80, 30);
		b1.setBackground(Color.gray);
		Button b2 = new Button("Off");
		b2.setBounds(100, 100, 80, 30);
		b2.setBackground(Color.gray);
		p1.add(b1);
		p1.add(b2);
		f.add(p1);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new PanelExample();
	}
}
