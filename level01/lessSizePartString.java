package step01;

// 놓쳣던 상황 : String을 int로 형변환하였을 떄의 범위를 고려하지 않았다. String을 변환시 Int의 범위를 초과하였기 때문에 계속해서 런타임 에러가 났다.
//  문자열에서 정수로 형변환을 해야 하는경우에는 이런 상황을 꼭 기억하자!
public class lessSizePartString {
public static void main(String[] args) {
	String t = "1234567";  //"123456" , "12345"
	String p = "7";	//"12"(짝 : 5번 , 홀 : 4번) "1"(짝 : 6번, 홀 : 5번) , "123" (짝 : 4번, 홀 : 3) 
	
	//1.t의 길이가 홀수 이고 p가 짝수
//	 	"12345" "12"(t.length-1) 
	//2.t의 길이가 홀수이고 p가 홀수
//		"12345"  "1"(홀 : t.length) , "123" (홀 : t.length-p.length-1) ,"12345"
	//3.t의 길이가 짝수이고 p가 짝수
//	"123456""12"(t.length-1)
	//4.t의 길이가 짝수이고 p가 홀수
//	"123456"	"1"(짝 : t.length) , "123" (홀 : t.length-p.length-1) 
	
	//결론 
//	t의 길이가 홀수,짝수이고 p가 1일 때에는 길이 그대로 
//	t의 길이가 홀수,짝수이고 p가 3이상 홀수,짝수 일때는 t.길이 - p.길이 -1
	
	
	
	int cnt =0;
	//p의길이가 홀수
	if(p.length()==1) for(int i=0;i<t.length();i++) {
		long cutting_p = Long.parseLong(t.substring(i,i+p.length()));
        long old_p = Long.parseLong(p);
		if(cutting_p<=old_p) {
			System.out.println(Long.parseLong(t.substring(i,i+p.length())));
			cnt++;
		}
	}
	else {
		for(int j=0; j<t.length()-(p.length()-1);j++) {
			if(Long.parseLong(t.substring(j,j+p.length()))<= Long.parseLong(p)) {
				cnt++;
				System.out.println(Long.parseLong(t.substring(j,j+p.length())));
				}
			}
		}
	
	System.out.println(cnt);
	
	
//    if(p.length()%2!=0) {
//        for(int i=0;i<t.length()-p.length();i++) {
//            if(Long.parseLong(t.substring(i,i+p.length()))<=Long.parseLong(p)) cnt++;}
//    }
//    else {
//        for(int i=0;i<t.length()-1;i++) {
//            if(Long.parseLong(t.substring(i,i+p.length()))<=Long.parseLong(p)) cnt++;}
//    }

	}
}
