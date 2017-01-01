class SuperClass2{
	int value;
	SuperClass2(){}	//SuperClass2의 기본 생성자 
	SuperClass2(int i){value = i;}
	void output() {System.out.println("SuperClass2:" + value);}	//}추가
}

class SubClass2 extends SuperClass2{
	int value;
	SubClass2(int i){value = i;}
	void output() {System.out.println("SubClass2:" +(value+1));}	//}추가, 1을 2로 만들기 위해 (value+1)추가
}

public class Addendum2 {
	static void print(SuperClass2 obj) { obj.output(); }
	public static void main(String[] args) {
		SuperClass2 obj1 = new SuperClass2(1);
		SubClass2 obj2 = new SubClass2(1);
		print(obj1);
		print(obj2);
	}
}