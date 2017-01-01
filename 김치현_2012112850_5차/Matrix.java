public class Matrix {
	public static void main(String[] args) {
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];				//score 배열에 저장된 수를 result 배열에 입력
				result[i][3] += score[i][j];			//score 배열에 저장된 수를 더해서 result배열 각 행의 끝에 에 저장
				result[score.length][j] += score[i][j]; //score 배열에 저장된 수를 더해서 result배열 맨 끝 행에 각 원소에 저장
				result[score.length][3] += score[i][j]; //score 배열에 저장된 수를 더해서 result배 맨 끝행 맨 끝열에 저장
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}
}