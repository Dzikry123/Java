package PBO2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm2 extends JFrame{
	private JLabel label;
	
	public HelloWorldForm2() {
		label = new JLabel();
		label.setText("Halo dunia");
		
		add(label);
		setTitle("Program pertama");
		
		setVisible(true);
		setSize(300, 200);
		
	}
}
