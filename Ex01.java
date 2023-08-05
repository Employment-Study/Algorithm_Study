package stack;

import java.util.Arrays;
import java.util.Stack;



	
//		배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 

public class Ex01 {
	static int[] solution(int[] arr) {
		
//		이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
//		단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 
		
		//정수형 스택 객체 선언
		Stack<Integer> st = new Stack<Integer>();
		
		// arr에 담긴요소를 루프시켜서 
		// 객체 st가 비어있는지 확인하고 1층부터 채운다. 
		int[] answer = {};
		for(int i: arr) {
			if(st.isEmpty()) {
				st.push(i);
			}
			// 만약 비워져있지않다면 담긴요소가 같지 않다면 다음 i를 채운다.
			else if (st.peek() !=i) st.push(i);
		}
		//answer배열의 길이를  st의길이만큼 객체 생성 
		answer = new int[st.size()];
		
		//루프시키며네서 i는 answer의 길이-1 i가 0이될때까지 i를 루프시키고
		for(int i = answer.length-1; i>=0; i--) {
			//answer의 마지막요소부터 하나씩 차례로 st에서 꺼내서 넣는다.
			answer[i] = st.pop();
			System.out.println(i);
		}
		return answer;
//		arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//		arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//		배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,4,4,5,5};
		System.out.println(Arrays.toString(solution(arr)));
	}

	

	

}
