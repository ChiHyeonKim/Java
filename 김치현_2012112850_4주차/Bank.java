import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int account = 1234567890;
		int balance = 800000;
		int button=0; //번호를 키보드에서 입력받아 switch문에서 사용하는 변수
		boolean flag = true; //반복문을 빠져나가기 위한 변수
		int deposit, withdraw, transfername, transfermoney; //입, 출금, 계좌이체 관련 변수 선언
	
	System.out.println("1. 계좌조회\n2. 입금\n3. 출금\n4. 계좌이체\n0. 종료\n");
	
	while(flag){
		
		System.out.println("원하시는 서비스의 번호를 입력하세요:");
		button = scan.nextInt();
		
		switch (button) {
	
			//0을 입력한 경우 프로그램 종료
			case 0:
			flag = false;
			break;
			
			//1을 입력한 경우
			case 1:
				System.out.println("계좌번호:"+account);
				System.out.println("보유금액:"+balance);
				break;
				
			//2를 입력한 경우	
			case 2:
				System.out.println("입금하실 금액을 입력하세요:");
				deposit = scan.nextInt();
				balance = balance + deposit;	//잔액에 입금액을 더함
				break;
				
			//3을 입력한 경우	
			case 3:
				System.out.println("출금하실 금액을 입력하세요:");
				withdraw = scan.nextInt();
				balance = balance - withdraw;	//잔액에 인출액을 뺌
				break;
				
			//4를 입력한 경우
			case 4:
				System.out.println("이체할 계좌번호를 입력하세요:");
				transfername = scan.nextInt();
				System.out.println("이체할 금액을 입력하세요:");
				transfermoney = scan.nextInt();
				System.out.println("계좌번호 "+transfername+" 으로 "+transfermoney+"원 이체되었습니다.");
				balance = balance - transfermoney; //잔액에서 이체금액 뺌
				break;
			}
		}
	//루프 빠져나감
	System.out.println("프로그램을 종료합니다.");
	scan.close();
	}
}
