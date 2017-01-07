public class Box {
	private int width, height; //박스의 너비와 높이
	private char fillChar; //박스를 그리는데 사용하는 문자
	
	public Box(){ //매개 변수 없는 생성자
		this.width= 10; this.height = 1;
	}
	
	public Box(int width, int height){	//너비와 높이의 2 매개변수를 가진 생성자
		this.width= width;
		this.height = height;
	}
	
	public void draw(){
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				System.out.print(fillChar);
			}
				System.out.println();
		}
	}
	
	public void fill(char c){
		fillChar = c;
	}
	
	public static void main(String[] args) {
		Box a = new Box(); //10x1 사각형
		Box b = new Box(20, 3); //20x3 사각형
		a.fill('*');
		b.fill('%');
		a.draw();
		b.draw();
	}
}