package sec1;

public class Student extends People{
	int stuNo;
	Student(String name, String ssn,int stuNo){
		super(name,ssn);//����� ȣ��
		this.stuNo=stuNo;
	}

}
