# 정수 제곱근 판별

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/33ef1cfc-9b32-464f-ad74-4a981a10891c)

## 풀이방식

- n을 어떤 숫자 i로 나누었을 떄 몫이 i이며 나머지가 0으로 정확히 나누어 떨어졌을 때 제곱수를 찾은 것이다.
- 제곱수를 1더한 값을 제곱한 결과를 리턴한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 정수 제곱근 판별
class Solution {
	public long solution(long n) {
		long answer = -1;
		for(long i=1;i<=n;i++) {
			if(n / i == i && n % i == 0) {
				answer = (i+1) * (i+1);
				break;
			}
		}
		return answer;
	}
}
```

</details>
