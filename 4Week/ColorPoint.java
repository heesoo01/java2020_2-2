package sec1;

public class ColorPoint extends Point{
	String color;
	void setColor(String color) {
		
		this.color=color;
	}
	void showColorPoint()
	{
		System.out.println(color);
		showPoint();
	}
}
