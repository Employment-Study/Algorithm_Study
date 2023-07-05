package week5_2;

import java.util.Arrays;
// 수열과 구간 쿼리4

class Solution {
    public  int[] solution(int[] arr, int[][] queries) {
   
        for(int[] query : queries) {
        	int s = query[0];// 하나의 쿼리 원소에 해당하는 위치를 대입
        	int e = query[1];
        	int k = query[2];
        	
       for(int i = s; i <= e; i++) {// s<=i이기 때문에 i =s로 할 수 있다.
    	if(i % k ==0) arr[i]++; // i가  k의 배수이면 i는 1더함
       }// 해당없다면 이중 for문 반복 완료 후 
    }// for문 종료
        System.out.println(Arrays.toString(arr));
        return arr; //for문 끝나면 arr리턴
}
}
public  class Q1 {
	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		int[] arr = {0,1,2,4,3}; 
		
		
		int[][] queries = {
				//하나의 쿼리{s,e,k}
				{0,4,1},
				{0,3,2}, 
				{0,3,3}
				
		};
		int[] z = s.solution(arr, queries);
		System.out.println(Arrays.toString(z));
		
	}
}


