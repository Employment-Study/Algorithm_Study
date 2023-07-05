# 수박수박수박수박수박수?

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/ec7dd953-9f48-476b-82f8-2eb164aadeba)

## 풀이방식

- StringBuilder로 짝수 홀수 index에 따라 "수","박"문자열을 append한다음
- 최종적으로 StringBuilder객체를 String으로 변환해서 리턴한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 수박수박수박수박수박수?
class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
        	if(i%2==0) {
        		sb.append("수");
        	}else {
        		sb.append("박");
        	}
        }
        answer = sb.toString();
        return answer;
    }
}
```

</details>
