package step01;

import java.util.Arrays;
import java.util.Comparator;

public class Budget {
public static void main(String[] args) {
	
	int[] d = {1,3,2,5,4};
	
	for(int i=0;i<d.length-1;i++) {
		for(int j=i+1; j<d.length;j++) {
			if(d[i]>d[j]) {
				int tmp= 0;
				tmp = d[i];
				d[i] = d[j];
				d[j] = tmp;
				
			}//if
		}
	}//end of for
	System.out.println(Arrays.toString(d));
	
	int budget =9;
	int result=0;
	
	for(int i: d) {if(budget-i >=0) result++; budget -= i;}

	
	
}
}
