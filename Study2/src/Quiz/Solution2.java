package Quiz;

// ���ǿ� �°� ���� ��ȯ�ϱ�2
//class Solution {
//    public int solution(int[] arr) {
//    	 int answer = 0;
//    	 int count = 0;
//         // ���ƿ� ������ ����,���� �迭 �ʿ���
//    	 int[] tmpArray = new int[arr.length];
//    	 
//    	 while(count != arr.length) {
//    		 count = 0;
//    		 tmpArray = arr.clone();
//    		 
//    		 for(int i = 0; i < arr.length; i++) {
//    			 if(arr[i] >= 50 && arr[i] % 2 == 0) {
//    				 arr[i] /= 2;
//    			 }
//    			 else if (arr[i] < 50 && arr[i] % 2 != 0) {
//    				 arr[i] = arr[i] * 2 + 1;    				     				 
//    			 }
//    			 
//    			 if(arr[i] == tmpArray[i]) count++;
//    		 }
//    			 answer++;      
//         }
//         
//         return answer-1;
//    }
//}
public class Solution2 {
	// �迭�� ���� 50���� ũ�ų� ���� ¦����� 2�� ������
	// �迭�� ���� 50���� ���� Ȧ����� 2�� ���ϰ� �ٽ� 1�� ���Ѵ�
	// �迭�� ���̸� ��Ȯ�� ����ؾ� �Ѵ�
	// ������ index�� answer�� ��ȯ�ϰ� ���� �ۼ��ϸ� �ȴ�
	// �׷��� ���ؼ��� ������ �ʿ��ϰ� �� ���ؿ� ���������� Ư������ �ʿ��ϴ�
	
	// index�� ���� ���� ��ȯ�ϴ� ������ �ܰ踦 ���ո��� ���Ͽ� �ٸ� �� ������
	// index�� i�� ���� ���ϰ� index�� ������ ��ȯ�ϴ� �κп��� ��̴�
	
}
