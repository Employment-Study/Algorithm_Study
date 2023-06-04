package arrlength2power;

class Solution {
    static int[] solution(int[] arr) {
    	/*
    	 * 배열의 길이를 2의 거듭제곱으로 만들기
    	 * 정수 배열 arr이 매개변수로 주어집니다. arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
    	 * arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요
    	 * 
    	 * 입출력 예
    	 * arr = {1, 2, 3, 4, 5, 6}	result = {1, 2, 3, 4, 5, 6, 0, 0}
    	 * arr = {58, 172, 746, 89}	result = {58, 172, 746, 89}
    	 */
    	
        int[] answer = {};	// 반환할 answer 배열
        int power = 1;	 // 2의 제곱을 계산할 변수 -> 1도 2의 0승이기 때문에 1로 설정해 줘야 한다
       
        int length = arr.length; // while 반복문을 돌리기 위해 arr의 길이를 저장하는 length 변수
        while(length != power) {	// arr의 길이가 2의 제곱이 아닐 때까지 반복
        	length = arr.length;
        	if(length > power) {	// length가 2의 거듭제곱보다 클 때
        		power *= 2;		// power에 2를 곱한다
        	}
        	if(length < power) {	// length가 2의 거듭제곱의 값보다 작을 때
        		int[] tmp = new int[power];	// 임시 정수 배열 tmp를 생성
        		for(int i = 0; i < arr.length; i++) {	// arr의 길이만큼 반복하면서
        			tmp[i] = arr[i];	// 임시 배열 tmp의 i번째에 arr의 i를 저장
        		}
        		arr = tmp;	// arr이 tmp 배열이 가리키는 곳을 가리키게 만든다
        	}
        }
        answer = arr;	// 제출할 answer 배열이 arr을 가리키게 만든다
        return answer;
    }
}