package Quiz;

// 조건에 맞게 수열 반환하기2
//class Solution {
//    public int solution(int[] arr) {
//    	 int answer = 0;
//    	 int count = 0;
//         // 갈아와 같아질 기준,범위 배열 필요함
//    	 int[] tmpArray = new int[arr.length];
//    	 
//    	 while(count != arr.length) {
//    		 count = 0;
//    		 tmpArray = arr.clone();
//    		 
//    		 for(int i = 0; i < arr.length; i++) {
//    			 if(arr[i] >= 50 && arr[i] % 2 == 0) {
//    				 arr[i] /= 2;
//    			 }
//    			 else if (arr[i] < 50 && arr[i] % 2 != 0) {
//    				 arr[i] = arr[i] * 2 + 1;    				     				 
//    			 }
//    			 
//    			 if(arr[i] == tmpArray[i]) count++;
//    		 }
//    			 answer++;      
//         }
//         
//         return answer-1;
//    }
//}
public class Solution2 {
	// 배열에 값이 50보다 크거나 같은 짝수라면 2로 나누고
	// 배열의 값이 50보다 작은 홀수라면 2를 곱하고 다시 1을 더한다
	// 배열의 길이를 정확히 출력해야 한다
	// 같을때 index를 answer로 반환하게 식을 작성하면 된다
	// 그러기 위해서는 기준이 필요하고 그 기준에 도달했을때 특정값이 필요하다
	
	// index의 작은 값을 반환하는 마지막 단계를 따롱리지 못하여 다른 식 참고함
	// index의 i에 값을 더하고 index가 같을때 반환하는 부분에서 헤맸다
	
}
