# 가운데 글자 가져오기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/59db7c3a-485d-4400-a569-9a2584321ea3)

## 풀이방식

- charAt()을 사용하여 짝수라면 2개의 글자를
- 홀수라면 중간의 1글자를 가져온다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
//가운데 글자 가져오기
class Solution {
	public String solution(String s) {
		String answer = "";
		int length = s.length();

		if(s.length()%2==0) {	// 짝수 라면
			answer += s.charAt((length/2)-1);
			answer += s.charAt(length/2);
		}else {
			answer += s.charAt(length/2);
		}

		return answer;
	}
}

```

</details>
