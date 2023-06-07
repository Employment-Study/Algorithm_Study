package step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class choiceTwoNumberInArray {
public static void main(String[] args) {
	int[] numbers = {2,1,3,4,1};
	int[] numbers2 = {5,0,2,7};
	ArrayList<Integer> arr = new ArrayList<>();
	for(int i=0;i<numbers.length-1;i++) {
		for(int j=i+1; j<numbers.length;j++) {
			System.out.println(numbers[i]+numbers[j]);
			arr.add(numbers[i]+numbers[j]);
		}
	}
	
	int[] arr2 = arr.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
	System.out.println(Arrays.toString(arr2));
	
	
	
}
}
