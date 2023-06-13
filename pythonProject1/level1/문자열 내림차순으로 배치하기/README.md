# 문자열 내림차순으로 배치하기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/9d9d6609-5503-4713-9978-69ad1a7442b4)

## 풀이방식

- Char 타입의 배열로 변환하여 Array.sort로 오름차순 정렬을 하고
- StringBuilder를 사용하여 reverse()함으로써 내림차순 String로 바꿔서 반환

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
//문자열 내림차순으로 배치하기
class Solution {
	public String solution(String s) {
		String answer = "";
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		StringBuilder sb = new StringBuilder(new String(chars));
		answer = sb.reverse().toString();

		return answer;
	}
}

```

</details>
