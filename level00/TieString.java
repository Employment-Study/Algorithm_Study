package step0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
		 문자열 배열 strArr이 주어집니다. 
		 strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
		
		제한사항
		1 ≤ strArr의 길이 ≤ 100,000
		1 ≤ strArr의 원소의 길이 ≤ 30
		strArr의 원소들은 알파벳 소문자로 이루어진 문자열입니다.
		
		입출력 예
		strArr						result
		["a","bc","d","efg","hi"]	  2
		입출력 예 설명
		입출력 예 #1
		
		각 문자열들을 길이에 맞게 그룹으로 묶으면 다음과 같습니다.
		문자열 길이	문자열 목록	개수
		1	["a","d"]		2
		2	["bc","hi"]		2
		3	["efg"]			1
		개수의 최댓값은 2이므로 2를 return 합니다.
 */
public class TieString {
public static void main(String[] args) {
	String[] strArr = {"a","bc","d","efg","hi","hhhh","ffff","gggg","fe","gjdkf","Aasdlkfj","T","ccc","abcde","abbb"};
	
	//1. 정렬(길이별)
	//길이별로 배열을 정렬
	Arrays.sort(strArr, (o1, o2) -> {
		return o1.length() - o2.length();
	});
	
	System.out.println(Arrays.toString(strArr));
    //2. 정수타입 변수 2개 만듦
		long max =0; int n =0;
	//3. 하나는 길이가 1인 문자의 개수를 담음(최초 최대값)
	Stream<String> num = Stream.of(strArr);
	max = num.filter(i -> i.length()==1).count();
	System.out.println(max);
	for(int i=2; i <=strArr[strArr.length-1].length(); i++ ) {
		for (int j=0; j<strArr.length; j++) {
			if(strArr[j].length()==i) n+=1;
		}
		if(n>max) max= n;
		n=0;
	}
	
	//4. 다음 길이의 값 개수를 세어서 max값과 비교
	System.out.println(max);
	
	
	
}
}
