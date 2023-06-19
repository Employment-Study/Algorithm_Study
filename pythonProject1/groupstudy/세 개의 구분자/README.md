# 세 개의 구분자

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/62654757-e4d0-425d-9971-4c9feafcbeab)

## 풀이방식

- 삼중 for문과 ArrayList를 사용하여 해결하였다.
- 정규 표현식으로 replaceAll("[a|b|c]"," ")로 처리하여 해결하는 방법도 있다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 세 개의 구분자
import java.util.ArrayList;

class Solution {
	public String[] solution(String myStr) {
		String[] answer = {};
		ArrayList<String> strList = new ArrayList<String>();

		answer = myStr.split("a");
		for(int i=0;i<answer.length;i++) {
			String[] answer2 = answer[i].split("b");
			for(int j=0;j<answer2.length;j++) {
				String[] answer3 = answer2[j].split("c");
				for(int k=0; k<answer3.length;k++) {
					if(!answer3[k].isEmpty()) {
						strList.add(answer3[k]);
					}
				}
			}
		}

		if(strList.isEmpty()) {
			strList.add("EMPTY");
		}

		int listSize = strList.size();
		answer = strList.toArray(new String[listSize]);

		return answer;
	}
}
```

</details>
