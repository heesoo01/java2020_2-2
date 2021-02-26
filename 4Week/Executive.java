package sec2;

public class Executive extends Manager{
	int option;
	Executive(String name, int paycheck, int bonus, int option){
		super(name,paycheck,bonus);
		this.option=option;
	}
	
	@Override
	double checkMoney(double paycheck) {
		return 1.1*paycheck+bonus+option;
	}

}
