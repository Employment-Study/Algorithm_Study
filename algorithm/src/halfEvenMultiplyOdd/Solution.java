package halfEvenMultiplyOdd;

class Solution {
	static int solution(int[] arr) {
		/*
		 * 조건에 맞게 수열 변화하기2 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고,
		 * 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다 이러한 작업을 x번 반복한 결과인 배열을 arr(x)라고 표현했을 때,
		 * arr(x) = arr(x + 1)인 x가 항상 존재합니다.이러한 x 중 가장 작은 값을 return하는 solution함수를 완성해 주세요
		 */
		int answer = 0;
		int length = arr.length;
		int[] compare = new int[length];
		int count = 0;

		while (count != length) {
			count = 0;
			// arr.clone() : 깊은 복사
			// 만약 compare = arr로 했다면, arr의 주소값만 복사해오고 끝났을 것이다(얕은 복사).
			// 하지만 1차원 배열에서 .clone을 사용하면 주소 속의 값을 복사해온다.
			// 복사해온 값은 변경해도 원래 배열에 영향을 주지 않는다
			compare = arr.clone();
			for (int i = 0; i < length; i++) {
				if (arr[i] % 2 == 0 && arr[i] >= 50) {
					arr[i] = arr[i] / 2;
				} else if (arr[i] % 2 != 0 && arr[i] < 50) {
					arr[i] = arr[i] * 2 + 1;
				}
				if (arr[i] == compare[i])
					count++;
			}
			answer++;
		}
		return answer - 1;
	}
}

//	static int solution(int[] arr) {
//		/*
//		 * 정수 배열 arr가 주어집니다.
//		 * arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다
//		 * 이러한 작업을 x번 반복한 결과인 배열을 arr(x)라고 표현했을 때, arr(x) = arr(x + 1)인 x가 항상 존재합니다.
//		 * 이러한 x중 가장 작은 값을 return하는 solution함수를 완성해 주세요
//		 */
//		int answer = 0;
//		int length = arr.length;
//		int[][] tmp = new int[lenght];

//		처음 생각 : 반복문을 돌려서 연산을 하고, 2차원 배열에 넣은 다음, i와 i-1을 비교하자
//		
//		// 조건식을 찾는 것까지는 완료하였다	
//		for (int i = 0; i < length; i++) {
//			for (int j = 0; j < length; j++) {
//				// 반복에 따라 증가할 2차원배열 tmp 생성
//				int[][] tmp = new int[i + 1][length];
//				
//				int num = arr[j];
//				// 만약 num이 50이상이고 짝수면
//				if (num >= 50 && num % 2 == 0) {
//					// arr[j]에 num / 2 값을 넣어라
//					arr[j] = num / 2;
//					// else if로 한 이유 : 물론 짝수 / 2는 짝수지만 혹시 모른다는 마음에 else if 사용
//					// 그렇지 않고 num이 50미만 홀수라면
//				} else if (num < 50 && num % 2 != 0) {
//					// arr[j]에 num * 2 + 1을 넣어라
//					arr[j] = num * 2 + 1;
//				}
//				// tmp[i][j]에 arr[j]를 넣어라
//				// 가로는 고정이고, 세로로 하나씩 채워짐

//				// 조건에 따라서 2차원 배열에 넣는 것 까지도 완료
//				tmp[i][j] = arr[j];
//				
//				// 그런데 여기서 비교할 방법을 찾지를 못했다.
//				System.out.print(tmp[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		return answer;
//	}
//	 답을 확인 후 든 생각 : 너무 어렵게 생각했다. 2차원 배열로 하지말고 그냥 tmp[j] = arr[j]로 값만 복사하고, 반복문 종료, tmp[i] == arr[i]로 비교했으면 됐을 것 같은데...