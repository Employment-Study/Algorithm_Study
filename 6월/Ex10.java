package lv00_basic;

public class Ex10 {
	// 첫번째 코드
	static String solution(String[] id_pw, String[][] db) {
		String answer = "";
		
		//db를 조회
		for (int i = 0; i < db.length; i++) {
			// 만약 pw 0번째와(아이디) db의 i ,0번째가 일치하면서
			if (id_pw[0].equals(db[i][0])) {
				// pw 1번쨔 (비번) db의 1번째가 일치하면 
				if (id_pw[1].equals(db[i][1])) {
					// 로그인성공 
					answer = "login";
					break;
					// 아니면 만약 answer가  login을 포함하면 
				} else {
					if (answer.contains("login")) {
						// 처음으로 되돌아가고 
						continue;
						// 아니면 pw가 틀렸습니다.
					} else {
						answer = "wrong pw";
					}
				}
			// 첫번째 로그인 조건이 거짓이면  
			} else {
				if (!answer.equals("login") && !answer.equals("wrong pw")) {
					// answer= 아예 로그인 실패 
					answer = "fail";
					
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] id_pw = { "a", "1234" };
		String[][] db = { { "a", "1234" }, { "a", "134" }, { "b", "1234" } };

		String result = solution(id_pw, db);
		System.out.println(result);
	}
}
