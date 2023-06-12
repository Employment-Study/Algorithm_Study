# 약수의 합

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/89faa66e-3e45-49e6-8413-54b92eca30b6)

## 풀이방식

- 반복문으로 약수를 모두 더 함

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java

// 약수의 합
class Solution {
    public int solution(int n) {
    	int answer = 0;
        for(int i=1;i<=n;i++) {
        	if(n % i == 0) {
        		answer += i;
        	}
        }
        return answer;
    }
}

```

</details>
