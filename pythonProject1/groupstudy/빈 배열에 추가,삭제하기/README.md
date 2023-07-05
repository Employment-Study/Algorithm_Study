# 빈 배열에 추가, 삭제하기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/d77e2e65-41b5-4cd1-800c-9cb9110688b2)

## 풀이방식

- Integer타입의 Stack을 사용하여 해결
- flag의 참/거짓을 분기문으로 다르게 반복처리했음
- 배열에 담을 때, 반복문을 잘 사용해서 뒤집어 줘야한다.(pop()은 먼저 push 데이터를 반환하기 때문이다.)

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
import java.util.Stack;
// 빈 배열에 추가/삭제하기
class Solution {
	public int[] solution(int[] arr, boolean[] flag) {
		int[] answer = {};
		Stack<Integer> arrStack = new Stack<Integer>();
		for(int i=0;i<flag.length;i++) {
			if(flag[i]) {
				for(int j =0;j<arr[i]*2;j++) {
					arrStack.push(arr[i]);
				}
			}else {
				for(int j =0;j<arr[i];j++) {
					arrStack.pop();
				}
			}
		}

		answer = new int[arrStack.size()];

		for(int i=0;i<answer.length;i++) {
			answer[i] = arrStack.pop();
		}

		for(int i=0; i<answer.length/2; i++){
			int temp = answer[i];
			answer[i] = answer[answer.length -i -1];
			answer[answer.length -i -1] = temp;
		}

		return answer;
	}
}

```

</details>
