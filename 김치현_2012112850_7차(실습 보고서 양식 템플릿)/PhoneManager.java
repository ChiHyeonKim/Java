import java.util.*;

class Phone{
	String name, tel;	//이름과 전화번호를 입력받는 변수
	
	Phone(String a, String b){	//2개의 값을 전달 받는 Phone 생성자
		this.name = a;
		this.tel = b;
	}
	
	public String getName(){	//name 값을 반환하는 메소드
		return this.name;
	}
	
	public String getTel(){	//tel 값을 반환하는 메소드
		return this.tel;
	}
}

public class PhoneManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count=0;	//인원수를 저장하는 변수
		System.out.print("인원수>>");
		count = scanner.nextInt();
		Phone p[] = new Phone[count];	//인원수 대로 객체 생성
		Phone answer[] = new Phone[count]; //입력한 답을 저장하는 배열

		for(int i=0; i<p.length; i++){	//이름과 전화번호를 입력받아 객체에 저장
			System.out.print("이름과 전화번호 (번호는 연속적으로 입력)>>");
			p[i] = new Phone(scanner.next(), scanner.next() );
		}
		
		System.out.println("저장되었습니다...");
		
		boolean a = true;	//무한루프를 위한 boolean 변수
		
		while(a){	//exit를 입력받으면 무한루프 종료. 아니면 무한루프 실행
			System.out.print("검색할 이름>>");
			String search = scanner.next();
			
			for(int j=0; j<p.length; j++){	
				if( search.compareTo(p[j].name) == 0 ) {	//입력값과 저장값이 같은 경우
					System.out.println(p[j].getName()+"의 번호는 "+p[j].getTel()+" 입니다.");
					break;
				}
				
				else if( search.compareTo(p[j].name) != 0 ) {
					if(search.compareTo("exit") == 0){		//입력값이 exit인 경우
						a = false;	//무한루프 종료를 위해 boolean을 false로 만듬
						break;
					}		
					
					else if( j == p.length-1 ) {
					System.out.println(search+" 이(가) 없습니다.");	//입력값이 저장값과 틀린 경우
					break;
					}
					
					else continue;
				}
	
			}
		}
	}
}
