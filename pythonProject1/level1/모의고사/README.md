# 모의고사

## 문제

![image](https://github.com/Employment-Study/Team_StudyJava/assets/44068819/6c0215d7-0809-4fbc-aaf9-85df3953fcc4)

## 풀이방식

- first, second, thirt 각각의 패턴대로 반복문들 돌려서 맞춘 갯수를 matches에 담는다.
- index마다의 값을 Math.max()로 최대값 비교해서 최대값을 가지는 index+1(1부터 시작이니까)을 리스트에 담아서 최종 배열에 반환한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java

import java.util.ArrayList;
import java.util.Arrays;

// 모의고사
class Solution {
	public int[] solution(int[] answers) {
		int[] answer = new int[3];
		int[] matches = new int[3];
		int[] first = { 1, 2, 3, 4, 5 };
		int[] second = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] third = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int max = 0;
		int n = answers.length;
		int count = 0;
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == first[i % 5])
				matches[0]++;
			if (answers[i] == second[i % 8])
				matches[1]++;
			if (answers[i] == third[i % 10])
				matches[2]++;
		}
		
		
		max = Math.max(matches[0], Math.max(matches[1],matches[2]));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<matches.length;i++) {
			if(matches[i] == max) {
				list.add(i+1);
			}
		}
		answer = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			answer[i] = list.get(i); 
		}

		return answer;
	}
}

```

</details>
