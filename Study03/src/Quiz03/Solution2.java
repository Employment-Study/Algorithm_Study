package Quiz03;

// Ŀ�� �ɺθ�
// ����,
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(String sm : order) {
        	// �ƹ��ų� �������� �Ƹ޸�ī��� ���Ǿ�� �ϱ� ������
        	// ī��󶼶�� ���ڰ� ������ 5000��
        	if(sm.contains("cafelatte")) {
        		answer += 5000;
        	}
        	else{ // �� �ܿ��� ��� 4500������ ���
        		answer += 4500;
        	}
        }
        return answer;
    }
}

public class Solution2 {

}
