# 짝수와 홀수

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/18da4e06-ce58-481d-aa2d-5e0998294c03)

## 풀이방식

- 2로 나눈 나머지로 짝수/홀수를 판별하여 그에 맞는 문자열을 리턴

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 짝수와 홀수
class Solution {
    public String solution(int num) {
        String answer = num % 2==0 ? "Even" : "Odd";
        return answer;
    }
}
```

</details>
