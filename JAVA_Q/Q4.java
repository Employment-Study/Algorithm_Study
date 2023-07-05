package week5_2;
// 조건에 맞게 수열 변환하기 2
import java.util.Arrays;

public class Q2 {
	
	static int solution(int[] arr) {
		int answer = 0; // while 총 반복
		int x = 0;// for 반복
		int[] arr2 = new int [arr.length];
		while(x != arr.length) {// arr의 길이만큼 반복 ,길이와 같아지면 종료
			x = 0;// 반복초기화
			arr2 = arr.clone();// clone()메소드 : 기본적으로 메모리를 복사한다
			// 원본객체의 필드 값과 동일한 값을 가지는 새로운 객체를 생성
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] >= 50 && arr[i] % 2 == 0) {
					arr[i] /= 2;
				}
				System.out.println("1번  : "+Arrays.toString(arr));
				
				if(arr[i] < 50 && arr[i] % 2 != 0) {
					arr[i] = arr[i]*2+1;
				}
				System.out.println("2번  : "+Arrays.toString(arr));
				
				if(arr[i] == arr2[i] ) x ++;// 조건 확인후  두 배열의 i값이 같으면 카운트
				System.out.println("3번  : "+Arrays.toString(arr)+"x = " +x);
			}answer++;// for문이 종료되면서 answer값이 1씩 증가
			System.out.println(Arrays.toString(arr)+"  x = " + x +", "+answer+"번  반복 ");
		}
		return answer - 1;
	}

	
	
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 100, 99, 98};
		
		int z = solution(arr);
		
		System.out.println(z);
		
	}

}
