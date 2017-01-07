//##인터페이스: 차열쇠, 바퀴, 문, 운전대 / 추상 Class: 오디오 구현
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
//##Car Class 구현 
	String door, key, tire, wheel, power;
	
   public void carState(String string){
	   if(string.equals("Y")) door = "운전자는 문을 열고, ";
	   else if(string.equals("N")) door = "운전자는 문을 닫고, ";
   }
   public void doorState(String string){
	   if(string.equals("Y")) key = "자리에 앉아 시동을 걸었다.";
	   else if(string.equals("N")) key = "자리에 앉아 시동을 걸지 않았다.";
   }
   public void tireState(String string){
	   if(string.equals("Y")) tire = "엑셀을 밟으니 바퀴 4개가 돌아가고 ";
	   else if(string.equals("N")) tire = "엑셀을 밟으니 바퀴 4개가 돌아가지 않고 ";
   }
   public void wheelControl(String string){	 
	   if(string.equals("Y")) wheel = "왼쪽으로 운전대를 돌렸다.";
	   else if(string.equals("N")) wheel = "운전대를 돌리지 않았다.";
   }
   public void audioState(String string){	  
	   if(string.equals("Y")) power = "음악이 듣고 싶어 오디오를 켰고 듣기 싫어 바로 껐다.";
	   else if(string.equals("N")) power = "오디오를 켜지 않았다.";
   }
    
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      Car mycar = new Car();

      System.out.print("문을 여시겠습니까? (Y/N) "); mycar.carState(scan.nextLine());
      System.out.print("시동을 거시겠습니까? (Y/N) "); mycar.doorState(scan.nextLine());
      System.out.print("엑셀을 밟으시겠습니까? (Y/N) "); mycar.tireState(scan.nextLine());
      System.out.print("운전대를 돌리시겠습니까? (Y/N) "); mycar.wheelControl(scan.nextLine());
      System.out.print("라디오를 켜고 끄시겠습니까? (Y/N) "); mycar.audioState(scan.nextLine());

      System.out.println("\n\n<자동차 객체 결과>"); System.out.println(mycar.door + mycar.key);
      System.out.println(mycar.tire + mycar.wheel); System.out.println(mycar.power);

      scan.close();
   }
}