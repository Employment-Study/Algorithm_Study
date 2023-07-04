package engFollow_up;

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();

		int n1 = 3;
		String[] words1 = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
		int[] result1 = s.solution(n1, words1); // 3, 3
		for(int i = 0; i < result1.length; i++) {
			System.out.print(result1[i] + " ");
		}
		System.out.println();
		
		int n2 = 5;
		String[] words2 = { "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure",
				"establish", "hang", "gather", "refer", "reference", "estimate", "executive" };
		int[] result2 = s.solution(n2, words2); // 0, 0
		for(int i = 0; i < result2.length; i++) {
			System.out.print(result2[i] + " ");
		}
		System.out.println();

		int n3 = 2;
		String[] words3 = { "hello", "one", "even", "never", "now", "world", "draw" };
		int[] result3 = s.solution(n3, words3); // 1, 3
		for(int i = 0; i < result3.length; i++) {
			System.out.print(result3[i] + " ");
		}
		System.out.println();
	}
}
