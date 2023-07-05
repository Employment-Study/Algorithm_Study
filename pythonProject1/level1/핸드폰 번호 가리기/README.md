# 핸드폰 번호 가리기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/a938e614-881f-49e7-a61a-23a649a3531e)

## 풀이방식

- 전화번호 길이의 -4만큼을 index로 잡고
- 그 길이만큼 *을 더한 문자열 star를 만든다.
- 0에서 index-1까지 star로 replace한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 핸드폰 번호 가리기
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int index = phone_number.length()-4;
        String star = "";
        for(int i=0;i<index;i++) {
        	star += "*";
        }
        answer = phone_number.replace(phone_number.substring(0,index), star) ;
        
        return answer;
    }
}

```

</details>
