# 두 개 뽑아서 더하기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/b1e4f21b-91f9-4ac8-823e-036f1e7e7ceb)

## 풀이방식

- ArrayList의 contains를 사용하여 해결했고
- stream의 mapToInt 사용법을 참고해서 해결했다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
import java.util.ArrayList;

// 두 개 뽑아서 더하기
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> numbersArray = new ArrayList<Integer>();
        
        for(int i=0;i<numbers.length-1;i++) {
        	for(int j=i+1;j<numbers.length;j++) {
        		if(numbersArray.contains(numbers[i] + numbers[j])) {
        			continue;
        		}else {
        			numbersArray.add(numbers[i]+numbers[j]);
        		}
        	}
        }
        
        numbersArray.sort(null);
        
        int [] answer = numbersArray.stream()
        		.mapToInt(Integer::intValue)
        	    	.toArray();

        return answer;
    }
}

```

</details>
