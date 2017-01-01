class Complex{
	public double real; //�Ǽ���
	public double image; //�����
	
	Complex(double real){	//�� ���� �Ǽ��� �޾� �ʱ�ȭ�ϴ� ������
		this.real = real;
	}
	
	Complex(double real, double image){	//�� ���� �Ǽ��� �޾� �ʱ�ȭ�ϴ� ������
		this.real = real;
		this.image = image;
	}
    
	void toString(double real, double image){	//��갪�� �Ǽ�, ����� ������ ������ִ� �޼ҵ�
    	System.out.println("("+real+","+image+"i)");
    }
	
	void addComplex(double c, double d){	//c,d ���� ���޹޾� a(this.real),b(this.image)�� ����Ͽ� ���ο� ������ ����
		double real = this.real + c;
		double image = this.image + d;
		
		toString(real, image);	//��� ����  toString �޼ҵ忡 ����
	}
	
	void subComplex(double c, double d){	//c,d ���� ���޹޾� a(this.real),b(this.image)�� ����Ͽ� ���ο� ������ ����
		double real = this.real - c;
		double image = this.image - d;
		
		toString(real, image);	//��� ����  toString �޼ҵ忡 ����
	}
	
	void mulComplex(double c, double d){	//c,d ���� ���޹޾� a(this.real),b(this.image)�� ����Ͽ� ���ο� ������ ����
		double real = (this.real * c ) - (this.image * d);
		double image = (this.real * d ) + (this.image * c);
		
		toString(real, image);	//��� ����  toString �޼ҵ忡 ����
	}
	
	void divComplex(double c, double d){	//c,d ���� ���޹޾� a(this.real),b(this.image)�� ����Ͽ� ���ο� ������ ����
		double real = ( (this.real * c ) + (this.image * d) )/ (c*c + d*d);
		double image = ( ( this.image * c ) - (this.real * d) ) / (c*c + d*d); 
		
		toString(real, image);	//��� ����  toString �޼ҵ忡 ����
	}
}

public class ExerciseCh05_07 {

	public static void main(String[] args) {
		Complex c1 = new Complex(1,2);
		Complex c2 = new Complex(3,4);
		
		c1.addComplex(c2.real, c2.image);	//c2�� �ִ� �Ǽ�, ����� ����  c1����  �����Ͽ� ����
		c1.subComplex(c2.real, c2.image);	//c2�� �ִ� �Ǽ�, ����� ����  c1����  �����Ͽ� ����
		c1.mulComplex(c2.real, c2.image);	//c2�� �ִ� �Ǽ�, ����� ����  c1����  �����Ͽ� ����
		c1.divComplex(c2.real, c2.image);	//c2�� �ִ� �Ǽ�, ����� ����  c1����  �����Ͽ� ������
	}
}