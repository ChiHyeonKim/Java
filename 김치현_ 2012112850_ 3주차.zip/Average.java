import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// 각 과목의 점수들을 저장하는 변수 선언
		int compgrade, proggrade, mathgrade, archgrade;
		// 과목 점수들의 평균을 저장하는 변수를 선언
		double avg;
		// 각 과목의 점수 입력
		System.out.println("각 과목의 점수를 입력해주세요");
		// 영작문 과목의 점수 입력
		System.out.println("영작문:");
		compgrade = scanner.nextInt();
		// 프로그래밍 과목의 점수 입력
		System.out.println("프로그래밍:");
		proggrade = scanner.nextInt();
		// 이산수학 과목의 점수 입력
		System.out.println("이산수학:");
		mathgrade = scanner.nextInt();
		// 컴퓨터구조 과목의 점수 입력
		System.out.println("컴퓨터구조:");
		archgrade = scanner.nextInt();
		// 과목 점수들의 평균을 계산
		avg = ( ((double)compgrade + (double)proggrade + (double)mathgrade + (double)archgrade) / 4 );
		// 각 과목의 점수와 평균 점수 출력
		System.out.println("영작문 과목의 점수:\t" + compgrade);
		System.out.println("프로그래밍 과목의 점수:\t" + proggrade);
		System.out.println("이산수학 과목의 점수:\t" + mathgrade);
		System.out.println("컴퓨터구조 과목의 점수:\t" + archgrade);
		System.out.println("평균점수:\t" + avg);

	}

}
