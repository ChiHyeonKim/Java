import java.util.Scanner;

class Rect{
	private int width, height;
	
	public Rect(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public int getArea(){
		return width*height;
	}
	
}
public class RectArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rect r[] = new Rect[4];	//r 객체 배열 생성
		int sum=0;	//각 사각형의 합을 담는 변수
		
		for(int i=0; i<r.length; i++){
			System.out.print((i+1) + " 너비와 높이>>");
			r[i] = new Rect(scanner.nextInt(), scanner.nextInt() );	//사각형 너비 높이 입력
			sum += (r[i].getArea());	//합 변수에 각 사각형의 넓이 저장
		}
		
		System.out.println("저장하였습니다...");
		System.out.println("사각형의 전체 합은 "+sum);
	}
}
