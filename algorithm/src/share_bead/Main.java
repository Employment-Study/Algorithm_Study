package share_bead;

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int balls;
		int share;
		long result;
		
		balls = 30; share = 15;
		result = s.solution(balls, share);
		System.out.println(result);
		
		balls = 5; share = 5;
		result = s.solution(balls, share);
		System.out.println(result);
	}
}
