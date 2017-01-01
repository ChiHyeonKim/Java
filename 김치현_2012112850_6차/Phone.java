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
		System.out.print("�̸��� ��ȭ��ȣ �Է�>>");
		Phone p1 = new Phone(scanner.next(), scanner.next());	//p1 ��ü ���� �� �ʱ�ȭ
		System.out.print("�̸��� ��ȭ��ȣ �Է�>>");
		Phone p2 = new Phone(scanner.next(), scanner.next());	//p2 ��ü ���� �� �ʱ�ȭ
		System.out.println(p1.getName()+"�� ��ȣ "+p1.getTel());	//p1 ���
		System.out.println(p2.getName()+"�� ��ȣ "+p2.getTel());	//p2 ���
		
	}

}
