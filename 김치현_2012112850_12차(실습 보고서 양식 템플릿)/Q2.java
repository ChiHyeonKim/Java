import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String token, token2, string;
		int count, count2, sum=0;
		
		string = scanner.nextLine(); //문장 입력 받기
		StringTokenizer st = new StringTokenizer(string, "+"); //입력 받은 문장을 +로 분리
		count = st.countTokens(); //+로 분리한 토큰 수 계산
		
		for(int i=0; i<count; i++ ){
			token = st.nextToken();	//하나의 토큰 불러오기
			StringTokenizer st2 = new StringTokenizer(token, " "); //불러온 하나의 토큰을 공백을 기준으로 분리하기 
			count2 = st2.countTokens(); //공백으로 분리한 토큰 수 계산
			for(int j=0; j<count2; j++){
				token2 = st2.nextToken(); //공백으로 분리된 토큰을 하나씩 불러오기
				sum += Integer.parseInt(token2); //정수를 합에 저장하기
			}
		}
		
		System.out.println("합은 "+sum);
	}
}
