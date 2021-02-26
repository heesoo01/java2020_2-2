package sec01;
import java.util.*;
public class Mission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> dic=new HashMap<>();
		Scanner s=new Scanner(System.in);
		dic.put("정희수","01092570568");
		dic.put("가나다","01092572345");
		dic.put("성이름","01092577654");
		while(true) {
			System.out.print("1.전화번호부 전체출력 2.추가 3.삭제 4.끝");
			int t=s.nextInt();
			if(t==1) {
				for(String k:dic.keySet()) {
					String v=dic.get(k);
					System.out.println(k+":"+v);
				}
			}
			if(t==2) {
				System.out.print("추가 이름:");
				String name=s.next();
				System.out.println("추가 번호:");
				String num=s.next();
				dic.put(name,num);
			}
			if(t==3) {
				System.out.print("삭제할 이름:");
				dic.remove(s.next());
			}
			if(t==4) {
				System.out.println("끝!");
				break;
			}
		
		}

	}

}
