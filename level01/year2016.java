package step01;

import java.util.HashMap;

public class year2016 {
public static void main(String[] args) {
	// 2016년 1월 1일  = 금요일(1,8,15,22,29) 30 토  31 일 
	// 2016년 2월 1일 = 월 29일 = 월요일
	// 2016년 1월 8일 = 금요일
	// 2016년 2월 1일 = 
	int a = 1;
	int b =21;
	int[] arr = {31,29,31,30,31,30,31,31,30,31,30,31};
	int answer = 0;
	for(int i=0; i<a-1;i++) {
		answer += arr[i];
	}
	answer +=b;
	answer = answer%7;
	System.out.println(answer);
	
	String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
	
	HashMap<Integer, String> map = new HashMap<>();
	for(int i=0; i<=6; i++) {
		map.put(i, days[i]);
	}
	map.put(-1, "THU");
	
	String answer2 = map.get(answer-1);
	System.out.println(answer2);
		
	
}
}

//31, 29 ,31 ,30 , 31 , 30, 31, 30 ,31 ,30 ,31 ,30,