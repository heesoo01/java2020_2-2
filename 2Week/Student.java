package sec01;

public class Student {
	//필드선언
	//국적,이름,나이,학과
	String nation="대한민국";
	String name;
	int age;
	String dept;//변수이름은 소문자로 시작
	
	//생성자
	Student(String name/*매개변수*/, int age){
//		this.name=name;
//		this.age=age;
		this(name,age,"소공");
	}
	Student(String name, int age, String dept){
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
	
	//메소드 (접근자/설정자)
	void setName(String name) {
		//name=name;(지역변수와 같은경우에는 지역변수에 우선권)
		this.name=name;
	}//set->변경(설정자메소드)
	void setAge(int age) {
		this.age=age;
	}
	void setDept(String dept) {
		this.dept=dept;
	}
	
	//접근자메소드
	String getName() {
		return name;//멤버변수이름 직접 사용
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
