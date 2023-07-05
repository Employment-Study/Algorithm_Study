# 두 정수 사이의 합

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/a690bedf-6dab-4033-a1f1-764855ecf106)

## 풀이방식

- long 형변환에 유의하여 문제를 해결한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java

// 두 정수 사이의 합
class Solution {
	public long solution(int a, int b) {
		long answer = 0;
		if(a < b) {
			for(int i=a;i<=b;i++) {
				answer += (long)i;
			}
		}else {
			for(int i=b;i<=a;i++) {
				answer += (long)i;
			}
		}
		return answer;
	}
}

```

</details>
