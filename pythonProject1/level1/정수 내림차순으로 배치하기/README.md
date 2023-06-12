# 정수 내림차순으로 배치하기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/f17470ff-6827-47ea-a0ba-9887bb897b80)

## 풀이방식

- long형 숫자를 String.valueOf(n) String으로 변환한후 split으로 한자한자 배열로 나눈다.
- Arrays.sort()로 String 배열을 정렬하고
- StringBuilder에 String 배열요소들을 하나하나 담아서 reverse() 내림차순변경해서 toString()으로 바꿔준결과를
- parseLong으로 long타입으로 변환한 값을 리턴시킨다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 정수 내림차순으로 배치하기
import java.util.Arrays;

class Solution {
    public long solution(long n) {
    	String[] n_list = String.valueOf(n).split("");
    	Arrays.sort(n_list);
    	
    	long answer = 0;
    	StringBuilder sb = new StringBuilder();
    	for(String e : n_list) {
    		sb.append(e);
    	}
        answer = Long.parseLong(sb.reverse().toString());
        return answer;
    }
}
```

</details>
