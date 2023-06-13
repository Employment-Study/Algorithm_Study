# 문자열 다루기 기본

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/a898434c-07c5-443f-905e-87ecf518ef55)

## 풀이방식

- ASCII코드와 문자열 길이의 반복문으로 숫자만으로 만들어진 문자열인지 확인하고
- 문자열의 길이를 조건문으로 판단해서 알맞은 boolean값 리턴

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 문자열 다루기 기본
class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int count = 0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i) >= 48 && s.charAt(i) <= 57) {
        		count ++;
        	}
        }
        if(count == s.length() && (s.length() ==4 || s.length() == 6))
        	answer = true;
        else
            answer = false;
        return answer;
    }
}
```

</details>
