package sec01;

public class Polygon {
	int wide;
	int height;
	double area;
	double area(int wide, int height) {
		this.wide=wide;
		this.height=height;
		this.area=wide*height;
		return area;
	}
	double area(int wide) {
		this.wide=wide;
		this.area=wide*wide;
		return area;
	}
	

}
