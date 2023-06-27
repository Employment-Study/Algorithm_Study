package emptyArray;

import java.util.ArrayList;

class Solution {
	public int[] solution(int[] arr, boolean[] flag) {
		/*
		 * 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때,
		 * flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고, flag[i]가
		 * false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return 하는 solution 함수를 작성해 주세요.
		 * 
		 * 입출력 예 arr : [3, 2, 4, 1, 3], flag : [true, false, true, false, false], result
		 * : [3, 3, 3, 3, 4, 4, 4, 4]
		 * 
		 * 입출력 예 설명 0 true 3 [3, 3, 3, 3, 3, 3] 1 false 2 [3, 3, 3, 3] 2 true 4 [3, 3,
		 * 3, 3, 4, 4, 4, 4, 4, 4, 4, 4] 3 false 1 [3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4] 4
		 * false 3 [3, 3, 3, 3, 4, 4, 4, 4]
		 */
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < flag.length; i++) {
			if (flag[i]) {
				for (int j = 0; j < arr[i] * 2; j++) {
					list.add(arr[i]);
				}
			} else {
				for (int j = 0; j < arr[i]; j++) {
					int index = list.size() - 1;
					list.remove(index);
				}
			}
		}
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = { 3, 2, 4, 1, 3 };
		boolean[] flag = { true, false, true, false, false };
		int[] answer;

		answer = s.solution(arr, flag);
		for (int num : answer) {
			System.out.println(num);
		}
	}
}