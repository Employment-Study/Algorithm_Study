package Quiz05;

import java.util.ArrayList;

// ����
// 181860
// �� �迭�� �߰�, ���� �ϱ�
public class Solution2 {
	public int[] solution(int[] arr, boolean[] flag) {
		ArrayList<Integer> list = new ArrayList<>();
		
		// �� �迭�� �ֱ� ���� list������ ����� ���� �� �־��ش�
		// ����� ����� ������  arr[i]�� flag�� ���������� true�̸� *2 �ϰ� �߰�
		// false��� �߰����� list�� ���̰� ���ҵȴ�
		for(int i = 0; i < arr.length; i++) {
			// �� �迭�� �߰�
			if(flag[i]) { // true �϶� 
				// arr�迭 i�� * 2��  �����ϰ�
				for(int j = 0; j < arr[i] * 2; j++) {
					// ����Ʈ�� �߰�
					list.add(arr[i]);
					// �̷��� �߰��ϸ� true�϶� arr�迭 ���� * 2�� �Ǿ� list�� ����Ǹ�
					// arr[i]�� ���ϱ��� ���� list�߰��Ǹ鼭 ����� ��������
					// ����, true�϶� ���ڵ��� list�� ���̰� �ȴ�
				}
			}
			// ��迭 ����
			else { // false�϶�
				// �迭�� i��
				for(int j = 0; j < arr[i]; j++) {
					// list�� �߰����� �ʰ� ������Ҹ� remove�� �����Ѵ�
					list.remove(list.size() -1);
				}
			}
		}
		// ���� ������ list�� ����� answer�� ����
        int[] answer = new int[list.size()];
        // list�����ŭ �ݺ��ϸ鼭 answer[i]�� list�� �־��ش�
        // list���� arr[i] * 2�� �� ������ �� �ִ�
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        // �׸��� ��ȯ
        return answer;
    }
}
