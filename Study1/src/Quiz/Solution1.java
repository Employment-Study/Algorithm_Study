package Quiz;

// ��� �Ⱦ��
public class Solution1 {
	 public long solution(String numbers) {
	        long answer = 0;
	        
	        answer = Long.parseLong(numbers.replace("one", "1")
	        		.replace("two", "2")
	        		.replace("three", "3")
	        		.replace("four", "4")
	        		.replace("five", "5")
	        		.replace("six", "6")
	        		.replace("sever", "7")
	        		.replace("eight", "8")
	        		.replace("nine", "9")
	        		.replace("zero", "0"));
	    // ���� �Ű������� ������ڷ����̰� ��ȯ������ ���� �ڷ����̶� �ڷ����� ������� ��ȯ�� �� �ִ�
	    // �׷��Ƿ� parse(�޽�)�� ȣ���Ͽ� ����� �ڷ�����  Long�� ���� �ڷ������� ġȯ�Ͽ� ����ְ�
	    // ���ڸ� ���ڷ� ������ �ϱ� ���ؼ� replace�� ȣ���Ͽ� ���ڸ� �����ϰ� �� ���ڰ� �Է� ������,
	    // ���� ������ ���ڰ� ��ȯ�� �� �ֵ��� �ڵ带 �����߽��ϴ�
	        
	        
	        return answer;
	 }
}
