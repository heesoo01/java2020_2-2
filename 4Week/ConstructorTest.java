package sec1;
class AA{
	AA(){
		System.out.println("������AA");
	}
	AA(int x){
		System.out.println("������AA"+x);
	}
}
class BB extends AA{
	BB(){
		//super(10);
		System.out.println("������BB");
	}
	BB(int x){
		super(x);
		System.out.println("������BB"+x);
	}
}
public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b = new BB(3);
		

	}

}
