package sec01;
import java.util.Scanner;

public class PolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k,t;
		Polygon p = new Polygon();
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("1.�ﰢ��  2.���簢��  3.���簢��  0.����");
			n=s.nextInt();
			if(n==1) {
				System.out.println("�غ�:");
				k=s.nextInt();
				System.out.println("����:");
				t=s.nextInt();
				System.out.println("����:"+p.area(k,t)/2);				
			}
			if(n==2) {
				System.out.println("�Ѻ� ����:");
				k=s.nextInt();
				System.out.println("����:"+p.area(k));	
			}
			if(n==3) {
				System.out.println("���� ����:");
				k=s.nextInt();
				System.out.println("���� ����:");
				t=s.nextInt();
				System.out.println("����:"+p.area(k,t));
			}
			if(n==0) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
		s.close();

	}

}
