import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int account = 1234567890;
		int balance = 800000;
		int button=0; //��ȣ�� Ű���忡�� �Է¹޾� switch������ ����ϴ� ����
		boolean flag = true; //�ݺ����� ���������� ���� ����
		int deposit, withdraw, transfername, transfermoney; //��, ���, ������ü ���� ���� ����
	
	System.out.println("1. ������ȸ\n2. �Ա�\n3. ���\n4. ������ü\n0. ����\n");
	
	while(flag){
		
		System.out.println("���Ͻô� ������ ��ȣ�� �Է��ϼ���:");
		button = scan.nextInt();
		
		switch (button) {
	
			//0�� �Է��� ��� ���α׷� ����
			case 0:
			flag = false;
			break;
			
			//1�� �Է��� ���
			case 1:
				System.out.println("���¹�ȣ:"+account);
				System.out.println("�����ݾ�:"+balance);
				break;
				
			//2�� �Է��� ���	
			case 2:
				System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ���:");
				deposit = scan.nextInt();
				balance = balance + deposit;	//�ܾ׿� �Աݾ��� ����
				break;
				
			//3�� �Է��� ���	
			case 3:
				System.out.println("����Ͻ� �ݾ��� �Է��ϼ���:");
				withdraw = scan.nextInt();
				balance = balance - withdraw;	//�ܾ׿� ������� ��
				break;
				
			//4�� �Է��� ���
			case 4:
				System.out.println("��ü�� ���¹�ȣ�� �Է��ϼ���:");
				transfername = scan.nextInt();
				System.out.println("��ü�� �ݾ��� �Է��ϼ���:");
				transfermoney = scan.nextInt();
				System.out.println("���¹�ȣ "+transfername+" ���� "+transfermoney+"�� ��ü�Ǿ����ϴ�.");
				balance = balance - transfermoney; //�ܾ׿��� ��ü�ݾ� ��
				break;
			}
		}
	//���� ��������
	System.out.println("���α׷��� �����մϴ�.");
	scan.close();
	}
}
