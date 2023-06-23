package PBO2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm3 extends JFrame implements ActionListener{
	private JLabel label;
	private JButton button;
	
	public HelloWorldForm3() {
		label = new JLabel();
		label.setText("Hello World!");
		button.addActionListener(this);
		
		setLayout(new GridLayout (2,1));
		add(label);
		add(button);
		setTitle("My first program");
		setVisible(true);
		setSize(300, 200);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label.setText("Halo Dunia ");
		
	}
}
