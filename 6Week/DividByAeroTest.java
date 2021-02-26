package app;
import java.util.*;
public class DividByAeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("피젯수:");
		x=s.nextInt();
		System.out.println("젯수:");
		y=s.nextInt();
		
		try {
			int result=x/y;
			System.out.println("결과:"+result);
			
		} catch (ArithmeticException e) { //ctrl+1
			// TODO: handle exception
			System.out.println("0으로 나눌 수 없습니다.");
		}
		finally {
			s.close();
		}

	}

}
