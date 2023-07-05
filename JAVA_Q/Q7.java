package week6_2;
// qr code
public class Q1 {
	
	public String qrcode(int q, int r, String code) {
		String answer = "";
		
		for(int i = 0; i < code.length();i++) {
			if(i % q == r) {
				answer += code.charAt(i);
			}
			
		}
			
				return answer;
		
	}
	
	public static void main(String[] args) {
		
		Q1 qr = new Q1();
	
		System.out.println(qr.qrcode(3, 1, "qjnwezgrpirldywt"));
		
	}

}
