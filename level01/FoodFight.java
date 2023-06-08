package step01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

import javax.xml.stream.util.StreamReaderDelegate;

public class FoodFight {
	public static void main(String[] args) {
		int[] food = {1,3,4,6};
		String answer= "";
		//1. 푸드의 2/1개(2/1이 1이상이어야함)를 먹을 수있다.
        //2. 1번 음식이 1개면 1을 1번, 2개면 1을 2번
        //3. 배열을 모두 돌고나면 0을 더한다.
        //4. 2번 배열을 역순으로 한 번 더 더한다.
		//5. 배열의 위치 0번은 항상 1이다.
		
		for(int i=0;i<food.length;i++) {
			food[i] = food[i]/2;
		}
		
		for(int i=0;i<food.length;i++) {
			int cnt = food[i];
			for(int j=0;j<food[i];j++) {
				answer += food[i]+"";
			}
		}
		answer +="0";
		

		for(int i=answer.length()-2; i>=0;i--) {
			answer += answer.charAt(i);
		}
	}
}
