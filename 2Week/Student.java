package sec01;

public class Student {
	//�ʵ弱��
	//����,�̸�,����,�а�
	String nation="���ѹα�";
	String name;
	int age;
	String dept;//�����̸��� �ҹ��ڷ� ����
	
	//������
	Student(String name/*�Ű�����*/, int age){
//		this.name=name;
//		this.age=age;
		this(name,age,"�Ұ�");
	}
	Student(String name, int age, String dept){
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
	
	//�޼ҵ� (������/������)
	void setName(String name) {
		//name=name;(���������� ������쿡�� ���������� �켱��)
		this.name=name;
	}//set->����(�����ڸ޼ҵ�)
	void setAge(int age) {
		this.age=age;
	}
	void setDept(String dept) {
		this.dept=dept;
	}
	
	//�����ڸ޼ҵ�
	String getName() {
		return name;//��������̸� ���� ���
	}
	int getAge() {
		return age;
	}
	String getDept() {
		return dept;
	}
	void show() {
		System.out.println("name:"+getName());
		System.out.println("age:"+getAge());
		System.out.println("nation:"+nation);
		System.out.println("dept:"+getDept());
	}
	

}
