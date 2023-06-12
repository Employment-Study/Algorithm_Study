# 음양 더하기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/299c408d-7787-4c49-ac05-afe2edd4c957)

## 풀이방식

- if조건문으로 true/false 구분해서 -1 곱하거나 그대로 배열에 저장
- 반복문으로 배열의 모든 요소를 더함

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java

// 음양 더하기
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] tmp = new int[absolutes.length];
        
        for(int i=0;i<absolutes.length;i++) {
        	if(signs[i]) {
        		tmp[i]=absolutes[i];
        	}else {
        		tmp[i]= -1 * absolutes[i];
        	}
        } 
        for(int n : tmp) {
        	answer += n;
        }
        return answer;
    }
}

```

</details>
