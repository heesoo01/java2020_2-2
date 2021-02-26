package sec1;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		super.areaCircle(r);
		double area = Math.PI*r*r;
		return area;
	}

}
