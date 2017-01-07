import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		
		System.out.print("빈칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F)>>");
		String s = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		int count = st.countTokens();
		
		for(int i=0; i<count; i++){
			String token = st.nextToken();
			a.add(token);
		}
		
		for(int i=0; i<count; i++){
			String name = a.get(i);
			
			switch(name){
			case "A":
				System.out.print("4.0 ");
				break;
			case "B":
				System.out.print("3.0 ");
				break;
			case "C":
				System.out.print("2.0 ");
				break;
			case "D":
				System.out.print("1.0 ");
				break;
			case "F":
				System.out.print("0.0 ");
				break;
			}
		}
	}

}
