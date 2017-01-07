import java.util.*;

class Phone{
	String name, tel;	//�̸��� ��ȭ��ȣ�� �Է¹޴� ����
	
	Phone(String a, String b){	//2���� ���� ���� �޴� Phone ������
		this.name = a;
		this.tel = b;
	}
	
	public String getName(){	//name ���� ��ȯ�ϴ� �޼ҵ�
		return this.name;
	}
	
	public String getTel(){	//tel ���� ��ȯ�ϴ� �޼ҵ�
		return this.tel;
	}
}

public class PhoneManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count=0;	//�ο����� �����ϴ� ����
		System.out.print("�ο���>>");
		count = scanner.nextInt();
		Phone p[] = new Phone[count];	//�ο��� ��� ��ü ����
		Phone answer[] = new Phone[count]; //�Է��� ���� �����ϴ� �迭

		for(int i=0; i<p.length; i++){	//�̸��� ��ȭ��ȣ�� �Է¹޾� ��ü�� ����
			System.out.print("�̸��� ��ȭ��ȣ (��ȣ�� ���������� �Է�)>>");
			p[i] = new Phone(scanner.next(), scanner.next() );
		}
		
		System.out.println("����Ǿ����ϴ�...");
		
		boolean a = true;	//���ѷ����� ���� boolean ����
		
		while(a){	//exit�� �Է¹����� ���ѷ��� ����. �ƴϸ� ���ѷ��� ����
			System.out.print("�˻��� �̸�>>");
			String search = scanner.next();
			
			for(int j=0; j<p.length; j++){	
				if( search.compareTo(p[j].name) == 0 ) {	//�Է°��� ���尪�� ���� ���
					System.out.println(p[j].getName()+"�� ��ȣ�� "+p[j].getTel()+" �Դϴ�.");
					break;
				}
				
				else if( search.compareTo(p[j].name) != 0 ) {
					if(search.compareTo("exit") == 0){		//�Է°��� exit�� ���
						a = false;	//���ѷ��� ���Ḧ ���� boolean�� false�� ����
						break;
					}		
					
					else if( j == p.length-1 ) {
					System.out.println(search+" ��(��) �����ϴ�.");	//�Է°��� ���尪�� Ʋ�� ���
					break;
					}
					
					else continue;
				}
	
			}
		}
	}
}
