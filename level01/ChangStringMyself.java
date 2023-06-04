package step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChangStringMyself {
public static void main(String[] args) {
	String[] strings = {"sun","sunaaa","bed","sunaab","sunab","suna","sunaa","car","su"};
	int n = 1;

	// n번째 숫자를 맨 앞으로 가져와서 정렬을 시작. 그러면 자동으로 뒷 글자들도 정렬이 된다.
	// 정렬의 특성을 이해하고 써먹도록 하자!!!
	
	ArrayList<String> arr = new ArrayList<>();
	
	for(int i=0 ; i<strings.length; i++) {
		arr.add(""+strings[i].charAt(n)+strings[i]);
	}
	
	Collections.sort(arr);
	
	String[] answer = new String[arr.size()];
	
	for(int i=0; i< arr.size(); i++) {
		answer[i] = ""+ arr.get(i).substring(n,arr.get(i).length()); 
	}
	
	System.out.println(Arrays.toString(answer));
	
	
	    }
	}
	
	 
	



//	        String[] answer;
//	        ArrayList<String> list = new ArrayList<>();
//	        
//	        for (int i = 0; i < strings.length; i++) {
//	            list.add(strings[i].charAt(n) + strings[i]);
//	        }
//	        
//	        // 정렬
//	        Collections.sort(list);
//	        System.out.println(Arrays.asList(list));
//	        
//	        answer = new String[list.size()];
//	        
//	        for (int i = 0; i < list.size(); i++) {
//	            answer[i] = list.get(i).substring(1, list.get(i).length());
//	        }             
//	        
//	        return answer;

