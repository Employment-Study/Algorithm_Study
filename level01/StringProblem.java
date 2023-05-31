package step01;
import java.util.regex.*;

public class StringProblem {
public static void main(String[] args) {
	String s = "a1234";
	 boolean answer = false;
     
     if(s.length() ==4 || s.length() ==6) answer =true;
     
     s = s.toLowerCase();
	
	    Pattern a = Pattern.compile(".*[a-z].*");
	
	    Matcher m = a.matcher(s);
	    
//	    if (m.matches()) return false;
//     
//     return answer;
}
	       
	    }
