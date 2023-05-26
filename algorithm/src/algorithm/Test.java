package algorithm;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String my_str1 = "abc1Addfggg4556b";
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("크기 : ");
		n = sc.nextInt();
		
		int cnt = my_str1.length() % n == 0 ? my_str1.length() / n : my_str1.length() / n + 1;
		String[] answer = new String[cnt];
//		System.out.println(answer.length);
		
		int i = 0;
		while (my_str1.length() != 0) {
			if(my_str1.length()< n) {
				for(int j = my_str1.length(); j < n; j++) {
					my_str1 += " ";
				}
			}
			answer[i] = my_str1.substring(0, n);
			my_str1 = my_str1.substring(n);
			
			i++;
		}
		for(int j = 0; j < answer.length; j++) {
			System.out.println(answer[j].toString());
		}
		
		sc.close();
	}
}
