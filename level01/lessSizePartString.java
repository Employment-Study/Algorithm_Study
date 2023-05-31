package step01;

public class lessSizePartString {
public static void main(String[] args) {
	String t = "3141592";
	String p = "271";
	int length = p.length();
	int cnt =0;
	
	for(int i=0;i<t.length()-2;i++) {

		if(Integer.parseInt(t.substring(i,i+length))<=Integer.parseInt(p)) cnt++;
	}
	System.out.println(cnt);
}
}
