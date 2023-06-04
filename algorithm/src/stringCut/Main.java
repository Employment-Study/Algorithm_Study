package stringCut;

import java.util.Scanner;

public class Main {
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

		String[] answer = Solution.solution(my_str, cut);

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i].toString());
		}

		sc.close();
	}
}
