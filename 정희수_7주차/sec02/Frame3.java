package sec02;
import java.awt.*;
import javax.swing.*;

public class Frame3 extends JFrame {
	public Frame3() {
		setTitle("GridLayoutTest");
		setSize(300,150);
		setLayout(new GridLayout(2,2));
		
		add(new JButton("����"));
		add(new JButton("����"));
		add(new JButton("����"));
		add(new JButton("����"));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame3();
	}

}
