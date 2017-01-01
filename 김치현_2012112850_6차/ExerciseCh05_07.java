class Complex{
	public double real; //실수부
	public double image; //허수부
	
	Complex(double real){	//한 개의 실수를 받아 초기화하는 생성자
		this.real = real;
	}
	
	Complex(double real, double image){	//두 개의 실수를 받아 초기화하는 생성자
		this.real = real;
		this.image = image;
	}
    
	void toString(double real, double image){	//계산값을 실수, 허수로 나누어 출력해주는 메소드
    	System.out.println("("+real+","+image+"i)");
    }
	
	void addComplex(double c, double d){	//c,d 값을 전달받아 a(this.real),b(this.image)와 계산하여 새로운 변수에 저장
		double real = this.real + c;
		double image = this.image + d;
		
		toString(real, image);	//계산 값을  toString 메소드에 전달
	}
	
	void subComplex(double c, double d){	//c,d 값을 전달받아 a(this.real),b(this.image)와 계산하여 새로운 변수에 저장
		double real = this.real - c;
		double image = this.image - d;
		
		toString(real, image);	//계산 값을  toString 메소드에 전달
	}
	
	void mulComplex(double c, double d){	//c,d 값을 전달받아 a(this.real),b(this.image)와 계산하여 새로운 변수에 저장
		double real = (this.real * c ) - (this.image * d);
		double image = (this.real * d ) + (this.image * c);
		
		toString(real, image);	//계산 값을  toString 메소드에 전달
	}
	
	void divComplex(double c, double d){	//c,d 값을 전달받아 a(this.real),b(this.image)와 계산하여 새로운 변수에 저장
		double real = ( (this.real * c ) + (this.image * d) )/ (c*c + d*d);
		double image = ( ( this.image * c ) - (this.real * d) ) / (c*c + d*d); 
		
		toString(real, image);	//계산 값을  toString 메소드에 전달
	}
}

public class ExerciseCh05_07 {

	public static void main(String[] args) {
		Complex c1 = new Complex(1,2);
		Complex c2 = new Complex(3,4);
		
		c1.addComplex(c2.real, c2.image);	//c2에 있는 실수, 허수부 값을  c1으로  전달하여 덧셈
		c1.subComplex(c2.real, c2.image);	//c2에 있는 실수, 허수부 값을  c1으로  전달하여 뺄셈
		c1.mulComplex(c2.real, c2.image);	//c2에 있는 실수, 허수부 값을  c1으로  전달하여 곱셈
		c1.divComplex(c2.real, c2.image);	//c2에 있는 실수, 허수부 값을  c1으로  전달하여 나눗셈
	}
}