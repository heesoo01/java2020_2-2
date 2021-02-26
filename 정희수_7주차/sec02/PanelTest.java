package sec02;
import java.awt.*;
import javax.swing.*;
public class PanelTest extends JFrame {
	public PanelTest() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.pink);
		
		JButton b1=new JButton("OK");
		JButton b2=new JButton("CANCEL");
		
		panel.add(b1);
		panel.add(b2);
		add(panel);
		setSize(300,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelTest();
	}

}
