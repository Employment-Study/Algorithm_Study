package algorithm;

import java.util.Scanner;

public class StringCut {
	
	static String[] Solution(String my_str, int n) {	// String cut
    	/*
		 * 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한사항
		 * 1 ≤ my_str의 길이 ≤ 100
		 * 1 ≤ n ≤ my_str의 길이
		 * my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
		 */
    	
    	// 배열의 갯수 지정 : +1을 안해주면 나머지가 있을 때, 남은 문자열을 넣을 배열이 없어서 에러 남
    	int cnt = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
    	// 스캐너로 받아올 때, 받아오는 타입은 문자열. 문자열 타입의 배열 생성
        String[] answer = new String[cnt];
        // while을 사용하기 위한 변수 생성
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
	
	public static void main(String[] args) {
		/*
		 * 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한사항
		 * 1 ≤ my_str의 길이 ≤ 100
		 * 1 ≤ n ≤ my_str의 길이
		 * my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
		 */

		String my_str = "";
		int cut;
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		my_str = sc.next();
		System.out.print("자를 수 입력 : ");
		cut = sc.nextInt();

		String[] answer = Solution(my_str, cut);

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i].toString());
		}

		sc.close();
	}
}
