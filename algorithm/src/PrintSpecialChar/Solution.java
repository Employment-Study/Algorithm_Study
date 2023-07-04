package PrintSpecialChar;

class Solution {
	public static void main(String[] args) {
		/*
		 * 특수문자 출력하기 다음과 같이 출력하도록 코드를 작성해 주세요
		 * !@#$%^&*(\'"<>?:;
		 */
		int[] answer = {'!','@','#','$','%','^','&','*','(','\\','\'','\"','<','>','?',':',';'};
		for(int i = 0; i < answer.length; i++) {
			System.out.printf("%c",answer[i]);
		}
//		System.out.print("!@#$%^&*(\\\'\"<>?:;");
	}
	
	// 병길님 코드
//	static int makeSize(int[] arr) {
//		int size = 0;
//		if (arr != null) {
//			size = arr.length;
//		}
//		if (arr.length == 1) {
//			return 1;
//		}
//		int num2 = 2;
//		while (num2 < size) {
//			num2 = num2 * 2;
//		}
//		return num2;
//	}
//
//	public int[] solution(int[] arr) {
//		int index = makeSize(arr);
//		System.out.println("index : " + index);
//
//		int[] answer = new int[index];
//
//		for (int i = 0; i < arr.length; i++) {
//			answer[i] = arr[i];
//		}
//		return answer;
//	}
}