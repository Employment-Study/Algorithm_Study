package step01;

public class Cola {
/*
 문제를 열심히 풀던 상빈이는 일반화된 콜라 문제를 생각했습니다. 이 문제는 빈 병 a개를 가져다주면 콜라 b병을 주는 마트가 있을 때, 빈 병 n개를 가져다주면 몇 병을 받을 수 있는지 계산하는 문제입니다. 기존 콜라 문제와 마찬가지로, 보유 중인 빈 병이 a개 미만이면, 추가적으로 빈 병을 받을 순 없습니다. 상빈이는 열심히 고심했지만, 일반화된 콜라 문제의 답을 찾을 수 없었습니다. 상빈이를 도와, 일반화된 콜라 문제를 해결하는 프로그램을 만들어 주세요.

콜라를 받기 위해 마트에 주어야 하는 병 수 a, 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수 b, 상빈이가 가지고 있는 빈 병의 개수 n이 매개변수로 주어집니다. 상빈이가 받을 수 있는 콜라의 병 수를 return 하도록 solution 함수를 작성해주세요.

제한사항
1 ≤ b < a ≤ n ≤ 1,000,000
정답은 항상 int 범위를 넘지 않게 주어집니다.

입출력 예
		a	b	n	result
예시1번	2	1	20	19
예시2번	3	1	20	9

단, 보유 중인 빈 병이 2개 미만이면, 콜라를 받을 수 없다.

본문에서 설명한 예시입니다.
입출력 예 #2

빈 병 20개 중 18개를 마트에 가져가서, 6병의 콜라를 받습니다. 이때 상빈이가 가지고 있는 콜라 병의 수는 8(20 – 18 + 6 = 8)개 입니다.
빈 병 8개 중 6개를 마트에 가져가서, 2병의 콜라를 받습니다. 이때 상빈이가 가지고 있는 콜라 병의 수는 4(8 – 6 + 2 = 4)개 입니다.
빈 병 4 개중 3개를 마트에 가져가서, 1병의 콜라를 받습니다. 이때 상빈이가 가지고 있는 콜라 병의 수는 2(4 – 3 + 1 = 2)개 입니다.
3번의 교환 동안 상빈이는 9(6 + 2 + 1 = 9)병의 콜라를 받았습니다.
 */
	
// 	예시 1번 
//	첫 교환 reuslt += 10, n =10
//	두번째 result += 5 , n = 5
//	세번째 result += 2 , n = 3
//	네번쨰 result += 1 , n = 2
//	다섯번째 result += 1 , n= 1
	
//조건. n<2 
//1.  n = n%a + (20/a)*b   ,     result += (n/a)*b
	public static void main(String[] args) {
		int n = 20;
		int a = 3;
		int b =1;
		int result =0;
	while(n>=2) {
		result += (n/a)*b;
		n= (n%a) + ((n/a)*b);
		if(n<a) break;
	}
	System.out.println(result);
	}
}
