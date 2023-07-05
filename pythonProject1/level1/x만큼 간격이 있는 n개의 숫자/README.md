# x만큼 간격이 있는 n개의 문자

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/a9d8037a-3691-4bcf-bac1-ea1c055d0033)

## 풀이방식

- 데이터 타입에 유의하며 반복문으로 해결

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
class Solution {
	public long[] solution(int x, int n) {
		long x1 = x;
		long[] answer = new long[n];		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = x1 * (i + 1);
		}		
		return answer;
	}
}

```

</details>
