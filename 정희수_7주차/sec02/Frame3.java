package sec02;
import java.awt.*;
import javax.swing.*;

public class Frame3 extends JFrame {
	public Frame3() {
		setTitle("GridLayoutTest");
		setSize(300,150);
		setLayout(new GridLayout(2,2));
		
		add(new JButton("지수"));
		add(new JButton("제니"));
		add(new JButton("로제"));
		add(new JButton("리사"));
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame3();
	}

}
