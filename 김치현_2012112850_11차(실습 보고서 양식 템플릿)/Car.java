//##�������̽�: ������, ����, ��, ������ / �߻� Class: ����� ����
import java.util.*;

interface CarKey{
	void carState(String string);
}

interface Tire{
	void tireState(String string);
}

interface Door{
	void doorState(String string);
}

interface Wheel{
	void wheelControl(String string);	
}

abstract class Audio{
	abstract void audioState(String string);
}

public class Car extends Audio implements CarKey, Tire, Door, Wheel {
//##Car Class ���� 
	String door, key, tire, wheel, power;
	
   public void carState(String string){
	   if(string.equals("Y")) door = "�����ڴ� ���� ����, ";
	   else if(string.equals("N")) door = "�����ڴ� ���� �ݰ�, ";
   }
   public void doorState(String string){
	   if(string.equals("Y")) key = "�ڸ��� �ɾ� �õ��� �ɾ���.";
	   else if(string.equals("N")) key = "�ڸ��� �ɾ� �õ��� ���� �ʾҴ�.";
   }
   public void tireState(String string){
	   if(string.equals("Y")) tire = "������ ������ ���� 4���� ���ư��� ";
	   else if(string.equals("N")) tire = "������ ������ ���� 4���� ���ư��� �ʰ� ";
   }
   public void wheelControl(String string){	 
	   if(string.equals("Y")) wheel = "�������� �����븦 ���ȴ�.";
	   else if(string.equals("N")) wheel = "�����븦 ������ �ʾҴ�.";
   }
   public void audioState(String string){	  
	   if(string.equals("Y")) power = "������ ��� �;� ������� �װ� ��� �Ⱦ� �ٷ� ����.";
	   else if(string.equals("N")) power = "������� ���� �ʾҴ�.";
   }
    
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Car mycar = new Car();

      System.out.print("���� ���ðڽ��ϱ�? (Y/N) "); mycar.carState(scan.nextLine());
      System.out.print("�õ��� �Žðڽ��ϱ�? (Y/N) "); mycar.doorState(scan.nextLine());
      System.out.print("������ �����ðڽ��ϱ�? (Y/N) "); mycar.tireState(scan.nextLine());
      System.out.print("�����븦 �����ðڽ��ϱ�? (Y/N) "); mycar.wheelControl(scan.nextLine());
      System.out.print("������ �Ѱ� ���ðڽ��ϱ�? (Y/N) "); mycar.audioState(scan.nextLine());

      System.out.println("\n\n<�ڵ��� ��ü ���>"); System.out.println(mycar.door + mycar.key);
      System.out.println(mycar.tire + mycar.wheel); System.out.println(mycar.power);

      scan.close();
   }
}