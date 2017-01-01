import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 주어진 화씨 온도를 저장하는 정수형 변수 선언
		int fahrenheitValue;
		// 섭씨 온도를 저장하는 실수형 변수 선언
		double Celsius;
		// 화씨 온도 입력
		System.out.println("화씨 온도를 입력해주세요:");
		fahrenheitValue = scanner.nextInt();
		// 화씨 온도를 섭씨 온도로 바꾸고 그 값을 섭씨 온도를 나타내는 변수에 저장
		Celsius = ((double)5/(double)9) * (fahrenheitValue - 32);
		// 화씨 온도와 대응하는 섭씨 온도 출력
		System.out.println("화씨 온도:\t" + fahrenheitValue);
		System.out.println("섭씨 온도:\t" + Celsius);		
	}
}
