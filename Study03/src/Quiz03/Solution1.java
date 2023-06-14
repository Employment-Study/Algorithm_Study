package Quiz03;

//문자열 계산하기
// 수,목
//class Solution {
// public int solution(String my_string) {
//	 // split : 특정 글자를 기준으로 분리하여 배열로 만들어서 반환
//	 // 즉 my_string매개변수 문자열 중에서 공백 기준으로 분리하여 
//	 // StringArr배열에 문자들을 담아주고
//	 
//	 // 공백을 기준으로 하기 때문에 숫자들이 띄어지지 않는이상 두자리수 , 3자리수도 1의 index로 묶인다
//	 // 그러므로 한자리수가 아니더라도 연산 가능
//	 String[] stringArr = my_string.split("");
//	 
//	 // stringArr[0]의 문자 하나하나를 answer에 정수형태로 담는다
//	 // 문제가 4 + 3 = 7로 한자리수의 연산이기 때문에
//	 // 먼저 앞에 있는 4를 answer에 넣어주고 반복문을 시작한다
//	 // 반복문을 시작할때에도 i를 1부터 시작하게 되면 바로 +를 만나게 되고
//	 // 그 만나는 연산이 +,-인지를 구분하여 answer에 합을 담아주면 되는 것이다
//	 // 여기서 문자 하나하나를 정수로 만들어주는 작업을 해야 연산을 할 수 있으니
//	 // Integer.parseInt함수를 사용해준다
//	 // 문자열 "4"도 Integer.parseInt를 하여 정수 4의 형태로 answer에 담는다
//     int answer = Integer.parseInt(stringArr[0]);
//     
//     
//     // 앞서 말햇다 시피, i를 4 앞에 연산부터 취급하기 위해 1부터 시작한다
//     for(int i = 1; i < stringArr.length; i+=2) { // i+=2는 반복문 종료를 위한 것
//    	 // 즉, 연산부터 판단하도록 반복문을 구현했기때문에 현재 연산이 +인지, -인지 조건을 걸고
//    	 // 종속문장으로 값을 연산하여 answer에 담으면 된다
//    	 
//    	 // equals함수를 이용하여 stringArr배열에서 +라는 문자라면
//    	 if(stringArr[i].equals("+")) {
//    		 // answer에 +의 다음 index를 answer에 +하여 담아라
//    		 // 현재 i는 연산자(+)이다, 여기서 i + 1은 4와 더해야하는 정수이다
//    		 // 인덱스로 자리이동을 하여 다음 정수를 answer에 먼저 담았던 4와 연산을 한다
//    		 answer += Integer.parseInt(stringArr[i+1]); 
//    	 }	// 문자열은 + 또는 -이기떄문에 else는 -일때의 경우이다
//    	 else { // -도 마찬가지로 연산자 기준 다음 index를 +하여 그 자리에 있는 정수와
//    		 // 현재 담겨있는 answer의 값과 연산하여 return한다
//    		 answer -= Integer.parseInt(stringArr[i-1]); 
//    		 
//    	 }
//    	 
//     }
//  
//     return answer;
// }
//}

public class Solution1 {
	public static void main(String[] args) {
//		Solution so = new Solution();
//		so.solution("4 + 7");
//		
	}
}
