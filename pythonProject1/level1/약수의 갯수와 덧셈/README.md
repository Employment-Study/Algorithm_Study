# 약수의 갯수와 덧셈

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/76ab651c-0ab4-4b7f-a4df-8193ff3aaed3)

## 풀이방식

- 약수의 갯수를 담는 배열 counts를 만들어서 약수의 갯수를 배열에 담고 약수의 갯수의 홀수와 짝수에 따라 연산한 결과를
- answer에 연산해서 반환한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 약수의 갯수와 덧셈
class Solution {
	public int solution(int left, int right) {
		int answer = 0;	// 약수의 갯수로 연산을 한 값
		int[] counts = new int[right-left+1]; // 약수의 갯수를 담을 배열
		int count = 0;
		// 약수의 갯수를 배열에 담기
		for(int i=left;i<right+1;i++) {
			for(int j=1;j<i+1;j++) {
				if(i%j==0) {
					count++;
				}
			}
			counts[i-left]=count;
			count = 0;
		}
		for(int i=0;i<counts.length;i++) {
			if(counts[i] % 2 == 0)
				answer += (left+i);
			else
				answer -= (left+i);
		}
		return answer;
	}
}
```

</details>
