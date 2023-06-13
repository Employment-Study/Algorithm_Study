# 부족한 금액 계산하기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/a5b89dad-3aca-40c2-be10-9d7eb7c58782)

## 풀이방식

- answer 초기값 0은 돈이 부족하지 않을 때 바로 리턴됩니다.
- total이라는 횟수별 금액을 반복문으로 계산하여 현재 가지고 있는 금액과 비교하여 금액이 부족하면 부족한 만큼의 금액을 리턴합니다

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 부족한 금액 계산하기
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        for(int i=1;i<=count;i++) {
        	total += price*i;
        }

        if(money - total < 0) {
        	answer = total - money;
        }
        return answer;
    }
}
```

</details>
