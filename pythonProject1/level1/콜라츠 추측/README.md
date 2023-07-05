# 콜라츠 추측

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/baa3e113-bb05-4c47-8f14-37a2991a89af)

## 풀이방식

- while 문으로 1이 될 때까지 반복한다.
- 짝수는 2를 나누고 홀수는 3을 곱하고 1을 더하는데 int의 범위인 약 21억을 넘아가는 경우가 생길 수 있으므로 long으로 형변환을 해준다.
- 500 번의 과정을 넘어가는 경우에는 -1을 리턴하도록 한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 콜라츠 추측
class Solution {
    public int solution(int num) {
        int answer = -1;
        int count = 0;
        
        long num2 = (long)num;
        
        while(num2 != 1) {
        	if(num2 % 2 == 0) {	// 짝수이면
        		num2 /= 2;
        	}else {				// 홀수이면
        		num2 = num2*3 + 1;
        	}
        	count++;	
        }
        
        if(count < 500) {
        	answer = count;
        }      
        
        return answer;
    }
}
```

</details>
