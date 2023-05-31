package step01;

public class SeizurePassword {
public static void main(String[] args) {
	String s = "AB";
	String s2 = "a B z";
	String answer = "";
	int n = 1;
	int n2 = 4;
	
	//a~z = 97~122
	//A~Z = 65~90
	
	System.out.println((char)('Z'+25));
	
    char[] arr =s.toCharArray();
    //(i-26)+n
    //a~z = 97~122
    //A~Z = 65~90
    for(char i : arr)
    if(i==' ') answer += " ";
    else if(i<=90 && i+n >90)   answer+=(char)(i-26+n)+"";
    else if(i>=97 && i+n >122) answer +=(char)(i-26+n)+"";
    else answer += (char)(i+n);
    
    

    


	}//main

}
