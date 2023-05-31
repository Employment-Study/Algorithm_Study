package step01;

import java.util.Arrays;

public class MinimalSquare {
public static void main(String[] args) {
	int[][] sizes1 = {
			{60, 50}, 	//0[0,0][0,1]
			{30, 70},   //1[1,0][1,1]
			{60, 30}, 	//2[2,0][2,1]
			{80, 40}	//3[3,0][3,1]
			};
	int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
	int max=0;
	int max2=0;
	
//	 10 12 8  7  5
//	 7  3  15 14 15
	int max1 = 0;
	int min1 = 0;
	
	for(int[] i: sizes) {
		max1 = Math.max(max1, Math.max(i[0], i[1]));
		min1 = Math.max(min1, Math.min(i[0], i[1]));
		
		
	}
	System.out.println(max1);
	System.out.println(min1);
	
	
	
	

	
	
	
	
	
	System.out.println(max*max2);
	
	
	
	}
}
