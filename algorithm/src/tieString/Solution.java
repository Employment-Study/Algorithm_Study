package tieString;

class Solution {
    public int solution(String[] strArr) {
    	/*
    	 * 문자열 배열 strArr이 주어집니다
    	 * strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return하는 solution 함수를 완성해 주세요
    	 * 
    	 * 입출력 예
    	 * strArr : ["a","bc',"d',"efg","hi"] result = 2
    	 */
    	int answer = 0;
		int index = 0;
		int count = 0;

		for (int i = 0; i < strArr.length; i++) {
			if (index < strArr[i].length()) {
				index = strArr[i].length();
			}
		}
		while (index > 0) {
			count = 0;
			for (int i = 0; i < strArr.length; i++) {
				if (strArr[i].length() == index) {
					count++;
				}
			}
			if (count > answer) {
				answer = count;
			}
			index--;
		}
		return answer;
	}
}