package week5_2;

import java.util.Arrays;

//배열의 길이를 2의 거듭제곱으로 만들기
public class Q3 {
	



	public int[] solution(int[] arr) {
	        int len = arr.length;
	        int tmp = 1;
	        
	        while(tmp < len) {
	        	tmp *= 2;
	        	
	        }
	        
	        int[] answer = new int[tmp];
	       
	      
	        for(int i = 0; i <arr.length; i++) {
	        			answer[i] = arr[i];
	        	}
	        	
	        System.out.println(tmp);
	        System.out.println(Arrays.toString(arr));
	        System.out.println(Arrays.toString(answer));
	   
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		Q3 s = new Q3();
	int[] arr = {1, 2, 3, 4, 5, 6};
		
		int[] z = s.solution(arr);

		System.out.println(Arrays.toString(z));
		
	}

}
