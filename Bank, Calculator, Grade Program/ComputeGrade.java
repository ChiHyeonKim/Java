import java.util.Scanner;
	public class ComputeGrade
	{
	public static void main(String[] args)
	{
	// �� ������ �� ��ҵ��� �������� �����ϴ� �������� ����
	int attendscore;
	int assignmentscore;
	int quizscore;
	int midtermexamscore;
	int finalexamscore;
	// ������ �����ϴ� ������ ����
	double sum;
	// ������ �����ϴ� ������ ����
	char grade;
	// Ű����κ��� �Է��ϴ� �����͸� �б� ���� Scanner ��ü�� �����
	Scanner scan = new Scanner(System.in);
	
	// ����ڷκ��� �� �� ����� ������ �� ���� �ϳ��� �Է��϶�� ��û.
	// �׸��� �Էµ� ������ �б�
	System.out.print("�⼮ ������ �Է�:\t\t");
	attendscore = scan.nextInt();
	System.out.print("���� ������ �Է�:\t\t");
	assignmentscore = scan.nextInt();
	System.out.print("���� ������ �Է�:\t\t");
	quizscore = scan.nextInt();
	System.out.print("�߰� ������ �Է�:\t\t");
	midtermexamscore = scan.nextInt();
	System.out.print("�⸻ ������ �Է�:\t\t");
	finalexamscore = scan.nextInt();

	// ������ ���
	sum = (attendscore*0.10) + (assignmentscore*0.40) + (quizscore*0.10) + (midtermexamscore*0.20) + (finalexamscore*0.20);
	// ������ ����
	if(sum >= 90)        // 90 �̻�
		grade = 'A';
	else if(sum >= 80) // 80 �̻� 90 �̸�
		grade = 'B';
	else if(sum >= 70) // 70 �̻� 80 �̸�
		grade = 'C';
	else if(sum >= 60) // 60 �̻� 70 �̸�
		grade = 'D';
	else grade = 'F';    // 60 �̸�
	
	// ������ ������ ���
	System.out.println("����:\t" + sum);
	System.out.println("����:\t" + grade);
	
	}
}
