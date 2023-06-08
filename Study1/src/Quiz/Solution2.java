package Quiz;

import java.util.Scanner;

// 잘라서 배열로 저장하기
public class Solution2 {
	public String[] solution(String my_str, int n) {
        
        int num = 0;
        
        // 나머지가 없다면 남는 문자가 없이 모두 묶어서 출력하는 것이고, 나머지가 있다면 나머지를 제외한 몫만 num에 담기기 때문에 반드시 나머지를 처리해줘야한다
        // 0으로 떨어지면   
       if(my_str.length() % n == 0) {
    	   num = my_str.length() / n;	// 총 길이 / n이라고 한다면
    	// 나머지 없이 0으로 떨어진다면 num에 담기는 값은  9길이를 3으로 나눈다면
    	   // num은 3이다
    	   // num이 0으로 떨어지면서 매개변수의 객체 길이가 구해진 것이다
    	   // 길이가 구해졌다면 쪼개는 단계는 반복문으로 처리하기 쉽다
       }
       
       else {	// 나머지가 있다는 것은 남은 숫자를 처리 하지 못하는 상태이기 때문에 + 1로 남은 숫자들까지 챙겨준다(길이에 비교해서 몇번 묶을 수 있는지이다)
    	   // 길이랑 나누어 떨어진 몫만 가지고 판단한다 , num에 담긴 길이의 몫은 for문에서 그만큼 반복하며 문자를 묶어준다
    	   // 그러므로 몇번 묶어줘야 내가 전달한 문자열들이 빠짐없이 묶일 수 있는지를 생각해 봐야한다
    	   num = my_str.length() / n + 1; // 총 길이 / n + 1이라고 한다면
    	   // 만약 길이 16이고 6으로 쪼갠다면 num에 2가 담기가 된다
	       // 하지만 2가 담기게 되면 16에서 마지막 4개의 숫자는 처리하지 못하게 된다
	       // 그러므로 나머지가 나오는 경우에는 +1을 해주어 나머지의 문자들도 출력할 수 있도록 식을 구현한다
	       // ex) 16 = "dnfjdn ", " irysbd", "fnuk" <- (16 / 6 + 1);
	       // 이런 상태라면 몫으로 떨어지는 것에  +1을 해주어 나머지 문자 4개까지 출력하는 것이다
	       // 식에서 length / n + 1이라는 것은 %처럼 나머지에 +가 아니라 /처럼 몫에만 영향을 준다는 걸
	       // 잊으면 안된다
	    
       }
       String[] answer = new String[num]; // 0으로 떨어졌을때는 쪼갠 후에 answer에 담고
       // 아닐때는 -> 총길이 / 6(n) + 1해서 
       for(int i = 0; i < num; i++) {
    	   if(my_str.length() >= n) {
    		   answer[i] = my_str.substring(0,n);
    		   my_str = my_str.substring(n,my_str.length());    		   
    	   }
    	   else {
    		   answer[i] = my_str.substring(0,my_str.length());
    	   }
    	   
       }            
       
        return answer;
    }
	
}
