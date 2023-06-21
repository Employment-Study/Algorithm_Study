# 가장 가까운 같은 글자

## 문제

![image](https://github.com/LeeBG/BaekjoonHub/assets/44068819/3b6bc3d6-d85d-4e6a-93c5-929f9861bc57)

## 풀이방식

- HashMap<Character, Integer>를 사용하여 글자 별 index를 저장하는 HashMap을 하나 만든다.
- 글자마다 value를 갱신하면서 차이를 계산해 answer 배열에 담아준다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
import java.util.Arrays;
import java.util.HashMap;

// 가장 가까운 같은 글자
class Solution {
    public int[] solution(String s) {

        int[] answer = new int[s.length()];
        HashMap<Character, Integer> indexMap = new HashMap<Character, Integer>();

        for(int i=0;i<s.length();i++) {
        	if(indexMap.containsKey(s.charAt(i))) {
        		answer[i] = i - (indexMap.get(s.charAt(i)));
        		indexMap.put(s.charAt(i), i);
        	}else {
        		indexMap.put(s.charAt(i),i);
        		answer[i] = -1;
        	}
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
```

</details>
