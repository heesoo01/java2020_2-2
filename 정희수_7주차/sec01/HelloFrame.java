package sec01;
import javax.swing.*;
public class HelloFrame extends JFrame{
	//생성자
	HelloFrame(){
		setTitle("첫 번째 윈도우 프로그램");
		setSize(300,100);
		//버튼 컴포넌트 생성 :JButton(swing이 갖고있음)
		JButton btn1=new JButton("확인");
		add(btn1);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		HelloFrame f=new HelloFrame();
		//new HelloFrame();

	}

}
