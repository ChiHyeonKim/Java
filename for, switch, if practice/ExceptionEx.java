import java.util.*;

public class ExceptionEx {
	public static void main(String[] args) {
		// 1~100������ ������ ���� �� answer�� ����
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // ������Է��� ������ ����
		int count = 1; // �õ�Ƚ���� ���� ���� ����
	do {
		try{
			System.out.print("1�� 100������ ���� �Է��ϼ��� :");
			input = new Scanner(System.in).nextInt(); //�����Է�
		}	
		//����ó��
		catch(InputMismatchException e){
			System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� ���� �Է����ּ���.");
			count++;	//���� �Է� ��� �õ�Ƚ�� ����
			continue;
		}
		if( answer == input ){	//�Է� ���� ������ ���
			System.out.println("������ϴ�.\n�õ�Ƚ���� "+ count +"�� �Դϴ�."); 
			break;
		}
		
		else if (answer < input){ //�Է� ���� ���亸�� ���� ��� 
			System.out.println("�� ���� ���� �Է��ϼ���."); 
			count++;				//�õ� Ƚ�� ����
			continue;
		}
		
		else if (answer > input){	//�Է� ���� ���� ���� ū ���
			System.out.println("�� ū ���� �Է��ϼ���.");
			count++;				//�õ� Ƚ�� ����
			continue;
		}

		} while (true); // ���ѹݺ���
	}
}
