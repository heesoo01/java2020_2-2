package app;
import java.util.*;
public class DividByAeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("������:");
		x=s.nextInt();
		System.out.println("����:");
		y=s.nextInt();
		
		try {
			int result=x/y;
			System.out.println("���:"+result);
			
		} catch (ArithmeticException e) { //ctrl+1
			// TODO: handle exception
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		finally {
			s.close();
		}

	}

}
