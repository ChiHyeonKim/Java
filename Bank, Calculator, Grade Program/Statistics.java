// 사용자가 키보드에 입력하는 데이터를 읽기 위해서 Scanner 클래스 사용
import java.util.Scanner;
public class Statistics
 {
	public static void main(String[ ] args)
	{
	// 사용자로부터의 입력 값들을 저장하는 변수들을 선언
	int number1, number2, number3;
	// 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만들기
	Scanner scan = new Scanner(System.in);
	// 입력된 수들의 최댓값, 최솟값, 합계와 평균을 위한 변수들을 선언
	int max, min, sum;
	double avg;
	
	// 변수 sum의 초기값을 0으로 
	sum = 0;
	
	// 사용자로부터 첫 번째 수를 입력하라고 요청. 그리고 입력된 값 읽기
	System.out.print("첫 번째 수를 입력:\t");
	number1 = scan.nextInt();
	// 사용자로부터 두 번째 수를 입력하라고 요청. 그리고 입력된 값 읽기
	System.out.print("두 번째 수를 입력:\t");
	number2 = scan.nextInt();
	//사용자로부터 세 번째 수를 입력하라고 요청. 그리고 입력된 값을 읽기
	System.out.print("세 번째 수를 입력:\t");
	number3 = scan.nextInt();
	
	//최댓값을 계산
	max = number1;
	if (max < number2) max = number2;
	if (max < number3) max = number3;
	
	//최솟값을 계산
	min = number1;
	if (min > number2) min = number2;
	if (min > number3) min = number3;
	
	//합계와 평균을 계산
	sum = number1 + number2 + number3;
	avg = sum / 3.0;
	
	//결과들을 출력
	System.out.println("최대값: " + max);
	System.out.println("최소값: " + min);
	System.out.println("합계: " + sum);
	System.out.println("평균: " + avg);
	}
}

