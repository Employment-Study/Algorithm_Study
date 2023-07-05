package week6_2;
// 커피 심부름

public class Q3 {
	public int coffe(String[] order) {
		int answer = 0;
		for(String str: order) {
			if(str.contains("cafelatte")) {
				answer += 5000;
			}
			else {
				answer += 4500;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Q3 q3 = new Q3();
		String[] order = {"cafelatte", "americanoice", 
				"hotcafelatte", "anything"};
		System.out.println(q3.coffe(order));
	}

}
