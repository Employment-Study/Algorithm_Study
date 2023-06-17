# 최소직사각형

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/088149f6-04b5-4d8b-b089-8b9541e3e220)
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/02ce0112-ea77-4d4f-baca-ae8b4b7524ab)

## 풀이방식

- 가로 세로의 큰 값과 작은 값을 w,h로 받고
- size배열의 가장 큰 값의 최대값과 작은 값의 최대값을 maxWidth와 maxHeight로 받아서 곱을 리턴한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 최소직사각형
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = Integer.MIN_VALUE;
        int maxHeight = Integer.MIN_VALUE;

        for(int i=0;i<sizes.length;i++) {
        	int w = Math.max(sizes[i][0], sizes[i][1]);
        	int h = Math.min(sizes[i][0], sizes[i][1]);
        	maxWidth = Math.max(maxWidth, w);
        	maxHeight = Math.max(maxHeight, h);
        }
        answer = maxHeight * maxWidth;
        return answer;
    }
}
```

</details>
