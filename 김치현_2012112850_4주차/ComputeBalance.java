import java.util.Scanner;

public class ComputeBalance
{
		public static void main(String[] args)
		{
			// ����ڷκ��� �־��� �����͸� �����ϴ� �������� �����Ѵ�
			int cardnumber, preprice, sumprice, sumrefund, max, sum; 
			// Ű����κ��� �Է��ϴ� �����͸� �б� ���� Scanner ��ü�� �����.
			Scanner scan = new Scanner(System.in);
			
			// ����ڷκ��� �����͸� �� ���� �ϳ��� �Է��϶�� ��û�Ѵ�.
			// �׸��� �Էµ� ���� �д´�.
			System.out.print("�ſ�ī�� ��ȣ�� �Է��ϼ���:\t");
			cardnumber = scan.nextInt();
			System.out.print("������ ���ݾ��� �Է��ϼ���:\t");
			preprice = scan.nextInt();
			System.out.print("�ѱ��ž��� �Է��ϼ���:\t");
			sumprice = scan.nextInt();
			System.out.print("��ȯ�Ҿ��� �Է��ϼ���:\t");
			sumrefund = scan.nextInt();
			System.out.print("�ſ��ѵ��� �Է��ϼ���:\t");
			max = scan.nextInt();

			// �� �ܰ� ����Ѵ�
			sum = preprice + sumprice - sumrefund;

			// �ſ�ī���� ����ѵ����� �ʰ��ߴ����� �����ϰ� ����Ѵ�
			if(max<sum)
				System.out.println(cardnumber+"�� "+"�ſ�ī���ѵ��ʰ�");
			else
				System.out.println(cardnumber+"�� "+"�� �ܰ�:"+sum);
		}
}
