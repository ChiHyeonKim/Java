import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while(true)
		{
			String string = scanner.nextLine();
			int n;
			
			if ( string.equals("exit"))
			{
				System.out.println("종료합니다...");
				break;
			}

			else
			{
				StringTokenizer st = new StringTokenizer(string, " ");
				n = st.countTokens();
				System.out.println("어절 개수는 "+n);
				continue;
			}
		}
	}
}
