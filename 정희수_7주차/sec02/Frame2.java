package sec02;
import java.awt.FlowLayout;//배치관리자

import javax.swing.*;//컴포넌트
public class Frame2 extends JFrame {
	Frame2(){
		setTitle("FlowLayoutTest");
		//컴포넌트 생성
		//배치관리자 변경
		//FlowLayout f1=new FlowLayout();
		//setLayout(f1);
		setLayout(new FlowLayout());
		
		JButton b1=new JButton("버튼1");
		add(b1);
		//add(new JButton("버튼1");
		add(new JButton("버튼2"));
		add(new JButton("버튼3"));
		add(new JButton("버튼4"));
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame2();
	}

}
