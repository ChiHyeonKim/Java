public class Histogram {
	public static void main(String[] args) {
		int I,j;
		int[] answer = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 2, 2, 2, 3, 5};
		int[] counter = new int[5];
		
		for (int i = 0; i < answer.length; i++) {
			switch( answer[i] ){	//answer배열 원소의 값
			case 1:					//answer 값이 1인 경우
				counter[0]++;		//counter 배열 0번지에 저장
				continue;
			case 2:					//answer 값이 2인 경우	
				counter[1]++;		//counter 배열 1번지에 저장
				continue;
			case 3:					//answer 값이 3인 경우
				counter[2]++;		//counter 배열 2번지에 저장
				continue;
			case 4:					//answer 값이 4인 경우
				counter[3]++;		//counter 배열 3번지에 저장
				continue;
			case 5:					//answer 값이 5인 경우
				counter[4]++;		//counter 배열 4번지애 저장
				continue;
			default:				//answer 값이 위의 경우가 아닌 경우	
				break;				//루프 종료
			}	
		}

		for (int i = 0; i < counter.length; i++) {
			System.out.print((i+1) + ": " );
			for(j = 0; j<counter[i]; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	} 
}

