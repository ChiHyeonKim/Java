import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		int max=0, gap=0, year=0, i; 
		
		System.out.println("2000~2009년 까지 1년 단위로 키(cm)를 입력");

		for(i=0; i<10; i++){
			v.add(scanner.nextInt());
		}
		
		for(i=0; i<9; i++){	
				
			gap = v.get(i+1) - v.get(i); 
			
			if(max<gap){
				max = gap;
				
				switch(i){
				case 0:	year = 2000;	break;
				case 1: year = 2001;	break;
				case 2:	year = 2002;	break;
				case 3:	year = 2003;	break;
				case 4:	year = 2004;	break;
				case 5: year = 2005;	break;
				case 6: year = 2006;	break;
				case 7: year = 2007;	break;
				case 8: year = 2008;	break;
				}
			}
		}
		System.out.println("키가 가장 많이 자란 년도는 "+year+"년 "+max+"cm");
	}
}
