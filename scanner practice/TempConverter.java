import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// �־��� ȭ�� �µ��� �����ϴ� ������ ���� ����
		int fahrenheitValue;
		// ���� �µ��� �����ϴ� �Ǽ��� ���� ����
		double Celsius;
		// ȭ�� �µ� �Է�
		System.out.println("ȭ�� �µ��� �Է����ּ���:");
		fahrenheitValue = scanner.nextInt();
		// ȭ�� �µ��� ���� �µ��� �ٲٰ� �� ���� ���� �µ��� ��Ÿ���� ������ ����
		Celsius = ((double)5/(double)9) * (fahrenheitValue - 32);
		// ȭ�� �µ��� �����ϴ� ���� �µ� ���
		System.out.println("ȭ�� �µ�:\t" + fahrenheitValue);
		System.out.println("���� �µ�:\t" + Celsius);		
	}
}
