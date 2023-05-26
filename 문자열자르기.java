package step0;

import java.util.Arrays;

import javax.xml.transform.Result;

public class Cutting_Array {
public static void main(String[] args) {
	String my_str = "avc1Addfggg4556b";
	int n =6;
	
	int length = 0;
    if(my_str.length()%n==0) length = my_str.length()/n;
    else length = my_str.length()/n+1;
    
    System.out.println(length);
    String[] answer1 = new String[length];
    
    
    for(int i =0; i<length ; i++) {
        if(my_str.length() <n) {
        answer1[i]=my_str.substring(0,my_str.length());
        }else {
        answer1[i] = my_str.substring(0,n); 
        
        my_str = my_str.substring(n,my_str.length());
        }
        System.out.println(answer1[i]);
        System.out.println(my_str);
    }
	

}
}
