package Quiz06;

import java.util.HashMap;
import java.util.Map;

// ��,��
// 120883
// �α��� ����?
public class Solution2 {
	 public String solution(String[] id_pw, String[][] db) {
		 String answer = "";
		 
		 Map<String, String> map = new HashMap<>();
		 	
		 // ȸ�������� s�� ���
		 for(String[] s : db) {
			 // ���� �ʿ� ȸ�������� ��´�
		 	map.put(s[0], s[1]);
		 }
		 
		 // map�� key���� �Ӿ����� ������ �ִ��� Ȯ���Ѵ�(containsKey : �� Ű�� ������ �ִ��� Ȯ��)
		 if(map.containsKey(id_pw[0])) {
			 // ���� key�� ����� id_pw�� equals�� �����ϴ��� Ȯ���Ѵ�
			 if(map.get(id_pw[0]).equals(id_pw[1])) {
				 answer = "login"; // ������ ����
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
