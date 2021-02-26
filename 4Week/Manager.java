package sec2;

public class Manager extends Member{
	double bonus;
	Manager(String name, double paycheck, double bonus){
		super(name,paycheck);
		this.bonus=bonus;
	}
	
	@Override
	double checkMoney(double paycheck) {
		return 1.2*paycheck+bonus;
	}

}
