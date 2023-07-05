package week5_2;

import java.util.Scanner;

// 특수문자 출력하기
public class Q4 {
	// 다음과 같이 출력 !@#$%^&*(\'"<>?:;
	public static void main(String[] args) {
	
		String scn;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 입력 하세요 >>");
		scn = sc.nextLine();
		System.out.println(scn);
		sc.close();
		
		// 스캐너 사용 안한 버전
		String n;
		n = "!@#$%^&*(\\'\"<>?:;";
		System.out.println(n);
}

}
