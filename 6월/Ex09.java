package lv00_basic;

// 6월 5주차 월화수목 문제 
public class Ex09 {
	static int solution(int[][] dots) {
		// w오 h변수 초기화
		int w = 0;
		int h = 0;
		// 배열의 첫번째 좌표 저장
		int x = dots[0][0];
		int y = dots[0][1];
		
		for(int i = 1; i<dots.length; i++) {
			// 현재 점과 x값이 다르면  
			if(x != dots[i][0]) {
			//w 변수에 현재점의 x좌표 차이인 x -dots[i][0]저장 
				w =  Math.abs(x -dots[i][0]);
			}
			// 현재점과 y값이 다르면
			if(y != dots[i][1]) {
			// h변수에 y- dots[i][1] 저장
				h = Math.abs(y-dots[i][1]);
			}
		}
		// 직사각형 넓이 리턴
		return w*h;
		
	}
	public static void main(String[] args) {
		int[][] dots = {{1,1}, {2,1}, {2,2},{1,2}};
		int result = solution(dots);
		System.out.println(result);
		
	}					

}
