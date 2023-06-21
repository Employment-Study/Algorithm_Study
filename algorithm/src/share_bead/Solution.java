package share_bead;

class Solution {
//	public int factorial(int num) {
//		if (num == 0 || num == 1) {
//			return 1;
//		}
//		return num * factorial(num - 1);
//	}

	public long solution(int balls, int share) {
		/*
		 * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게
		 * 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를
		 * return하는 solution 함수를 완성해 주세요
		 * 
		 * 입출력 예 balls : 3, share : 2, result : 3 balls : 5, share : 3, result : 10
		 * 
		 * Hint 서로 다른 n개 중 m개를 뽑는 경우의 수 공식은 다음과 같습니다 n! / (n-m)! * m!
		 */
		long answer = 1;
		int n = balls;
		int m = share;
		int o = balls - share;

		// 재귀함수 factorial을 사용하여 풀려고 했다
		// 30을 계산하던 중, long의 범위를 벗어나는 수가 나와서 실패
//    	answer = factorial(n) / (factorial(o) * factorial(m));
		
		// 찾은 답
		// 계산 값이 long의 범위를 벗어나기 전에, 나눠주는 것
		// n! / (n-m)! * m!이 아닌, n / 1 * (n-1)/2 ... (n-m+1)/m 으로 구현
		// n = 5, m = 3일때 o = 2
//		for (int i = 0; i < o; i++) {
//			answer *= (n - i);	// 5, 4 
//			answer /= (i + 1);	// 1, 2
//		}
		
		// 다시 찾은 다른 답
		// 재귀함수를 사용하였지만, 마찬가지로 long의 범위를 벗어나기 전, 나눠주는 것
		// n*(n-1)*(n-2) ... (n-m+1) / m!로 구현한 것
		// 어차피 120/12나 5/1*4/2*3/3은 같다
		// n!/(n-m)! * m! = n / 1 * ... (n-m+1)/m
		if(share == 0) {
			return 1;
		}
		answer = solution(balls - 1, share - 1);
		answer *= balls;
		answer /= share;

		return answer;
	}
}