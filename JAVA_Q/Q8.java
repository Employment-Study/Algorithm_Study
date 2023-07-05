package week6_2;
// 문자열 계산하기
public class Q2 {
	 public int my_st(String my_string) {
	        int answer = 0;
	        
	        String[] arr = my_string.split(" ");
	        
	        answer += Integer.parseInt(arr[0]);
	        
	        for(int i = 1; i<arr.length-1;i++) {
	        	if(arr[i].equals("+")) {
	        		answer += Integer.parseInt(arr[i+1]);
	        	} 
	        	else if(arr[i].equals("-")) {
	        		answer -= Integer.parseInt(arr[i+1]);
	        	}
	       }
	        return answer;
	    }
	
	public static void main(String[] args) {
		Q2 q2 = new Q2();
		System.out.println(q2.my_st("3 - 4 + 2 + 1"));
	}

}
