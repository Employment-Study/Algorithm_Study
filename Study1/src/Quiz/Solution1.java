package Quiz;

// 영어가 싫어요
public class Solution1 {
	 public long solution(String numbers) {
	        long answer = 0;
	        
	        answer = Long.parseLong(numbers.replace("one", "1")
	        		.replace("two", "2")
	        		.replace("three", "3")
	        		.replace("four", "4")
	        		.replace("five", "5")
	        		.replace("six", "6")
	        		.replace("sever", "7")
	        		.replace("eight", "8")
	        		.replace("nine", "9")
	        		.replace("zero", "0"));
	    // 먼저 매개변수는 비원시자료형이고 반환변수는 원시 자료형이라서 자료형을 맞춰줘야 반환할 수 있다
	    // 그러므로 parse(펄스)를 호출하여 비원시 자료형을  Long인 원시 자료형으로 치환하여 담아주고
	    // 글자를 숫자로 나오게 하기 위해서 replace를 호출하여 글자를 지정하고 그 글자가 입력 됐을때,
	    // 내가 지정한 숫자가 반환될 수 있도록 코드를 구현했습니다
	        
	        
	        return answer;
	 }
}
