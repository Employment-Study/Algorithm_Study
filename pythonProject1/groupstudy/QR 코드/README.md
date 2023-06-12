# QR 코드

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/bfeee23e-66bf-488e-8fb1-e02be850377f)

## 풀이방식

- code의 모든 요소를 반복하는 for문 안에서 배열의 index가 q로 나누었을때 나머지가 r인 경우만 담기 위한 if문을 작성한다. 
- 조건에 만족하는 문자열들만 answer에 담아서 리턴해준다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// QR 코드
class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for(int i=0;i<code.length();i++) {
        	if(i%q==r) {
        		answer += code.charAt(i);
        	}
        }
        return answer;
    }
}

```

</details>
