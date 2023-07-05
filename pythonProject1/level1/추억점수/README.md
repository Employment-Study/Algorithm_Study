# 추억 점수

## 문제

![image](https://github.com/LeeBG/BaekjoonHub/assets/44068819/c7740803-28e8-4c03-941e-72fdc5f24ed9)
![image](https://github.com/LeeBG/BaekjoonHub/assets/44068819/183d665d-1d20-4b6e-9c01-a826922bd143)

## 풀이방식

- HashMap에 이름과 추억 개인의 이름 점수치를 매핑하고
- photo를 반복문으로 돌려서 answer배열에 담는다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 추억점수
import java.util.Arrays;
import java.util.HashMap;

class Solution {
	public int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];
		// name과 yearning의 길이는 같다.

		HashMap<String, Integer> memoryMap = new HashMap<String, Integer>();

		for(int i=0;i<name.length;i++) {
			memoryMap.put(name[i], yearning[i]);
		}

		for(int i=0;i<photo.length;i++) {
			for(int j=0;j<photo[i].length;j++) {
				if(memoryMap.containsKey(photo[i][j])) {
					answer[i] += memoryMap.get(photo[i][j]);
				}else {
					continue;
				}
			}
		}
		return answer;
	}
}
```

</details>
