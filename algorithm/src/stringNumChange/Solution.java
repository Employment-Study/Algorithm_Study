package stringNumChange;

class Solution {
	static long solution(String numbers) {
    	/*
    	 * 영어가 싫어요
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
        // 영어에 해당하는 배열과 숫자에 해당하는 배열을 각각 생성
        String[] numlist = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] num = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        // 배열의 길이만큼 반복하고
        for (int i = 0; i < num.length; i++) {
        	// 매개변수 numbers에 numlist[i]에 해당하는 단어가 있다면, num[i]로 치환
        	numbers = numbers.replace(numlist[i], num[i]);
        }
        // numbers는 문자열이므로, parseLong을 사용하여 정수로 변환하여 answer에 대입
        answer = Long.parseLong(numbers);
        return answer;
    }
}
