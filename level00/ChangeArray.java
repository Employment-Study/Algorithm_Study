package step0;

import java.util.Arrays;

public class ChangeArray {
public static void main(String[] args) {
	int[] arr = {1,2,3,100,99,98};
	int cnt=0;
	int result =0;
	while(true) {
		cnt =0;
		int[]  tmp = new int[arr.length];
		for(int j=0; j<arr.length;j++) {
			tmp[j] = arr[j];
		}
		System.out.println(Arrays.toString(tmp));
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<50 && arr[i]%2!=0) arr[i] = (arr[i]*2)+1;
			else if(arr[i]>=50 && arr[i]%2==0) arr[i] = (arr[i]/2);
		}
		System.out.println(Arrays.toString(arr));
		
		
		for(int k=0;k<arr.length;k++) {
			if(arr[k]==tmp[k]) cnt++;
		}
		System.out.println(cnt);
		if(cnt==arr.length) {break;}
		result++;
		System.out.println();
 	}
	System.out.println(cnt);
	System.out.println(result);
}
}
