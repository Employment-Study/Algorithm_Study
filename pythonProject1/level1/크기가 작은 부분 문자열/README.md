# 크기가 작은 부분 문자열

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/39a517f4-143f-4ee1-856a-84603c4f09c2)

## 풀이방식

- 크기가 작은 문자열을 while과 subString으로 length값을 이용해서 잘 잘라준다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 크기가 작은 부분 문자열
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        
        int num = 0;
        while(num+length<=t.length()) {
        	long sub = Long.parseLong(t.substring(num, num+length));
        	if(sub <= Long.parseLong(p)){
        		answer += 1;
        	}
        	num++;
        }
        return answer;
    }
}

```

</details>
