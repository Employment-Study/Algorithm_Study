# 3진법 뒤집기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/034e3e46-06ac-4e24-89cd-eb470c688c24)

## 풀이방식

- 10진수를 3진법으로 만들어 뒤집은 문자열 s_answer를 만든다.
- StringBuilder의 reverse() 함수를 이용해 뒤집기

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 3진법 뒤집기
class Solution {
    public int solution(int n) {
        int answer = 0;
        String s_answer = "";
        while(n!=0) {
        	s_answer+=n%3;
        	n/=3;
        }
        StringBuilder sb = new StringBuilder(s_answer);
        sb.reverse();

        s_answer = sb.toString();

        for(int i=0;i<s_answer.length();i++) {
        	int num = Integer.valueOf(s_answer.charAt(i));
        	if(num-48 >= 0 && num-48 < 3) {
        		answer += (num-48) * (int)Math.pow(3, i);
        	}
        }

        return answer;
    }
}
```

</details>
