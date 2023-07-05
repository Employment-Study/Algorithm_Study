# 같은 숫자는 싫어

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/24ae0739-760d-4efd-94c1-60f4c9d5e555)

## 풀이방식

- Integer스택을 만들어서 peek을 이용해 중복된 값을 검사하고 중복되지 않으면
- push(스택에 쌓는다)
- 반복문을 통해 스택의 내용을 배열에 담는다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 같은 숫자는 싫어
import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> arrStack = new Stack<Integer>();

        for(int i=0;i<arr.length;i++) {
        	if(arrStack.isEmpty() || (!arrStack.isEmpty() && arr[i] != arrStack.peek())) {
        		arrStack.push(arr[i]);
        	}
        }

        int[] answer = new int[arrStack.size()];

        for(int i=answer.length-1;i>=0;i--) {
        	answer[i] = arrStack.pop();
        }

        return answer;
    }
}
```

</details>
