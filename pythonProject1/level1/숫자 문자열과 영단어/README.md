# 숫자 문자열과 영단어

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/87abe575-74ac-4f68-8b54-d942bb41078d)
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/bb04ff9d-c7bb-4e83-8189-1062417304d2)

## 풀이방식

- 영단어와 숫자 문자열을 HashMap에 담아서 해결했다.
- Entryset사용은 외부 사이트를 참고했다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 숫자 문자열과 영단어
import java.util.HashMap;
import java.util.Map;
class Solution {
	public int solution(String s) {
		int answer = 0;
		HashMap<String, String> numMap = new HashMap<String, String>();
		numMap.put("zero", "0");
		numMap.put("one", "1");
		numMap.put("two", "2");
		numMap.put("three", "3");
		numMap.put("four", "4");
		numMap.put("five", "5");
		numMap.put("six", "6");
		numMap.put("seven", "7");
		numMap.put("eight", "8");
		numMap.put("nine", "9");
		
		for( Map.Entry<String, String> elem : numMap.entrySet() ){
            s = s.replaceAll(elem.getKey(), elem.getValue());
        }
		answer = Integer.parseInt(s);

		return answer;
	}
}

```

</details>
