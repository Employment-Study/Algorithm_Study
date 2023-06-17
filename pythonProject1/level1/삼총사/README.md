# 삼총사

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/2d983b66-cc9a-46be-a897-b000f4a9c347)

## 풀이방식

- 삼중 for문을 이용해 해결하였음

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 삼총사
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0;i<number.length-2;i++) {
        	for(int j=i+1;j<number.length-1;j++) {
        		for(int k=j+1;k<number.length;k++) {
        			if(number[i]+number[j]+number[k] == 0) {
        				answer += 1;
        			}
        		}
        	}
        }
        return answer;
    }
}
```

</details>
