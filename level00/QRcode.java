package step0;

public class QRcode {
public static void main(String[] args) {
	int q = 3;
	int r = 1;
	String answer ="";
	
	String code = "qjnwezgrpirldywt";
	
	for(int i=0; i<code.length();i++) {
		if (i%q==r) answer += code.charAt(i);
	}
	System.out.println(answer);
	
	
	
}
}
