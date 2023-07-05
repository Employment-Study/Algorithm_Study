# 콜라문제

## 문제

![image](https://github.com/LeeBG/BaekjoonHub/assets/44068819/8bd3e394-09a3-4ede-8aef-52a27604069b)
![image](https://github.com/LeeBG/BaekjoonHub/assets/44068819/3d368c48-f8ef-4da4-8bd3-5356eecaa632)

## 풀이방식

- while문으로 남은 콜라 병 수 n이 나눌수 있는 병 수 a보다 클 때 계속해서 반복한다.
- 남은 병수가 a에 딱 맞게 떨어지면 나눈 몫이 그대로 n으로 된다.
- 병을 바꾼 횟수는 n개
- 딱 맞게 떨어지지 않으면 remain에 남는다.
- 나중에 나눌 때 remain을 같이 더하기 위해서 반복문의 가장 마지막에는 n에 remain을 더해서 다음 분가의 반복문에 쓰이게 한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 콜라문제
class Solution {
	public int solution(int a, int b, int n) {
		int answer = 0;
		int remain = 0;
		
		
		while(n >=  a) {
			if(n%a == 0) {
				n = (n/a)*b;
				answer += n;	
			}else {
				remain = n%a;
				n = (n/a)*b;
				answer += n;
				n += remain;
			}
			System.out.println(answer);
		}
		
		return answer;
	}
}
```

</details>
