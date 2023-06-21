# 푸드 파이트 대회

## 문제

![image](https://github.com/LeeBG/BaekjoonHub/assets/44068819/5ad27163-6b98-48ba-b113-06ce7eaf4248)
![image](https://github.com/LeeBG/BaekjoonHub/assets/44068819/6e75435c-4a4e-49b3-adb1-71fa388047bc)


## 풀이방식

- 0번 음식인 물의 갯수+1을 나누어 음식을 섭취하고 사이에 물을 마시도록 반복문을 만들었다.
- 물 갯수가 홀수이면 짝수 번 짝수이면 홀수 번 음식을 섭취하는 횟수를 나눈다. 

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 푸드 파이트 대회
class Solution {
    public String solution(int[] food) {
        String answer = "";
        int n  = food[0];		 // 1
        
        while(n !=  0) {
        	for(int i=1;i<food.length;i++) {
            	for(int j=0;j<(food[i])/(n+1);j++) {
            		answer += i;
            	}
            }
        	answer += 0;
        	if(n%2 == 0) {
        		break;
        	}else {
        		for(int i=food.length-1;i>=0;i--) {
                	for(int j=0;j<(food[i])/(n+1);j++) {
                		answer += i;
                	}
                }
        	}
        	n--;
        }
        return answer;
    }
}
```

</details>
