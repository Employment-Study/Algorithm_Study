package algorithm;

public class Queries {
	
	static int[] solution(int[] arr, int[][] queries) {
		/*
		 * 수열과 구간 쿼리 4
		 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
		 * queries의 원소는 각각 하나의 query를 나타내며, [s, e, k]꼴입니다
		 * 각 query마다 순서대로 s <= i <= e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다
		 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return하는 solution함수를 완성해 주세요
		 */
		int[] answer = {};
		
		for(int i = 0; i < queries.length; i++) {
			int[] query = new int[queries[i].length];
				query = queries[i].clone();
				int s = query[0];
				int e = query[1];
				int k = query[2];
				for(int j = 0; j < arr.length; j++) {
					if(s <= j && j <= e && j % k == 0) {
						arr[j] += 1;
					}
				}
			}
//		for(int i = 0; i < queries.length; i++) {
//			// queries 이차원 배열의 요소를 담을 query 배열 생성
//			int[] query = new int[queries[i].length];
//			for(int j = 0; j < queries[i].length; j++) {
//				query[j] = queries[i][j];
//			}
//			for(int j = 0; j < arr.length; j++) {
//				int s = query[j];
//				int e = query[j+1];
//				int k = query[j+2];
//				if(s <= i && i <= e) {
//					if(i % k == 0) {
//						arr[j] += 1;
//						System.out.print(arr[i]);
//					}
//					break;
//				}
//			}
//		}
		
		answer = arr;
		return answer;
	}
	
	public static void main(String[] args) {
		int[][] queries = {{0,4,1}, {0,3,2}, {0,3,3}};
		int[] arr = {1, 1, 2, 4, 3};
		int[] answer;
		answer = solution(arr,queries);	// 기댓값 : 3, 2, 4, 6, 4 <= 얘의 0번 자리가 오타였던듯. 4가 맞음
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");	// 결과 : 4, 2, 4, 6, 4
		}
	}
}
