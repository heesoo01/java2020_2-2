package sec01;

abstract class Student {
	protected int type;
	protected String name;
	protected int score;
	protected String grade;
	
	public Student (String name) {
		this.name=name;
	}
	abstract public void computeGrade();
	
	public String showInfo() {
		String result="소속\t이름\t점수\t학점\n";
		if(type==1)
			result+="학부생";
		else
			result+="대학원생";
		result+="\t"+getName();
		result+="\t"+getScore();
		result+="\t"+getGrade();
		return result;
	}
	public String getGrade() {
		// TODO Auto-generated method stub
		return grade;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public int getScore() {
		// TODO Auto-generated method stub
		return score;
	}
	public void setType(int type) {
		this.type=type;
	}
	public void setScore(int score) {
		this.score=score;
	}


}
