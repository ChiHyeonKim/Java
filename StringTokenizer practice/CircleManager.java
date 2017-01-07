import java.util.*;

class Circle{
	private int x, y, radius;
	public Circle(int x, int y, int radius){
		//��� ���� �ʱ�ȭ
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public String toString(){ //Circle ��ü�� ���ڿ��� ����
		return "("+x+", "+y+") ������"+radius; 
	}
	// �� Circle ��ü�� ������ ��
	public boolean equals(Circle c){
		if(radius == c.radius) return true;
		else return false;
	}
}

public class CircleManager {
	public static void main(String[] args){
		Circle a = new Circle(1, 2, 10);
		Circle b = new Circle(5, 6, 10);
		System.out.println("�� 1:" + a);
		System.out.println("�� 2:" + b);
		
		if(a.equals(b)) System.out.println("���� ���Դϴ�");
		else System.out.println("�ٸ� ���Դϴ�.");	
	}

}