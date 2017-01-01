import java.util.Scanner;
	public class ComputeGrade
	{
	public static void main(String[] args)
	{
	// 한 과목의 평가 요소들의 점수들을 저장하는 변수들을 선언
	int attendscore;
	int assignmentscore;
	int quizscore;
	int midtermexamscore;
	int finalexamscore;
	// 총점을 저장하는 변수를 선언
	double sum;
	// 학점을 저장하는 변수를 선언
	char grade;
	// 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만들기
	Scanner scan = new Scanner(System.in);
	
	// 사용자로부터 각 평가 요소의 점수를 한 번에 하나씩 입력하라고 요청.
	// 그리고 입력된 점수를 읽기
	System.out.print("출석 점수를 입력:\t\t");
	attendscore = scan.nextInt();
	System.out.print("과제 점수를 입력:\t\t");
	assignmentscore = scan.nextInt();
	System.out.print("수시 점수를 입력:\t\t");
	quizscore = scan.nextInt();
	System.out.print("중간 점수를 입력:\t\t");
	midtermexamscore = scan.nextInt();
	System.out.print("기말 점수를 입력:\t\t");
	finalexamscore = scan.nextInt();

	// 총점을 계산
	sum = (attendscore*0.10) + (assignmentscore*0.40) + (quizscore*0.10) + (midtermexamscore*0.20) + (finalexamscore*0.20);
	// 학점을 결정
	if(sum >= 90)        // 90 이상
		grade = 'A';
	else if(sum >= 80) // 80 이상 90 미만
		grade = 'B';
	else if(sum >= 70) // 70 이상 80 이만
		grade = 'C';
	else if(sum >= 60) // 60 이상 70 이만
		grade = 'D';
	else grade = 'F';    // 60 이만
	
	// 총점과 학점을 출력
	System.out.println("총점:\t" + sum);
	System.out.println("학점:\t" + grade);
	
	}
}
