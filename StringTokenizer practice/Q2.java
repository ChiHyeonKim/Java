import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String token, token2, string;
		int count, count2, sum=0;
		
		string = scanner.nextLine(); //���� �Է� �ޱ�
		StringTokenizer st = new StringTokenizer(string, "+"); //�Է� ���� ������ +�� �и�
		count = st.countTokens(); //+�� �и��� ��ū �� ���
		
		for(int i=0; i<count; i++ ){
			token = st.nextToken();	//�ϳ��� ��ū �ҷ�����
			StringTokenizer st2 = new StringTokenizer(token, " "); //�ҷ��� �ϳ��� ��ū�� ������ �������� �и��ϱ� 
			count2 = st2.countTokens(); //�������� �и��� ��ū �� ���
			for(int j=0; j<count2; j++){
				token2 = st2.nextToken(); //�������� �и��� ��ū�� �ϳ��� �ҷ�����
				sum += Integer.parseInt(token2); //������ �տ� �����ϱ�
			}
		}
		
		System.out.println("���� "+sum);
	}
}
