import java.util.*;

class game{
	static int user, com;	//유저 ,컴퓨터
	
	static void Gawi(){
		if(com == 1){
			System.out.println("사용자 가위 : 컴퓨터 가위");
			System.out.println("비겼습니다.");
		}
		
		else if(com == 2){
			System.out.println("사용자 가위 : 컴퓨터 바위");
			System.out.println("졌습니다.");
		}
		
		else if (com == 3){
			System.out.println("사용자 가위 : 컴퓨터 보");
			System.out.println("이겼습니다.");
		}
	}
	
	static void Bawi(){
		if(com == 1){
			System.out.println("사용자 바위 : 컴퓨터 가위");
			System.out.println("이겼습니다.");
		}
		
		else if(com == 2){
			System.out.println("사용자 바위 : 컴퓨터 바위");
			System.out.println("비겼습니다.");
		}
		
		else if (com == 3){
			System.out.println("사용자 바위 : 컴퓨터 보");
			System.out.println("졌습니다.");
		}
	}
	
	static void Bo(){
		if(com == 1){
			System.out.println("사용자 보 : 컴퓨터 가위");
			System.out.println("졌습니다.");
		}
		
		else if(com == 2){
			System.out.println("사용자 보 : 컴퓨터 바위");
			System.out.println("이겼습니다.");

		}
		
		else if (com == 3){
			System.out.println("사용자 보 : 컴퓨터 보");
			System.out.println("비겼습니다.");
		}
	}
	
}

public class Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true){
		game.com = (int) Math.round(Math.random() * 2 + 1); // 컴퓨터의 가위 바위 보 생성
			
		System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
		game.user = scanner.nextInt();	// 유저의 가위 바위 보 입력
		
		if(game.user == 1){
			game.Gawi();
			continue;
			}
		else if(game.user == 2){
			game.Bawi();
			continue;
			}
		else if(game.user == 3){
			game.Bo();
			continue;
		}
		else if(game.user == 4){
			break;
		}
		}
	}
}
