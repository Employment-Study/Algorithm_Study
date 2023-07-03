package Quiz05;

import java.util.ArrayList;

// 수목
// 181860
// 빈 배열에 추가, 삭제 하기
public class Solution2 {
	public int[] solution(int[] arr, boolean[] flag) {
		ArrayList<Integer> list = new ArrayList<>();
		
		// 빈 배열에 넣기 전에 list변수에 사이즈를 만든 후 넣어준다
		// 사이즈를 만드는 기준은  arr[i]가 flag와 대입했을때 true이면 *2 하고 추가
		// false라면 추가없이 list에 길이가 감소된다
		for(int i = 0; i < arr.length; i++) {
			// 빈 배열에 추가
			if(flag[i]) { // true 일때 
				// arr배열 i에 * 2를  적용하고
				for(int j = 0; j < arr[i] * 2; j++) {
					// 리스트에 추가
					list.add(arr[i]);
					// 이렇게 추가하면 true일때 arr배열 수는 * 2가 되어 list에 저장되며
					// arr[i]에 곱하기한 수가 list추가되면서 사이즈가 정해진다
					// 따라서, true일때 숫자들이 list에 모이게 된다
				}
			}
			// 빈배열 삭제
			else { // false일때
				// 배열의 i를
				for(int j = 0; j < arr[i]; j++) {
					// list에 추가하지 않고 사이즈감소를 remove로 적용한다
					list.remove(list.size() -1);
				}
			}
		}
		// 이제 정해진 list의 사이즈를 answer에 적용
        int[] answer = new int[list.size()];
        // list사이즈만큼 반복하면서 answer[i]에 list를 넣어준다
        // list에는 arr[i] * 2가 된 값들이 들어가 있다
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        // 그리고 반환
        return answer;
    }
}
