package step01;

import java.util.Arrays;
//68935#
public class ReverseTernarySystem {
	public static void main(String[] args) {
		
		int n = 143557;
		String three = Integer.toString(n,3);
		String answer ="";
		for(int i=three.length()-1;i>=0;i--) {
			answer += three.charAt(i);
		}
		
		n= Integer.parseInt(answer,3);

		
		
		
		
		
		

		
	}
}
