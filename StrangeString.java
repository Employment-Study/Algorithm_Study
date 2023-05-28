package step01;

import java.util.Arrays;

public class StrangeString {
public static void main(String[] args) {
	String s = "try      hello   world";
	
	int cnt =0;
	String answer ="";
	for(int i=0; i<s.length();i++) {
		if (s.charAt(i)==' ') answer += s.charAt(i);
		else if (cnt%2 != 0) {
			answer += String.valueOf(s.charAt(i)).toLowerCase();
			cnt++;
		}
		else  {answer += String.valueOf(s.charAt(i)).toUpperCase();
		cnt++; }
	}
	
	System.out.println(answer);
	
}
}
