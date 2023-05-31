//package step01;
//
//import java.util.ArrayList;
//
//public class Divisor_add {
//public static void main(String[] args) {
//	
//	/*
//	 * 두 정수 left와 right가 매개변수로 주어집니다. 
//	 * left부터 right까지의 모든 수들 중에서,약수의 개수가 짝수인 수는 더하고, 
//	 *  약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
//	 *  
//	 *  	3	1, 13			2
//			14	1, 2, 7, 14		4
//			5	1, 3, 5, 15		4
//			16	1, 2, 4, 8, 16	5
//			17	1, 17			2
//	 
//	 	public int solution(int left, int right) {
//        int answer = 0;
//        return answer;
//    	}
//    	위와같은 매개변수가 주어짐
//	 */
//	
//	 1. 약수와 약수의 개수를 구하고 약수의 개수를 리턴하는 메서드를 만든다.
//	 2. 
//	int left =13;
//	int right =17;
//	int answer = 0;
//	
// 	Divisor a = new Divisor();
//	
//	for(int i =left ;i<=right;i++) {
// 		if ( a.sqrt_use(i)%2==0 || a.sqrt_use(i)%6==0)
//		answer += i;
//		else {answer -= i;}
//		
//	}
//	System.out.println("answer : " +answer);
//} main
//
//}   class
// 
//
