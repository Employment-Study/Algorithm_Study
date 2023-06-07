package Quiz;

// 수열과 구간 쿼리 4
//class Solution {
//    public int[] solution(int[] arr, int[][] queries) {
//       for(int[] quer : queries) {	// 1차원배열 형식으로  quer배열에 그대로 담는다
//    	   int s = quer[0];			// 정수 형태의 int s에 배열의 0번 index를 잠는다
//    	   int e = quer[1];			// 마찬가지로 1번 index를  e에 담는다
//    	   int k = quer[2];			// 마찬가지로 2번 index를 k에 담는다
//    	   
//    	   if( k == 0 ) {			// k에 담긴 배열의 2번 index가 짝수이면 진입
//    		   if( s == 0 ) {		// s에 담긴 index가 짝수이먄 진입
//    			   arr[0]++;		// 그리고 arr배열의 값을 1증가
//    			   continue;		// 여기 조건문이 끝났다면 다음 조건문으로 넘어가기
//    			   // continue : 만나면 해당 반복문 탈출 후 다음 반복실행
//    			   // break	   : 만나는 즉시 반복문 전체 탈출 
//    		   }
//    	   }
//    		int i = s / k * k;		
//    		if(s % k != 0) {
//    			i += k;
//    			
//    		}
//
//    	   while(i <= e) {
//    		   arr[i]++;
//    		   i += k;
//    	   }
//       }
//       
//        return arr;
//    }
//}

public class Solution1 {
	// 3개짜리 배열에 3개 들어있는 이차원배열이다
	// 이 배열에서 각 0~2까지 index이름을 s,e,k로 지정하고
	// k의 배수인 가장 작은 수를 s이상으로 설정한다(index0번보다는 이상이여야 하기때문)
	// 그리고 k의 배수 중 작은수는 index 1번(e)에 들어가고 k인 index 2번의 수만큼 증가하면서
	// 배열을 순회하여 s보다는 크지만 k의 배수들을 출력한다
	

}
