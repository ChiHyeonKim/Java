public class Histogram {
	public static void main(String[] args) {
		int I,j;
		int[] answer = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 2, 2, 2, 3, 5};
		int[] counter = new int[5];
		
		for (int i = 0; i < answer.length; i++) {
			switch( answer[i] ){	//answer�迭 ������ ��
			case 1:					//answer ���� 1�� ���
				counter[0]++;		//counter �迭 0������ ����
				continue;
			case 2:					//answer ���� 2�� ���	
				counter[1]++;		//counter �迭 1������ ����
				continue;
			case 3:					//answer ���� 3�� ���
				counter[2]++;		//counter �迭 2������ ����
				continue;
			case 4:					//answer ���� 4�� ���
				counter[3]++;		//counter �迭 3������ ����
				continue;
			case 5:					//answer ���� 5�� ���
				counter[4]++;		//counter �迭 4������ ����
				continue;
			default:				//answer ���� ���� ��찡 �ƴ� ���	
				break;				//���� ����
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

