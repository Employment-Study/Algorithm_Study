package threeSeparator;

import java.util.*;

// 세 개의 구분자
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("a|b|c", " ");

        ArrayList<String> al = new ArrayList<>();

        String[] split = myStr.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                al.add(split[i]);
            }
        }

        String[] answer = new String[al.size()];

        if (answer.length == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
            return answer;
        }

        for (int i = 0; i < al.size(); i++) {
            answer[i] = al.get(i);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String myStr = "baconlettucetomato";
        String[] answer = s.solution(myStr);

    }
}
