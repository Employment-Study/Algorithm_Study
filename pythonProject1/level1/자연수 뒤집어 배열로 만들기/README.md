# 자연수 뒤집어 배열로 만들기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/9c19e6ee-c25e-4b66-aa11-5e6eee957165)

## 풀이방식

- long형변환에 유의하며하여 반복문을 통해 자연수를 뒤집어 배열에 저장한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 자연수 뒤집어 배열로 만들기

class Solution {
    public int[] solution(long n) {
    	int length = Long.toString(n).length();
        int[] answer = new int[length];
        for(int i =0;i<length;i++) {
        	answer[i] = (int)(n % 10);
        	n /= 10;
        }
        return answer;
    }
}
```

</details>
