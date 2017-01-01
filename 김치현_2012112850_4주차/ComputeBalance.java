import java.util.Scanner;

public class ComputeBalance
{
		public static void main(String[] args)
		{
			// 사용자로부터 주어진 데이터를 저장하는 변수들을 선언한다
			int cardnumber, preprice, sumprice, sumrefund, max, sum; 
			// 키보드로부터 입력하는 데이터를 읽기 위한 Scanner 객체를 만든다.
			Scanner scan = new Scanner(System.in);
			
			// 사용자로부터 데이터를 한 번에 하나씩 입력하라고 요청한다.
			// 그리고 입력된 값을 읽는다.
			System.out.print("신용카드 번호를 입력하세요:\t");
			cardnumber = scan.nextInt();
			System.out.print("기존의 사용금액을 입력하세요:\t");
			preprice = scan.nextInt();
			System.out.print("총구매액을 입력하세요:\t");
			sumprice = scan.nextInt();
			System.out.print("총환불액을 입력하세요:\t");
			sumrefund = scan.nextInt();
			System.out.print("신용한도를 입력하세요:\t");
			max = scan.nextInt();

			// 새 잔고를 계산한다
			sum = preprice + sumprice - sumrefund;

			// 신용카드의 사용한도액을 초과했는지를 결정하고 출력한다
			if(max<sum)
				System.out.println(cardnumber+"의 "+"신용카드한도초과");
			else
				System.out.println(cardnumber+"의 "+"총 잔고:"+sum);
		}
}
