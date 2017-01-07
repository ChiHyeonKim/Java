class SuperClass1{
	SuperClass1() {} 	//SuperClass1의 기본 생성자 추가
	SuperClass1(String s) {System.out.println("This is Super Class:"+s); } //; 추가
	static String greeting() {return "Good bye";}
	String name(){return "Oak";}
}

class SubClass extends SuperClass1{	//SuperClass -> SuperClass1
	static String greeting() {return "Hello";}
	String name() {return "Java";}
}

public class Addendum1 {
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		System.out.println(obj.greeting()+","+obj.name()); //greeting->greeting()
	}
}
