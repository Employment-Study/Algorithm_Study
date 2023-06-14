package Quiz03;

// 커피 심부름
// 금토,
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(String sm : order) {
        	// 아무거나 했을때도 아메리카노로 계산되어야 하기 때문에
        	// 카페라떼라는 문자가 들어갈때는 5000원
        	if(sm.contains("cafelatte")) {
        		answer += 5000;
        	}
        	else{ // 그 외에는 모두 4500원으로 계산
        		answer += 4500;
        	}
        }
        return answer;
    }
}

public class Solution2 {

}
