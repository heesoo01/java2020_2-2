package sec01;
import java.util.Scanner;

public class PolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k,t;
		Polygon p = new Polygon();
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("1.삼각형  2.정사각형  3.직사각형  0.종료");
			n=s.nextInt();
			if(n==1) {
				System.out.println("밑변:");
				k=s.nextInt();
				System.out.println("높이:");
				t=s.nextInt();
				System.out.println("넓이:"+p.area(k,t)/2);				
			}
			if(n==2) {
				System.out.println("한변 길이:");
				k=s.nextInt();
				System.out.println("넓이:"+p.area(k));	
			}
			if(n==3) {
				System.out.println("가로 길이:");
				k=s.nextInt();
				System.out.println("세로 길이:");
				t=s.nextInt();
				System.out.println("넓이:"+p.area(k,t));
			}
			if(n==0) {
				System.out.println("종료합니다.");
				break;
			}
		}
		s.close();

	}

}
