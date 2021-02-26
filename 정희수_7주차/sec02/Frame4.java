package sec02;
import java.awt.*;
import javax.swing.*;

public class Frame4 extends JFrame{
	public Frame4()
	{
		int i;
		setTitle("My Piano");
		String a[]= {"도","레","미","파","솔","라","시","도"};
		setSize(a.length*100,500);
		setLayout(new GridLayout(1,a.length));
		for(i=0;i<a.length;i++) {
			add(new JButton(a[i]));
		}
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame4();
		
	}

}
