import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// �� ������ �������� �����ϴ� ���� ����
		int compgrade, proggrade, mathgrade, archgrade;
		// ���� �������� ����� �����ϴ� ������ ����
		double avg;
		// �� ������ ���� �Է�
		System.out.println("�� ������ ������ �Է����ּ���");
		// ���۹� ������ ���� �Է�
		System.out.println("���۹�:");
		compgrade = scanner.nextInt();
		// ���α׷��� ������ ���� �Է�
		System.out.println("���α׷���:");
		proggrade = scanner.nextInt();
		// �̻���� ������ ���� �Է�
		System.out.println("�̻����:");
		mathgrade = scanner.nextInt();
		// ��ǻ�ͱ��� ������ ���� �Է�
		System.out.println("��ǻ�ͱ���:");
		archgrade = scanner.nextInt();
		// ���� �������� ����� ���
		avg = ( ((double)compgrade + (double)proggrade + (double)mathgrade + (double)archgrade) / 4 );
		// �� ������ ������ ��� ���� ���
		System.out.println("���۹� ������ ����:\t" + compgrade);
		System.out.println("���α׷��� ������ ����:\t" + proggrade);
		System.out.println("�̻���� ������ ����:\t" + mathgrade);
		System.out.println("��ǻ�ͱ��� ������ ����:\t" + archgrade);
		System.out.println("�������:\t" + avg);

	}

}
