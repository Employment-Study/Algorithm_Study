package qr_code;

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int q1, q2;
		int r1, r2;
		String code1, code2;
		
		q1 = 3;
		r1 = 1;
		code1 = "qjnwezgrpirldywt";
		String answer1 = s.solution(q1, r1, code1);
		
		q2 = 1;
		r2 = 0;
		code2 = "programmers";
		String answer2 = s.solution(q2, r2, code2);
		
		System.out.println(answer1);
		System.out.println(answer2);
	}
}
