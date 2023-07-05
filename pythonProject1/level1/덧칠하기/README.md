# 덧칠하기

## 문제

![image](https://github.com/Employment-Study/Team_StudyJava/assets/44068819/5fcb0f71-f5bb-4630-87d8-8560029fc3bd)
![image](https://github.com/Employment-Study/Team_StudyJava/assets/44068819/4043ceca-4b4c-4806-b840-144dedc03bbb)
![image](https://github.com/Employment-Study/Team_StudyJava/assets/44068819/da01dd03-0006-4b58-bae2-883c84f86796)

## 풀이방식

- 여기서 n은 크게 상관없다.
- section에서 빈값의 index로만 계산한다.
- section[0]부터 롤러의 길이를 더해서 그 더한 색칠영역이
- section의 다음 index(section[1])과 겹치면 그 다음 index 확인해서 겹치는지 체크하고 안겹치면 그 index부터 다시 칠한다.
- 칠할때마다 count해서 answer로 반환한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 덧칠하기
class Solution {
	public int solution(int n, int m, int[] section) { // 2 3 6 [m = 4] max = 6
		int answer = 0;
		int max = 0;

		for (int i = 0; i < section.length; i++) {
			if (section[i] < max) {
				continue;
			}

			answer += 1;
			max = section[i] + m;
		}

		return answer;
	}
}

```

</details>
