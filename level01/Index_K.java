package step01;

import java.util.ArrayList;
import java.util.Arrays;


public class Index_K {
public static void main(String[] args) {
	int[] array = {1,5,2,6,3,7,4};
	int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
	ArrayList<Integer> arr = new ArrayList<Integer>();
	int[] answer = new int[commands.length];
	
	
	//사용한 메서드 copOfRange
	//배열의 범위를 지정해서 그대로 복사하는 메서드
	
	for(int i=0; i<commands.length;i++) {
		int[] temp= Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
		Arrays.sort(temp);
		answer[i] = temp[commands[i][2]-1];
	}
	
	System.out.println(Arrays.toString(answer));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
															//  	0		1			2
//	for(int i=0; i<commands.length; i++) {					//{2, 5, 3}, {4, 4, 1}, {1, 7, 3} 꺼냄
//		// 각 역할을 지정
//		int[] commandsArr = commands[i];						//{2,5,3}
//		int start = (commandsArr[0]-1);						//1
//		int end = (commandsArr[1]-1);							//4
//		int select = commandsArr[2]-1;						//2
//		//반복문을 통해 새로운 정렬된 배열을 만든다.
//		// start 부터 end까지 배열 가져오기
//		for(int j =start; j<=end ; j++) {
//			arr.add(array[j]);								
//		}
//		Collections.sort(arr);
//		answer[i] = (arr.get(select));					//오류가 생긴 이유 내가 이미 자른 배열에서 start+select를 하려고했다... 
//		arr.clear();
//		
//	}
//	
//	System.out.println(Arrays.toString(answer));
//	
	
	
	
}
}
