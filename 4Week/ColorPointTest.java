package sec1;

public class ColorPointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.setPoint(10, 20);
		p.showPoint();
		
		ColorPoint cp=new ColorPoint();
		cp.setPoint(20, 30);
		cp.setColor("red");
		cp.showColorPoint();

	}

}
