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
		Rect r[] = new Rect[4];	//r ��ü �迭 ����
		int sum=0;	//�� �簢���� ���� ��� ����
		
		for(int i=0; i<r.length; i++){
			System.out.print((i+1) + " �ʺ�� ����>>");
			r[i] = new Rect(scanner.nextInt(), scanner.nextInt() );	//�簢�� �ʺ� ���� �Է�
			sum += (r[i].getArea());	//�� ������ �� �簢���� ���� ����
		}
		
		System.out.println("�����Ͽ����ϴ�...");
		System.out.println("�簢���� ��ü ���� "+sum);
	}
}
