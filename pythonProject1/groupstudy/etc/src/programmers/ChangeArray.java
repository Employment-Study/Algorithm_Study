package programmers;

import java.util.Arrays;

class Solution {
	public int solution(int[] arr) {
		int answer = 0;
		int count = 0;
		int[] array = new int[arr.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = arr[i];
		}

		while (count != arr.length) {
			count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0 && arr[i] >= 50) {
					arr[i] /= 2;
				} else if (arr[i] % 2 != 0 && arr[i] < 50) {
					arr[i] = arr[i] * 2 + 1;
				}
				if (arr[i] == array[i])
					count++;
			}
			for (int i = 0; i < array.length; i++) {
				array[i] = arr[i];
			}
			answer++;
		}
		return answer - 1;
	}
}

public class ChangeArray {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] array = { 1, 2, 3, 100, 99, 98 };
		System.out.println("test : " + Arrays.toString(array));
		System.out.println(s.solution(array));
	}
}
