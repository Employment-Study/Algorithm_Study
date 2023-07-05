# 예산

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/56f1a23f-d0bc-44e8-a1b4-db35b29b0761)

## 풀이방식

- Arrays.sort()로 오름차순 정렬을 먼저 한 다음
- 0번째 index부터(적게 드는 예산 부터) 빼주고 answer에 1씩 더해준다.
- 물론 남은 예산보다 크게 들면 안되기 때문에 조건을 걸어서 break해준다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 예산
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=answer;i<d.length;i++) {
        	if(budget >= d[i]) budget -= d[i];
        	else break;
        	answer++;
        }
        return answer;
    }
}
```

</details>
