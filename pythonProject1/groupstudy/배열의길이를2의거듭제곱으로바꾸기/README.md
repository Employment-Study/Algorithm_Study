# 배열의 길이를 2의 거듭제곱으로 바꾸기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/2d7be24f-84bb-45b6-8738-fc11b1258873)


## 풀이방식
- 처음 입력되는 변수의 크기에 따라 2의 제곱이되는 크기를 반환하는 함수 하나를 더 만들어서 풀었음

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
class Solution {
	static int makeSize(int[] arr) {
		int size = 0;
		if (arr != null) {
			size = arr.length;
		}
		if (arr.length == 1) {
			return 1;
		}
		int num2 = 2;
		while (num2 < size) {
			num2 = num2 * 2;
		}
		return num2;
	}

	public int[] solution(int[] arr) {
		int index = makeSize(arr);
		System.out.println("index : " + index);

		int[] answer = new int[index];

		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
		}
		return answer;
	}
}
```

</details>