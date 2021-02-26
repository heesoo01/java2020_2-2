package sec2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=10000.0;
		Member mem = new Member("김직원",3000000);
		Manager man = new Manager("정매니",4000000,100000);
		Executive exe=new Executive("이임원",5000000,200000,100000);
		System.out.println(mem.name+"의 이번달 급여:"+mem.paycheck/a+"만원");
		System.out.println(man.name+"의 이번달 급여:"+man.paycheck/a+"만원");
		System.out.println(exe.name+"의 이번달 급여:"+exe.paycheck/a+"만원");
		System.out.println("----------------------");
		System.out.println(mem.name+"의 다음달 급여:"+mem.checkMoney(mem.paycheck)/a+"만원");
		System.out.println(man.name+"의 다음달 급여:"+man.checkMoney(man.paycheck)/a+"만원");
		System.out.println(exe.name+"의 다음달 급여:"+exe.checkMoney(exe.paycheck)/a+"만원");

	}

}
