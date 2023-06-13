# 최대공약수와 최소공배수

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/ec2216e6-727e-449a-8770-dded004e02fd)

## 풀이방식

- 유클리드 호재법으로 최대공약수를 구한다.
- n,m을 곱한 값에 최대 공약수를 나누면 최소공배수다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 최대 공약수와 최소 공배수
class Solution {
	public int gcf(int n, int m) {
		int r = 0;
		// m은 무조건 더 큰수로 친다.
		if (m < n) {
			int tmp = n;
			n = m;
			m = tmp;
		}
		while (m > 0) {
			r = n % m;
			n = m;
			m = r;
		}
		return n;
	}

	public int[] solution(int n, int m) {
		int[] answer = new int[2];

		answer[0] = gcf(n,m);

		answer[1] = n * m / answer[0];

		System.out.println("answer : "+Arrays.toString(answer));
		return answer;
	}
}

```

</details>
