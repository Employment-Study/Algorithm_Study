# 조건에 맞게 수열 변환하기

## 문제
---
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/ff1dbfeb-aee4-427c-b3da-4dfa66f32096)

## 풀이방식
- 이중 반복문 사용

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
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
```


</details>