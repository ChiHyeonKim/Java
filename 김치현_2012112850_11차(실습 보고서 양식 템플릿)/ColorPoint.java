class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public Point(){}
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

public class ColorPoint extends Point {
	String color;
	
	public ColorPoint(int i, int j, String string) {
		super(i, j);
		color = string;
	}
	void setColor(String s){ color = s;}
	void setPoint(int i, int j){
		move(i, j);
	}
	void show(){
		System.out.println(color+"»öÀ¸·Î ("+getX()+","+getY()+")");
	}
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5,"YELLOW");
		cp.setPoint(10, 20);
		cp.setColor("GREEN");
		cp.show();
	}
}
