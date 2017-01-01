import java.util.*;

public class ExceptionEx {
	public static void main(String[] args) {
		// 1~100사이의 임의의 값을 얻어서 answer에 저장
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 1; // 시도횟수를 세기 위한 변수
	do {
		try{
			System.out.print("1과 100사이의 값을 입력하세요 :");
			input = new Scanner(System.in).nextInt(); //숫자입력
		}	
		//예외처리
		catch(InputMismatchException e){
			System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
			count++;	//예외 입력 경우 시도횟수 증가
			continue;
		}
		if( answer == input ){	//입력 값이 정답일 경우
			System.out.println("맞췄습니다.\n시도횟수는 "+ count +"번 입니다."); 
			break;
		}
		
		else if (answer < input){ //입력 값이 정답보다 작을 경우 
			System.out.println("더 작은 수를 입력하세요."); 
			count++;				//시도 횟수 증가
			continue;
		}
		
		else if (answer > input){	//입력 값이 정답 보다 큰 경우
			System.out.println("더 큰 수를 입력하세요.");
			count++;				//시도 횟수 증가
			continue;
		}

		} while (true); // 무한반복문
	}
}
