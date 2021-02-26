package sec1;

public class Point {
	int x,y;//멤버변수들은 숨겨놓고
	
	void setPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}

	void showPoint() {
		System.out.println(x+","+y);
	}
}
