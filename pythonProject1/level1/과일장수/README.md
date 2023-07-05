# 과일장수

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/bed1f773-fc66-45e7-92ba-b25e0c8dfa73)
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/6b829ba1-dbd1-4b7d-9c39-8c1ce178e7fb)

## 풀이방식

- score배열을 오름차순 정렬을 한 배열 score2를 만든다.
- 그 배열을 뒤집어 내림차순 정렬로 바꾼다.
- 팔 수 있는 상자의 갯수를 구해서 한상자에 들어가는 사과의수 m x score2의 최소 사과 가격을 곱한것을 answer에 합계를 더하면 된다.


## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
import java.util.Arrays;
// 과일 장수
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] score2 = new int[score.length];
        int length = score.length;

        Arrays.sort(score);// 오름차순

        // 역순	(내림차순)
        for(int i=0;i<score2.length;i++) {
        	score2[i] = score[length-i-1];
        }

        int total = score2.length/m; // 팔 수 있는 상자 갯수
        int min = 0;
        for(int i=0;i < total;i++) {	// 상자의 갯수
        	min = score2[(m*(i+1))-1];
        	answer += min*m;
        }
        return answer;
    }
}
```

</details>
