package sec1;
class AA{
	AA(){
		System.out.println("持失切AA");
	}
	AA(int x){
		System.out.println("持失切AA"+x);
	}
}
class BB extends AA{
	BB(){
		//super(10);
		System.out.println("持失切BB");
	}
	BB(int x){
		super(x);
		System.out.println("持失切BB"+x);
	}
}
public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BB b = new BB(3);
		

	}

}
