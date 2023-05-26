package step0;

import java.util.Arrays;
import java.util.HashMap;

public class HateEnglish {
public static void main(String[] args) {
	String[] numbers = new String[] {"zero","one","two","three","four","five","six","seven","eight","nine",};
	String n1 ="onetwothreefourfivesixseveneightnine";
	String[] S_arr = n1.split("");
	
	
	HashMap<String, Integer> hash= new HashMap<>();
	
	for(int i =0; i<numbers.length; i++) {
		hash.put(numbers[i], i);
	}
	
	String answer = "";
	String answer2 ="";
	for(int i =0; i<n1.length();i++) {
		answer += S_arr[i];
		System.out.println(answer);
		if(hash.containsKey(answer)==true) {
			answer2 +=hash.get(answer);
			answer="";
		}
		
	}
	Long.parseLong(answer2);
	System.out.println(answer2);
	
	
}
}
