package sec01;

public class GraduateStudent extends Student {
	public GraduateStudent(String name) {
		super(name);
	}
	public void computeGrade() {
		if(super.getScore()>=80)
			super.grade="통과";
		else
			super.grade="과락";
		
	}
}
