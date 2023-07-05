package p7_1;



public class Q2 {
	
	public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pass = id_pw[1];
        boolean ID_PASS = false;
        boolean ID = false;
        
        for(int i = 0; i < db.length; i++) {
        	if(db[i][0].equals(id)) {
        		if(db[i][1].equals(pass)) {
        			ID_PASS = true;
        			break;
        		}
        		else 
        			ID = true;
        		break;
        	}
        }
        
        if(ID_PASS == true) {
        	answer = "login";
        }
        else if(ID == true)
        	answer = "wrong pw";
        else
        	answer = "fail";
        
        return answer;
        
	}
	
	public static void main(String[] args) {
		
		Q2 q2 = new Q2();
		String[] id_pw= {"meosseugi", "1234"};
		String[][] db = 
			{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
	
		System.out.println(q2.solution(id_pw,db));
		
		
	}
}
