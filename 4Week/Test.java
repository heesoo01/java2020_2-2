package sec2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=10000.0;
		Member mem = new Member("������",3000000);
		Manager man = new Manager("���Ŵ�",4000000,100000);
		Executive exe=new Executive("���ӿ�",5000000,200000,100000);
		System.out.println(mem.name+"�� �̹��� �޿�:"+mem.paycheck/a+"����");
		System.out.println(man.name+"�� �̹��� �޿�:"+man.paycheck/a+"����");
		System.out.println(exe.name+"�� �̹��� �޿�:"+exe.paycheck/a+"����");
		System.out.println("----------------------");
		System.out.println(mem.name+"�� ������ �޿�:"+mem.checkMoney(mem.paycheck)/a+"����");
		System.out.println(man.name+"�� ������ �޿�:"+man.checkMoney(man.paycheck)/a+"����");
		System.out.println(exe.name+"�� ������ �޿�:"+exe.checkMoney(exe.paycheck)/a+"����");

	}

}
