public class Box {
	private int width, height; //�ڽ��� �ʺ�� ����
	private char fillChar; //�ڽ��� �׸��µ� ����ϴ� ����
	
	public Box(){ //�Ű� ���� ���� ������
		this.width= 10; this.height = 1;
	}
	
	public Box(int width, int height){	//�ʺ�� ������ 2 �Ű������� ���� ������
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
		Box a = new Box(); //10x1 �簢��
		Box b = new Box(20, 3); //20x3 �簢��
		a.fill('*');
		b.fill('%');
		a.draw();
		b.draw();
	}
}