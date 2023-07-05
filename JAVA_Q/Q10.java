package p6_3;

import java.util.Arrays;
// 세 개의 구분자

public class Q1 {
	

	public String[] solution(String myStr) {
        String[] answer = {};
        
        String ch;
        ch = myStr.replace("b", "a");
        ch = ch.replace("c", "a");
        answer = ch.split("a");
        
        int cnt = 0;
        for(int i = 0; i < answer.length;i++) {
        	if(!answer[i].isEmpty()) {
        		cnt+=1;
        	}
        }
      
        int in = 0;
        String[] answer1 = new String[cnt];
        String[] answer2 = {"EMPTY"};
        
        for(int i = 0; i < answer.length;i++) {
        	if(!answer[i].isEmpty()) {
        		answer1[in] = answer[i];
        		in++;
        	}
        	
        	
        }
        return cnt != 0 ?answer1 : answer2;
    }
	
	
	
	public static void main(String[] args) {
		
		Q1 qr = new Q1();
		String[] answer = qr.solution("cabab");
		System.out.println(Arrays.toString(answer));
		
		
	}

}
