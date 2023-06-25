# 영어 끝말잇기

## 문제
---
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/3de9ae1a-ba12-420b-ae85-679c9e8a8a58)
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/8cd091db-e724-4f23-9397-5745f6141403)
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/7064175f-a850-40bd-9ed0-900a3f5e0ae8)

## 풀이방식
- Collection에서 Stack을 사용했음
- stack의 peek으로 바로이전의 값으로 끝 글자와 현재의 첫 글자을 비교할 수 있고
- stack에 들어있는 이전의 값들을 비교할 수 있다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
import java.util.Arrays;
import java.util.Stack;
// 영어 끝말 잇기
class Solution {
	public int[] solution(int n, String[] words) {		// n은 참여자의 수
		int[] answer = new int[2];						// 2 ~ 10명
		int step = 1;									// 1단계
		int count = 0;									
		char prev = 1;									// 이전 단어
		
		Stack<String> wordStack = new Stack<String>();					// 단어 저장 및 STACK
		
		loop1:for(String s : words) {
			if (!wordStack.isEmpty())
				prev = wordStack.peek().charAt(wordStack.peek().length()-1);
			if(wordStack.isEmpty()) {							// 비었으면 바로 push
				wordStack.push(s);
				count++;
			}else if(prev == s.charAt(0)) {						// 뒷자리와 앞자리가 일치하고 
				for(String pwords : wordStack) {				// 중복 x
					if(pwords.equals(s)) {						// 중복
						count++;								
                        answer[0] = count;
			            answer[1] = step;
						break loop1;							// 라벨링으로 바깥 for문 탈출
					}
				}
				// 중복 검사 마저 끝났으면
				wordStack.push(s);
				count++;
			}else {												// 앞자리 불일치
				count++;
                answer[0] = count;
			    answer[1] = step;
				break;
			}
			if(count == n) {									// index계산
				count = 0;
				step += 1;
			}	
		}// end of for		
		return answer;
	}
}

```
</details>