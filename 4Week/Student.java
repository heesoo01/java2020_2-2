package sec1;

public class Student extends People{
	int stuNo;
	Student(String name, String ssn,int stuNo){
		super(name,ssn);//명시적 호출
		this.stuNo=stuNo;
	}

}
