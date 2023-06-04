package Queries;

public class Main {
	public static void main(String[] args) {
		int[][] queries = {{0,4,1}, {0,3,2}, {0,3,3}};
		int[] arr = {1, 1, 2, 4, 3};
		int[] answer;
		answer = Solution.solution(arr, queries);	// 기댓값 : 3, 2, 4, 6, 4 <= 얘의 0번 자리가 오타였던듯. 4가 맞음
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");	// 결과 : 4, 2, 4, 6, 4
		}
	}
}
