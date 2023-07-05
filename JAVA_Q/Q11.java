package p7_1;

import java.util.Arrays;

public class Q1 {
	
	

	public int solution(String[] strArr) {
	        int answer = 0;
	        int[] count = new int[30];
	        for(int i = 0; i < strArr.length; i++) {
	        	count[strArr[i].length()]++;
	        }
	        
	        answer = Arrays.stream(count).max().getAsInt();
	        return answer;
	 }
	
	
	
	
	public static void main(String[] args) {
		
		Q1 q1 = new Q1();
		String[] strArr= {"bc","hi"};
	
		System.out.println(q1.solution(strArr));
		
		
	}
}
