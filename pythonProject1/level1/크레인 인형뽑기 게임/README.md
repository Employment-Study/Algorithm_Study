# 크레인 인형 뽑기게임

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/fa811b63-2ca7-4382-9724-06f5b1cd69e9)
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/81d6b174-b8ae-4cbc-9785-f2a42178f828)
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/6c5da882-00dd-48c7-9727-4374cdecc2bd)
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/1afd48d0-7705-4988-8b9b-b865ee86ccbf)

## 풀이방식

- Integer 제네릭 타입을 가지는 ArrayList를 활용한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 크레인 인형 뽑기게임
class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		ArrayList<Integer> basket = new ArrayList<Integer>();

		for (int i = 0; i < moves.length; i++) {
			int index = moves[i] - 1;
			// index번째 인형을 꺼낸다.
			for (int j = 0; j < board.length; j++) { // 인형이 담긴 통은 N x N
				if (board[j][index] != 0) {
					int size = basket.size();
					if (size >= 1 && board[j][index] == basket.get(size - 1)) {
						basket.remove(size - 1);
						answer += 2;
					} else {
						basket.add(board[j][index]); // 꺼낸 인형을 바구니에 넣는다
					}
					board[j][index] = 0;
					break;
				}
			}
		}
		return answer;
	}
}
```

</details>
