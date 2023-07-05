# 카드 뭉치

## 문제

![image](https://github.com/Employment-Study/Team_StudyJava/assets/44068819/9ab9392f-710a-4655-97cd-12e5e8f33f02)
![image](https://github.com/Employment-Study/Team_StudyJava/assets/44068819/d4cf9803-9742-412c-b225-f4a844f6975e)

## 풀이방식

- index Count변수를 따로 두고 풀이한다.
- goal의 가장 앞 index와 비교한다.
- goal의 가장 앞의 index의 문자열에 부합하는 것이 없다면 "No"를 리턴한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 카드 뭉치
class Solution {
	public String solution(String[] cards1, String[] cards2, String[] goal) {
		String answer = "Yes";
		int c1 = 0;
		int c2 = 0;

		for (String s : goal) {
			if (c1 < cards1.length && s.equals(cards1[c1])) {
				c1++;
			} else if (c2 < cards2.length && s.equals(cards2[c2])) {
				c2++;
			} else {
				answer = "No";
				break;
			}
		}
		return answer;
	}
}

```

</details>
