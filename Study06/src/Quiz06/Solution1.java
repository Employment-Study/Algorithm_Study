package Quiz06;


// ��ȭ����
// 120860
// ���簢�� ���� ���ϱ�
public class Solution1 {
	 public int solution(int[][] dots) {
	        int answer = 0;
	        
	        int w = 0;
	        int h = 0;
	        // ��,��
	        int x = dots[0][0];
	        int y = dots[0][1];
	        for(int i = 1; i < dots.length; i++) {
	        	if( x != dots[i][0]) {
	        		// Math : ���п��� ����ϴ� �Լ����� ����ִ� Ŭ����
	        		// abs : ���ڰ��� ���� ���밪�� ��ȯ�ϴ� �Լ�
	        		w = Math.abs(x - dots[i][0]);
	        	}
	        	if(y != dots[i][1]) {
	        		h = Math.abs(y - dots[i][1]);
	        	}
	        }
	        	
	        answer = w * h;
	        
	        
	        return answer;
	    }
}
