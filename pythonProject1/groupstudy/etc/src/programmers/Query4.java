package programmers;

import java.util.Arrays;

class Solution2 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];//0
            int e = query[1];//4
            int k = query[2];//1

            if(k==0){
                if(s == 0){
                    arr[0]++;
                    continue;
                }
            }
            if(e < arr.length){
                for(int i = s;i<e+1; i++){
                    if (i%k==0)
                        arr[i]+=1;
                }    
            }
        }
        return arr;
    }
}

public class Query4 {
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] arr = {0,1,2,4,3};
		int[][] queries = {
			{0,4,1},
			{0,3,2},
			{0,3,3}
		};
		
		
		System.out.println("arr : " + Arrays.toString(s.solution(arr, queries)));
	}
}
