package step0;

import java.util.Arrays;


public class Cutting_Array {
public static void main(String[] args) {
	
	String my_str = "avc1Addfggg4556b";
	System.out.println(my_str.length());
	int n =6;
	//avc1Ad
	//dfggg4
	//556b
	
	// 경우의 수
	
	// 1. 6마디씩 깔끔하게 잘리는 경우 (my_str%n ==0)
	int length = my_str.length()/n;	
	
	// 2. 6마디씩 잘리다가 6보다 작은 개수가 남은 경우(my_str%n!=0)
	if			(my_str.length()%n!=0) length = my_str.length()/n+1;
	
	//배열의 길이를 정함
	System.out.println("배열의 길이 : "+ length);
	
	
    //잘라서 담을 배열을 생성
    String[] answer = new String[length];
    System.out.println(Arrays.toString(answer));
    System.out.println();
    
    
    for(int i =0; i<length ; i++) {
    	
    	// 경우의 수 2. 자리의 수가 6보다 작은 경우
        if(my_str.length() <n)    answer[i]=my_str.substring(0,my_str.length());
        // 경우의 수 1. 자리의 수가 6으로 깔끔하게 잘리는 경우
        else {
        		answer[i] = my_str.substring(0,n);
        		my_str = my_str.substring(n,my_str.length());
        }
        System.out.printf("answer["+i+"] 번째의 과정 확인\n");
        System.out.println("answer["+i+"] : " +answer[i]);
        System.out.println("my_str : " + my_str);
        System.out.println();
    }
    System.out.println("정답 :" + Arrays.toString(answer));
	

	}//main
}

