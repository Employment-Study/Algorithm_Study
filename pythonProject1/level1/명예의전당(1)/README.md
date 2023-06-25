# 명예의 전당(1)

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/e825d2d0-3bf2-46c1-a986-629192e4ca7c)
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/9a44dfef-589a-47e7-b57c-d292e51fbbe4)

## 풀이방식
- frameList라는 ArrayList를 만든다. 이 리스트는 수시로 바뀌는 명예의 전당이다.
- frameList에 크기가 k보다 작을 경우에는 무조건 숫자를 받고 정렬한다.
- frameList의 크기가 k로 꽉 찼을 경우에는 기존의 List에서 가장 작은 수보다 큰 지 비교한 후에 작으면 무시하고 크면 기존의 가장 작은 수를 제거하고 List에 추가한다.
- 매 추가 시에는 정렬을 새로 해준다. 정렬을 한 훟에는 answer에 가장 작은 수(index = 0)를 담아준다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
import java.util.ArrayList;
import java.util.Arrays;
// 명예의 전당1
class Solution {
	public int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		ArrayList<Integer> frameList = new ArrayList<Integer>();
		int index = 0;
		while (frameList.size() <= k && index < score.length) {
			if(frameList.size() < k) {
				frameList.add(score[index]);
				frameList.sort(null);
				answer[index] = frameList.get(0);
			}else{
				if(frameList.get(0)>score[index]) {
					answer[index] = frameList.get(0);
					index++;
					continue;
				}else {
					frameList.remove(0);
					frameList.add(score[index]);
					frameList.sort(null);
					answer[index] = frameList.get(0);
				}
			}
			index++;
		} // end of while
		return answer;
	}
}
```

</details>
