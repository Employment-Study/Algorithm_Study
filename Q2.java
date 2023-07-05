package week5_1;

import java.util.Arrays;

// 잘라서 배열로 저장하기
public class Q2 {
    public String[] mystr(String my_str, int n) {
        int length = my_str.length() % n == 0? my_str.length() / n : my_str.length() /n + 1;
        String[] answer = new String[length];

        int start = 0;
        int end = n;


        for(int i = 0; i < answer.length ;i++){
            answer[i] = my_str.substring(start,end);
            start += n;
            if( end + n > my_str.length()){
                end  = my_str.length();
            }
            else{
                end += n; 
            }
        }
    
        return answer;
    }

	public static void main(String[] args) {
		Q2 q2 = new Q2();
		System.out.println(Arrays.toString(q2.mystr("abc1Addfggg4556b", 6)));
	}

}
