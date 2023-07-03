package Quiz06;

import java.util.HashMap;
import java.util.Map;

// 금,토
// 120883
// 로그인 성공?
public class Solution2 {
	 public String solution(String[] id_pw, String[][] db) {
		 String answer = "";
		 
		 Map<String, String> map = new HashMap<>();
		 	
		 // 회원정보를 s에 담고
		 for(String[] s : db) {
			 // 만든 맵에 회원정보를 담는다
		 	map.put(s[0], s[1]);
		 }
		 
		 // map에 key값에 머쓱이의 정보가 있는지 확인한다(containsKey : 맵 키에 정보가 있는지 확인)
		 if(map.containsKey(id_pw[0])) {
			 // 맵의 key에 저장된 id_pw를 equals로 포함하는지 확인한다
			 if(map.get(id_pw[0]).equals(id_pw[1])) {
				 answer = "login"; // 있으면 성공
			 }
			 else {
				 answer = "wrong pw";
			 }
		 }
		 else {
			 answer = "fail";
			
		 }
		return answer;
	        
	    }
}
