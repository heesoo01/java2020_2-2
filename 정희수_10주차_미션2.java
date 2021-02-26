package sec01;
import java.awt.*; //Button, Frame, Textfield
import javax.swing.*; //JButton, JFrmae, JTextfield
import java.awt.event.*;

public class Login extends JFrame{
	JLabel lbl;
	JButton btn1, btn2;
	JPanel jp1,jp2,jp3;
	JTextField txtPW, out;
	
	Login(){
		setTitle("로그인 화면");
		setSize(400,200);
		
		jp1=new JPanel(); jp2=new JPanel(); jp3=new JPanel();
		
		jp1.add(new JLabel("PW"));
		txtPW=new JTextField(20);
		jp1.add(txtPW);
		add(jp1,"North");
		
		btn1=new JButton("로그인");
		btn2=new JButton("취소");
		jp2.add(btn1);
		jp2.add(btn2);
		add(jp2,"Center");
		
		jp3.add(new JLabel());
		out=new JTextField(20);
		jp3.add(out);
		add(jp3,"South");
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String pwd="1234";
				
				if(pwd.equals(txtPW.getText())) {
					out.setText("로그인 성공");
				}else {
					out.setText("로그인 실패");
				}
			}
			
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtPW.setText("");
			}
			
		});
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login(); //PWD="1234"
	}

}
