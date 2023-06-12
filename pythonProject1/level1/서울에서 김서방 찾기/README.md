# 서울에서 김서방 찾기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/4602019e-23d4-40e0-95a9-dc3e0ff772ef)

## 풀이방식

- String의 contains로 Kim의 위치를 배열에서 찾는다.
- String.format()으로 index 대입

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java

// 서울에서 김서방 찾기
class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 %d에 있다";
        int index = 0;
        for(int i=0;i<seoul.length;i++) {
        	if(seoul[i].contains("Kim")) {
        		index = i;
        	}
        }
        System.out.println("index : "+index);
        answer=String.format(answer,index);
        
        return answer;
    }
}

```

</details>
