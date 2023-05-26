package algorithm;

public class Solution {

    public long StringNumChange(String numbers) {
    	/*
		 * 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
		 * 문자열 numbers가 매개변수로 주어질 때,
		 * numbers를 정수로 바꿔 return 하도록 solution함수를 완성해 주세요.
		 * 
		 * 제한사항
		 * numbers는 소문자로만 구성되어 있습니다.
		 * numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
		 * 1 ≤ numbers의 길이 ≤ 50
		 * "zero"는 numbers의 맨 앞에 올 수 없습니다.
		 */
        long answer = 0;
        String[] numlist = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] num = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for (int i = 0; i < num.length; i++) {
        	numbers = numbers.replaceAll(numlist[i], num[i]);
        }
        answer = Long.parseLong(numbers);
        return answer;
    }

	
    public String[] StringCut(String my_str, int n) {	// String cut
    	/*
		 * 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한사항
		 * 1 ≤ my_str의 길이 ≤ 100
		 * 1 ≤ n ≤ my_str의 길이
		 * my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
		 */
    	int cnt = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[cnt];
        int i = 0;
        
        while(my_str.length() != 0) {
        	if(my_str.length() < n) {
        		n = my_str.length();
        	}
        	answer[i] = my_str.substring(0, n);
        	my_str = my_str.substring(n);
        	i++;
        }
        
        return answer;
    }
}
