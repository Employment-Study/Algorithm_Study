# 내적

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/4db83dc0-6333-4fe2-8fe2-b7204b51cdb5)

## 풀이방식

- a,b의 size가 같기 때문에 반복문을 한 번만 사용하여 곱한 값을 더한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
//내적
class Solution {
	public int solution(int[] a, int[] b) {
		int answer = 0;
		for(int i=0;i<a.length;i++) {
			answer += a[i]*b[i];
		}
		return answer;
	}
}

```

</details>
