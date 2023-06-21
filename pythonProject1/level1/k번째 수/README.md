# k번째 수

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/cb26a55c-8a28-4c9b-9c4e-5ee18725b060)

## 풀이방식

- commands 크기 만큼의 정수 배열을 하나 만든다.
- commands[i][1]-commands[i][0]+1이 배열 arr의 크기이다. array의 순서를 잘 계산해서 arr[k]에 대입한다.
- Arrays.sort로 정렬한다. 

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
import java.util.Arrays;
// k번째 수
class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int count = 0;
		int[] arr = null;

		for (int i = 0; i < commands.length; i++) {
			arr = new int[commands[i][1] - commands[i][0] + 1];
			for (int k = 0; k < arr.length; k++) {
				arr[k] = array[commands[i][0] - 1 + k];
			}
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			answer[count] = arr[commands[i][2]-1];
			
			count++;
		}
		return answer;
	}
}

```

</details>
