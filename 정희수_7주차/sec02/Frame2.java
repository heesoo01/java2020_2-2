package sec02;
import java.awt.FlowLayout;//��ġ������

import javax.swing.*;//������Ʈ
public class Frame2 extends JFrame {
	Frame2(){
		setTitle("FlowLayoutTest");
		//������Ʈ ����
		//��ġ������ ����
		//FlowLayout f1=new FlowLayout();
		//setLayout(f1);
		setLayout(new FlowLayout());
		
		JButton b1=new JButton("��ư1");
		add(b1);
		//add(new JButton("��ư1");
		add(new JButton("��ư2"));
		add(new JButton("��ư3"));
		add(new JButton("��ư4"));
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame2();
	}

}
