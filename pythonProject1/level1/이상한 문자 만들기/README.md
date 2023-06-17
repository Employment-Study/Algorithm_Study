# 이상한 문자 만들기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/0877ecf0-f5d4-4055-834b-767a3ac16dd9)

## 풀이방식

- String.split("")로 모든 문자열의 요소들을 하나씩 배열에 담는다.
- 띄워쓰기 공백의 경우는 index를 0으로 초기화 하고 다음 단어들의 index를 다시 셀수 있도록 해준다.
- 단어의 index중 홀수는 소문자 짝수는 대문자로 String의 toLowerCase(),toUpperCase()를 사용해준다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 이상한 문자 만들기
class Solution {
	public String solution(String s) {
		String answer = "";
		String[] e = s.split("");
		int index = 0;
		for(int i=0;i<e.length;i++) {
			if(e[i].equals(" ")) {
				index = 0;
			}else if(index % 2 == 0) {
				e[i] = e[i].toUpperCase();
				index++;
			}else if(index % 2 == 1) {
				e[i] = e[i].toLowerCase();
				index++;
			}
			answer += e[i];
		}
		return answer;
	}
}
```

</details>
