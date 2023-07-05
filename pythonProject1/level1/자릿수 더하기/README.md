# 자릿수 더하기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/3cd22ff9-a1ab-43da-a36f-4c34d8c2fb0a)

## 풀이방식

- while문으로 n이 0이 될 때까지 1의자릿수를 더하고 10으로 나눔을 반복

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 자릿수 더하기
import java.util.*;

public class Solution {
	public int solution(int n) {
		int answer = 0;
		
		while(n!=0) {
			answer += n%10;
			n/=10;
		}
		
		return answer;
	}
}

```

</details>
