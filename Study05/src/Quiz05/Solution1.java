package Quiz05;

import java.util.ArrayList;

// 월화
// 181862
// 세 개의 구분자
public class Solution1 {
	public String[] solution(String myStr) {
		// 정규표현식 사용
		// abc를 a로 바꾸고 a+(a가 1개 이상인 것)을 빈 문자열로 만들고 trim으로 문자를 자르는데 " "(빈공간)을 기준으로 잘르기
		// a를 빈공간으로 만들었기 때문에 빈공간을 기준으로 자르면 된다
        String[] answer = myStr.replaceAll("a|b|c", "a").replaceAll("a+", " ").trim().split(" ");
        
        // isEmpty는 문자에서 abc만 있을 경우 길이가 0이므로 true를 반환
        if(answer[0].isEmpty()) {
        	answer[0] = "EMPTY";
        }
       
        
        return answer;
    }
}
