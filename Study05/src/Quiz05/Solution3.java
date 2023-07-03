package Quiz05;

import java.util.ArrayList;

// 금토
// 181902
// 문자 개수 세기
public class Solution3 {
	public int[] solution(String my_string) {
       int[] answer = new int[52];
        
        for(int i = 0; i < my_string.length(); i++ ) {
        	char s = my_string.charAt(i);
        	
        	if(s >= 'A' && s <= 'Z') {
        		answer[s - 'A']++;
        	}
        	else {
        		answer[26 + s - 'a']++;
        	}
        }
        
        
        return answer;
    }

	

	
}
