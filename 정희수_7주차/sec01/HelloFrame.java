package sec01;
import javax.swing.*;
public class HelloFrame extends JFrame{
	//������
	HelloFrame(){
		setTitle("ù ��° ������ ���α׷�");
		setSize(300,100);
		//��ư ������Ʈ ���� :JButton(swing�� ��������)
		JButton btn1=new JButton("Ȯ��");
		add(btn1);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü ����
		HelloFrame f=new HelloFrame();
		//new HelloFrame();

	}

}
