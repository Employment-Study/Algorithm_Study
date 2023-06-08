# 문자열 계산하기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/7cfbfb19-65fc-4627-9cf2-cb4cf3713cae)

## 풀이방식

- split()과 반복문 조건문을 잘 사용하여 해결

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] elements = my_string.split(" ");
        answer += Integer.parseInt(elements[0]);	// 연산자가 없는 첫 숫자 가지기

        for(int i = 1 ; i < elements.length ; i++){
            if(i%2!=0) {
            	if(elements[i].equals("+")) {
            		answer += Integer.parseInt(elements[i+1]);
            	}else {
            		answer -= Integer.parseInt(elements[i+1]);
            	}
            }
        }
        System.out.println("answer : " + answer);
        return answer;
    }
}

```

</details>
