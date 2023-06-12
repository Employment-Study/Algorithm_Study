# 문자열을 정수로 바꾸기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/6c52ca36-9084-4f52-800c-906ed78c97db)

## 풀이방식

- String의 replaceAll()을 잘 사용해서 풀어본다.
- String.length()로 문자열의 크기를 비교한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java

// 문자열을 정수로 바꾸기
class Solution {
	boolean solution(String s) {
		boolean answer = true;
		String removeP = s.replaceAll("p", "").replaceAll("P", "");
		String removeY = s.replaceAll("y", "").replaceAll("Y", "");
		if(removeP.length()!=removeY.length())
			answer=false;
		
		System.out.println(answer);
		return answer;
	}
}

```

</details>
