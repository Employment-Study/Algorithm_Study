package step01;



public class MulitpleArray {
public static void main(String[] args) {
	
	//배열의 길이는 2의 정수 거듭제곱
	//2 ,4, 8 ,16
	
	
	int[] arr= {1,2,3,4,5,6};
	
	int length = arr.length;
	int new_length = 0;
	for(int i=2 ; i<=1024;i*=2) {
		if(arr.length == i) {
			break;
		}
		if(arr.length <i) {
			new_length = i-arr.length; break;
			}
		}
		
	
	int[] arr2 = new int[length+new_length];
	System.arraycopy(arr, 0, arr2,0	, arr.length);

	
//	if (arr.length

	




}
}
