# 하샤드 수

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/ffc337c3-8bc6-4a29-a5f8-941e7b8c3bd3)

## 풀이방식

- String.valueOf().split()으로 각 자릿수를 String배열에 담는다.
- 담은 배열을 하나 하나 더해서 각 자리 수의 합을 구한다(sum)
- 값 x에서 각 자리 숫자를 나눈 나머지가 0이면 true아니면 false를 리턴한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 하샤드 수
class Solution {
    public boolean solution(int x) {
    	String[] arr = String.valueOf(x).split("");
    	boolean answer = false;
    	int sum = 0;
    	for(String e : arr) {
    		sum += Integer.parseInt(e);
    	}
    	if(x % sum == 0) answer =true;
        
        return answer;
    }
}

```

</details>
