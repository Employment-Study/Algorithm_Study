package stringCalculate;

public class Main {
	public static void main(String[] args) {
		/*
    	 * my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
    	 * 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return하는 solution함수를 완성해주세요
    	 * 
    	 * 제한사항
    	 * - 연산자는 +, -만 존재합니다
    	 * - 문자열의 시작과 끝에는 공백이 없습니다
    	 * - 0으로 시작하는 숫자는 주어지지 않습니다
    	 * - 잘못된 수식은 주어지지 않습니다
    	 * - return type은 정수형입니다
    	 * - my_string의 숫자와 연산자는 공백 하나로 구분되어 있습니다.
    	 * 
    	 * my_string = "3 + 4"
    	 * result = 7
    	 */
		
		String my_string = "3 + 4 - 6 + 1 - 5 + 7 + 9";
		int answer;
		
		answer = Solution.solution(my_string);
		System.out.println(answer);
	}
}
