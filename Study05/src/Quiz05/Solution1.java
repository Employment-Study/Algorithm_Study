package Quiz05;

import java.util.ArrayList;

// ��ȭ
// 181862
// �� ���� ������
public class Solution1 {
	public String[] solution(String myStr) {
		// ����ǥ���� ���
		// abc�� a�� �ٲٰ� a+(a�� 1�� �̻��� ��)�� �� ���ڿ��� ����� trim���� ���ڸ� �ڸ��µ� " "(�����)�� �������� �߸���
		// a�� ��������� ������� ������ ������� �������� �ڸ��� �ȴ�
        String[] answer = myStr.replaceAll("a|b|c", "a").replaceAll("a+", " ").trim().split(" ");
        
        // isEmpty�� ���ڿ��� abc�� ���� ��� ���̰� 0�̹Ƿ� true�� ��ȯ
        if(answer[0].isEmpty()) {
        	answer[0] = "EMPTY";
        }
       
        
        return answer;
    }
}
