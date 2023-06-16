package step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Stream;

/*
	 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
	
	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	
	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	
	제한 조건
	시험은 최대 10,000 문제로 구성되어있습니다.
	문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
	가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
	
	입출력 예
	answers		return
	[1,2,3,4,5]	[1]
	[1,3,2,4,2]	[1,2,3]
 */

public class MockExam {
	
public static void main(String[] args) {
		// 1번 : [1,2,3,4,5]
		// 2번 : [2,1,2,3,2,4,2,5]
		// 3번 : [3,3,1,1,2,2,4,4,5,5]
	
	int[] answers = {1,2,3,4,5,2,1,2,3,2,1,2,3,4,5,2,1,2,3,2};
	int[] num1 = {1,2,3,4,5};				//5개씩 반복
	int[] num2 = {2,1,2,3,2,4,2,5};			//8개씩 반복
	int[]  num3 = {3,3,1,1,2,2,4,4,5,5};	//10개씩 반복
	
	int n1=0;
	int n2=0;
	int n3=0;
	for(int i=0; i<answers.length;i++) {
		if(num1[i%5]== answers[i]) n1+=1;
		if(num2[i%8]== answers[i]) n2 +=1;
		if(num3[i%10]== answers[i]) n3 +=1;
	}
	int max = Math.max(n1, Math.max(n2, n3));
	
	ArrayList<Integer> arr = new ArrayList<Integer>(3);
	
		if(max == n1) arr.add(1);
		if(max == n2) arr.add(2);
		if(max == n3) arr.add(3);
	
	arr.trimToSize();
	
	
	System.out.println(arr.size());
int[] answer = new int[arr.size()];
for(int i=0; i<arr.size();i++) 
	answer[i] = arr.get(i);
	
System.out.println(Arrays.toString(answer));
//	answer = Arrays.stream(answer).filter(i -> )
	
	
	
		
	}
}
