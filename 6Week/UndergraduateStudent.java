package sec01;

public class UndergraduateStudent extends Student{
	public UndergraduateStudent(String name) {
		super(name);
	}
	public void computeGrade()
	{
		if(super.getScore()>=70)
			super.grade="통과";
		else
			super.grade="과락";

	}
}
