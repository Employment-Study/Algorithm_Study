# 소수 찾기

## 문제

![image](https://github.com/Employment-Study/Team_StudyJava/assets/44068819/94fa2c5b-c76d-46bc-bc52-36742a9d95e8)

## 풀이방식

- 소수 판별 함수를 만드는데 최고 효율의 판별식을 사용한다.
- i를 제곱근까지만 탐색하는 것이 최고 효율의 소수 판별식이다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
//소수 찾기
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=2;i<=n;i++){
            if(verify(i)){
                answer++;
            }
        }
        return answer;
    }
    // 소수 판별
    public boolean verify(int num){
        for(int i=2;i*i<=num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}

```

</details>
