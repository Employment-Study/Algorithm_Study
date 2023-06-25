# 문자 갯수 세기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/b98034fc-be33-477d-be63-1858b07cbe96)

## 풀이방식

- HashMap을 사용하여 모든 알파벳(대소문자)을 Key로 두고 그 갯수를 반복문으로 구해서
- 최종적으로 answer에 누적된 각 알파벳들의 값을 반환받아서 answer를 마지막으로 반환한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
import java.util.Arrays;
import java.util.HashMap;
// 문자 갯수 세기
class Solution {
	public int[] solution(String my_string) {
		int[] answer = new int[52];	// 총 알파벳 갯수 26 x 2
		HashMap<Character, Integer> stringMap = new HashMap<Character, Integer>();

		for(int i='A';i<='z';i++) {
			if(i < 91 || i > 96)
				stringMap.put((char) i,0);
		}

		for(int i=0;i<my_string.length();i++) {
			if(stringMap.containsKey(my_string.charAt(i))) {
				stringMap.put(my_string.charAt(i),stringMap.get(my_string.charAt(i))+1);
			}
		}

		for(int i=0;i<answer.length/2;i++) {
			answer[i] = stringMap.get((char) (65+i));
		}

		for(int i=answer.length/2;i<answer.length;i++) {
			answer[i] = stringMap.get((char) (71+i));
		}

		return answer;
	}
}

```

</details>
