# 직사각형 넓이 구하기

## 문제

![image](https://github.com/Employment-Study/Team_StudyJava/assets/44068819/d7029074-a1c5-4a2c-b5b8-48ca1ff44a27)

## 풀이방식

- 내장함수 Math.abs()로 절대값으로 가장 긴 가로 세로 길이를 구해서 곱함

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
//직사각형 넓이 구하기
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int w = 0;
        int h = 0;
        int x = dots[0][0];     // 1  -1
        int y = dots[0][1];     // 1  -1
        
        for(int i=0;i<dots.length;i++){
            if(dots[i][0] != x) w = Math.abs(x-dots[i][0]);
            if(dots[i][1] != y) h = Math.abs(y-dots[i][1]); 
        }
        
        answer = w * h;
        
        return answer;
    }
}

```

</details>
