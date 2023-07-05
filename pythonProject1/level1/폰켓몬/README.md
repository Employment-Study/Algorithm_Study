# 폰켓몬

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/d9582dfe-445e-485e-86d1-074b255607e5)
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/1fadeeaa-4cd9-4ac9-98e2-b26bb43e5b0d)

## 풀이방식

- 중복을 허용하지 않는 HashSet을 이용해서 중복을 제외한 모든 수 를 HashSet에 담는다.
- 그리고 그 종류가 nums길이의 절반보다 클 때, 가장 많은 종류의 폰켓몬을 선택하는 방법과 그 폰켓몬 종류 번호의 갯수는 nums길이의 절반이고
- 그 반대는 Set의 총 길이와 같다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
import java.util.HashSet;
// 폰켓몬
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int div = nums.length / 2; 	// 길이는 항상 짝수이다.	뽑는 수

        HashSet<Integer> entrySet = new HashSet<Integer>();
        for(int i : nums) {
        	entrySet.add(i);
        }

        if(div < entrySet.size()) {
        	answer  = div;
        }else {
        	answer  = entrySet.size();
        }

        return answer;
    }
}
```

</details>
