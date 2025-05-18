package java_awt_example;

import java.awt.*;

public class CheckBoxExample {
	CheckBoxExample() {
		Frame f = new Frame("Checkbox Example");
		Checkbox c1 = new Checkbox("Yes", true);
		c1.setBounds(100, 100, 60, 60);
		Checkbox c2 = new Checkbox("No");
		c2.setBounds(100, 150, 60, 60);
		f.add(c1);
		f.add(c2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new CheckBoxExample();
	}
}
