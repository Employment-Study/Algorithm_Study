# 신규 아이디 추천

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/4602019e-23d4-40e0-95a9-dc3e0ff772ef)

## 풀이방식

- 1단계 toLowerCase()로 소문자로 치환
- 2단계 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거를 ASCII코드 참고해서 조건 나눠서 풀었음
- 3단계 반복문 돌리면서 contains()를 사용해 ..가 있는지 확인 후 ..를 .으로 치환
- 4단계 첫 자리 .는 indexOf로 마지막 .는 charAt()으로 마침표 ASCII코드를 검사
- 5단계 isEmpty로 비어있는 String인지 검사
- 6단계 subString(0,15)로 16자 이상이면 잘라내도록 구현
- 7단계 배열의 길이가 2 이하일때 while조건문으로 3이상이 될 때 까지 마지막 문자를 덧 붙인다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java

// 신규 아이디 추천
class Solution {
    public String solution(String new_id) {
    	String answer = "";
    	answer = new_id;
    	// 1단계
    	answer= answer.toLowerCase();
    	
    	// 2단계
    	for(int i =0;i<answer.length();i++) {
    		if(answer.charAt(i)>96 && answer.charAt(i)<123) {
    			// 소문자
    			continue;
    		}else if(answer.charAt(i)>=48 && answer.charAt(i)<58) {
    			continue;
    		}else if(answer.charAt(i)==45 || answer.charAt(i)==95 || answer.charAt(i)==46) {
    			continue;
    		}else {
    			answer = answer.replace(String.valueOf(answer.charAt(i)), "");
    			i--;
    		}
    	}

    	// 3단계
    	for(int i=0;i<answer.length();i++) {
    		if(answer.contains("..")) {
    			answer = answer.replace("..", ".");
    		}
    	}
    	
    	// 4단계
    	while(answer.indexOf('.') == 0) {
    		answer= answer.substring(1);
    	}
    	
    	while(answer.length()>0 && answer.charAt(answer.length()-1) == 46) {
    		if(answer.length()-1>0) {
    			answer= answer.substring(0,answer.length()-1);
    		}else {
    			answer="";
    		}
    	}
    	
    	//5단계
    	if(answer.isEmpty()) {
    		answer += "a";
    	}
    	
    	//6단계
    	if(answer.length()>=16) {
    		answer = answer.substring(0,15);
    	}
    	// 4번 카피(끝자리 .검사)
    	while(answer.length()>0 && answer.charAt(answer.length()-1) == 46) {
    		answer= answer.substring(0,answer.length()-1);
    	}
    	
    	//7단계
    	char ch = answer.charAt(answer.length()-1);
    	while(answer.length()<3) {
    		answer+=ch;
    	}
    	
        return answer;
    }
}

```

</details>
