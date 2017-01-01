class Circle {
	private int radius;
	public Circle(int radius) { this.radius = radius; }
	public int getRadius() { return radius; }
}

class NamedCircle extends Circle{
	String name;
	NamedCircle(int a, String b){
		super(a);
		name = b;
	}
	void show(){
		System.out.println(name+" Size is "+getRadius());
	}
}

public class Q3 {
	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
	}
}
