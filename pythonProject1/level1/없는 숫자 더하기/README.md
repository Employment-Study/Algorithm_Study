# 없는 숫자 더하기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/9a6be3e5-b7ac-4776-adf1-f8fe25f3fee8)

## 풀이방식

- 이중 for문으로 1~9까지 없는 숫자를 검사하여 answer에 더함 

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java

// 없는 숫자 더하기
class Solution {
	public int solution(int[] numbers) {
		int answer = 0;
		
		for(int i=1;i<10;i++) {
			for(int j=0;j<numbers.length;j++) {
				if(numbers[j]==i) {
					break;
				}
				if(j==(numbers.length-1)) {
					answer += i;
				}
			}
		}
		return answer;
	}
}

```

</details>
