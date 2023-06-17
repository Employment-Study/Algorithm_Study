# 시저 암호

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/3bdbad43-adec-4b6d-9088-78e1de3eb770)

## 풀이방식

- 소문자와 대문자일때의 ASCII코드값 범위를 구분하여 char에 n만큼 더한것을 char로 변환하는 방식을 사용했다.
- char값을 변환할 때에는 StringBuilder의 setCharAt()함수를 사용했다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 시저 암호
class Solution {
	public String solution(String s, int n) {
		String answer = "";
		StringBuilder sb = new StringBuilder(s);

		for(int i=0;i<sb.length();i++) {
			int p = sb.charAt(i);

			if(sb.charAt(i) == ' ')
				continue;
			// 대문자인 경우
			if ((p > 65 && p < 91)) {
				if(p+n >= 91) {
					p = p-26;			// p = 90 n = 25
				}						// p = 64 n = 25
			}

			// 소문자인 경우
			if ((p > 97 && p<123)) {
				if(p+n >= 123) {
					p = p-26;			// p = 122 n = 25
				}						// p = 98  n = 25
			}
			sb.setCharAt(i, (char)(n+p));
		}

		answer = sb.toString();

		return answer;
	}
}
```

</details>
