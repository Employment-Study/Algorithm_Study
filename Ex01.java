package day06;

public class Ex01 {
	  static int solution(String my_string) {
	    	int answer = 0;
	    	String[] arr =  my_string.split(" ");
	    	answer = Integer.parseInt(arr[0]);
	    	for(int i =0; i<arr.length; i++) {
	        	if(i%2!= 0) {
		    		if(arr[i].equals("+")) {
		    			answer +=  Integer.parseInt(arr[i+1]);
		    		}
		    		else if (arr[i].equals("-")) {
		    			answer -= Integer.parseInt(arr[i+1]);
		    		}
		    	}
	    	}
	    	return answer;
	  }
	  
	public static void main(String[] args) {
		String my_string = "3 + 4";
		System.out.println(solution(my_string));
		
	}

}
