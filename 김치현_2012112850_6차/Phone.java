import java.util.*;

public class Phone {
	private String name, tel;
	
	public Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	public String getName(){
		return name;
	}
	
	public String getTel(){
		return tel;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름과 전화번호 입력>>");
		Phone p1 = new Phone(scanner.next(), scanner.next());	//p1 객체 생성 및 초기화
		System.out.print("이름과 전화번호 입력>>");
		Phone p2 = new Phone(scanner.next(), scanner.next());	//p2 객체 생성 및 초기화
		System.out.println(p1.getName()+"의 번호 "+p1.getTel());	//p1 출력
		System.out.println(p2.getName()+"의 번호 "+p2.getTel());	//p2 출력
		
	}

}
