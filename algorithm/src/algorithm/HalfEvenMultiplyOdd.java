package algorithm;

public class HalfEvenMultiplyOdd {
	
	static int solution(int[] arr) {
		/*
		 * 정수 배열 arr가 주어집니다.
		 * arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다
		 * 이러한 작업을 x번 반복한 결과인 배열을 arr(x)라고 표현했을 때, arr(x) = arr(x + 1)인 x가 항상 존재합니다.
		 * 이러한 x중 가장 작은 값을 return하는 solution함수를 완성해 주세요
		 */
		int answer = 0;
		int length = arr.length;
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				// 반복에 따라 증가할 2차원배열 tmp 생성
				int[][] tmp = new int[i + 1][length];
				
				int num = arr[j];
				// 만약 num이 50이상이고 짝수면
				if (num >= 50 && num % 2 == 0) {
					// arr[j]에 num / 2 값을 넣어라
					arr[j] = num / 2;
					// else if로 한 이유 : 물론 짝수 / 2는 짝수지만 혹시 모른다는 마음에 else if 사용
					// 그렇지 않고 num이 50미만 홀수라면
				} else if (num < 50 && num % 2 != 0) {
					// arr[j]에 num * 2 + 1을 넣어라
					arr[j] = num * 2 + 1;
				}
				// tmp[i][j]에 arr[j]를 넣어라
				// 가로는 고정이고, 세로로 하나씩 채워짐
				tmp[i][j] = arr[j];
				
				System.out.print(tmp[i][j] + " ");
			}
			System.out.println();
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 100, 99, 98 };
		solution(arr);
	}
}
