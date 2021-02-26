package sec2;

public class Member {
	String name;
	double paycheck;
	
	Member(String name,double paycheck){
		this.name=name;
		this.paycheck=paycheck;
	}
	double checkMoney(double paycheck) {
		return 1.3*paycheck;
	}

}
