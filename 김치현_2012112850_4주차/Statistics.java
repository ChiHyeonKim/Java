// ����ڰ� Ű���忡 �Է��ϴ� �����͸� �б� ���ؼ� Scanner Ŭ���� ���
import java.util.Scanner;
public class Statistics
 {
	public static void main(String[ ] args)
	{
	// ����ڷκ����� �Է� ������ �����ϴ� �������� ����
	int number1, number2, number3;
	// Ű����κ��� �Է��ϴ� �����͸� �б� ���� Scanner ��ü�� �����
	Scanner scan = new Scanner(System.in);
	// �Էµ� ������ �ִ�, �ּڰ�, �հ�� ����� ���� �������� ����
	int max, min, sum;
	double avg;
	
	// ���� sum�� �ʱⰪ�� 0���� 
	sum = 0;
	
	// ����ڷκ��� ù ��° ���� �Է��϶�� ��û. �׸��� �Էµ� �� �б�
	System.out.print("ù ��° ���� �Է�:\t");
	number1 = scan.nextInt();
	// ����ڷκ��� �� ��° ���� �Է��϶�� ��û. �׸��� �Էµ� �� �б�
	System.out.print("�� ��° ���� �Է�:\t");
	number2 = scan.nextInt();
	//����ڷκ��� �� ��° ���� �Է��϶�� ��û. �׸��� �Էµ� ���� �б�
	System.out.print("�� ��° ���� �Է�:\t");
	number3 = scan.nextInt();
	
	//�ִ��� ���
	max = number1;
	if (max < number2) max = number2;
	if (max < number3) max = number3;
	
	//�ּڰ��� ���
	min = number1;
	if (min > number2) min = number2;
	if (min > number3) min = number3;
	
	//�հ�� ����� ���
	sum = number1 + number2 + number3;
	avg = sum / 3.0;
	
	//������� ���
	System.out.println("�ִ밪: " + max);
	System.out.println("�ּҰ�: " + min);
	System.out.println("�հ�: " + sum);
	System.out.println("���: " + avg);
	}
}

