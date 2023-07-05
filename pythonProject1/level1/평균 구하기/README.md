# 평균 구하기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/a789ffc2-0990-4cde-901f-63350ab94c23)

## 풀이방식

- double로 형변환해서 갯수만큼 나누기 연산을 한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 평균 구하기
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i : arr) {
        	answer += (double)i;
        }
        answer/=arr.length;
        return answer;
    }
}

```

</details>
