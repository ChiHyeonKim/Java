import java.util.*;

class game{
	static int user, com;	//���� ,��ǻ��
	
	static void Gawi(){
		if(com == 1){
			System.out.println("����� ���� : ��ǻ�� ����");
			System.out.println("�����ϴ�.");
		}
		
		else if(com == 2){
			System.out.println("����� ���� : ��ǻ�� ����");
			System.out.println("�����ϴ�.");
		}
		
		else if (com == 3){
			System.out.println("����� ���� : ��ǻ�� ��");
			System.out.println("�̰���ϴ�.");
		}
	}
	
	static void Bawi(){
		if(com == 1){
			System.out.println("����� ���� : ��ǻ�� ����");
			System.out.println("�̰���ϴ�.");
		}
		
		else if(com == 2){
			System.out.println("����� ���� : ��ǻ�� ����");
			System.out.println("�����ϴ�.");
		}
		
		else if (com == 3){
			System.out.println("����� ���� : ��ǻ�� ��");
			System.out.println("�����ϴ�.");
		}
	}
	
	static void Bo(){
		if(com == 1){
			System.out.println("����� �� : ��ǻ�� ����");
			System.out.println("�����ϴ�.");
		}
		
		else if(com == 2){
			System.out.println("����� �� : ��ǻ�� ����");
			System.out.println("�̰���ϴ�.");

		}
		
		else if (com == 3){
			System.out.println("����� �� : ��ǻ�� ��");
			System.out.println("�����ϴ�.");
		}
	}
	
}

public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true){
		game.com = (int) Math.round(Math.random() * 2 + 1); // ��ǻ���� ���� ���� �� ����
			
		System.out.print("����(1), ����(2), ��(3), ������(4)>>");
		game.user = scanner.nextInt();	// ������ ���� ���� �� �Է�
		
		if(game.user == 1){
			game.Gawi();
			continue;
			}
		else if(game.user == 2){
			game.Bawi();
			continue;
			}
		else if(game.user == 3){
			game.Bo();
			continue;
		}
		else if(game.user == 4){
			break;
		}
		}
	}
}
