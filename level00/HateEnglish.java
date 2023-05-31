package step0;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HateEnglish {
public static void main(String[] args) {
//	String n2 ="onetwothreefourfivesixseveneightnine";
	String n2 = "twozeroonefivetwothree";
	String[] numbers = new String[] {"zero","one","two","three","four","five","six","seven","eight","nine",};
//	n2을 한글자씩 쪼갬
	String[] S_arr = n2.split("");
	
	HashMap<String, Integer> hash= new HashMap<>();
	
	// Key : numbers  value : i
	for(int i =0; i<numbers.length; i++) {
		hash.put(numbers[i], i);
	}
	
	String answer = "";
	String answer2 ="";
	
	for(int i =0; i<n2.length();i++) {
		//answer 에 한글자씩 담는다.
		answer += S_arr[i];
		System.out.println(answer);
		//hash에 answer값이 키와 일치하면 answer에 답을 답는다.
		if(hash.containsKey(answer)==true) {
			answer2 +=hash.get(answer);
			answer="";
		}
	}
	
	
	Long.parseLong(answer2);
	System.out.println(answer2);
	
	
	
	
	
}
}
