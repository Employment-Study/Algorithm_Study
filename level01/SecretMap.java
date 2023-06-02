package step01;

import java.util.Arrays;
import java.util.function.Supplier;

public class SecretMap {
public static void main(String[] args) {
	int n =5;
	int[] arr1 = {9,20,28,18,11};
	int[] arr2 = {30,1,21,17,28};
	//StringBuilder로 다시 풀어보기
	
	String[] srr3 = new String[n];
//	String.format("%"+nn+"d",Long.parseLong(Integer.toBinaryString(num)))
//	nn 은 Long.parseLong 으로 변환한 값이 들어간다.
//	%는 포맷의 시작을 나타냄
//	d는 10진수를 나타냄
	
	for(int i=0;i<arr1.length;i++) {
		srr3[i] = 	String.format("%"+n+"d",Long.parseLong((Long.toBinaryString(arr1[i]|arr2[i]))));
		srr3[i] = srr3[i].replaceAll("1", "#").replaceAll("0", " ");
	}
	System.out.println(Arrays.toString(srr3));
	
	
	}//main
}//class
