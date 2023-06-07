package step0;



import java.util.stream.Stream;

public class Calc_String {
 public static void main(String[] args) {
	String my_string= "13 + 54 - 78 + 3 + 6 + 1 - 7";
	int x =0;
	//공백 제거
	my_string = my_string.replaceAll(" ", "").replaceAll("[+]", " ").replace("-", " -");		
	String[] arr = my_string.split(" ");
	
	//각 수를 정수로 전환해서 더하기
	Stream<String> stream = Stream.of(arr);
	x =stream.mapToInt(Integer::parseInt).sum();
	
	System.out.println(x);
	
	

	
	
	
 }
}

