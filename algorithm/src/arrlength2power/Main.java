package arrlength2power;

public class Main {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] result1;
		
		int[] arr2 = {1,2,3,4};
		int[] result2;
		
		result1 = Solution.solution(arr1);
		result2 = Solution.solution(arr2);
		
		for (int i = 0; i < result1.length; i++) {
			System.out.print(result1[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < result2.length; i++) {
			System.out.print(result2[i] + " ");
		}
	}
}
