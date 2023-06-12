# 달리기 경주

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/acc663ca-138a-44fa-b4db-285badfa7e87)

## 풀이방식

- 이중 반복문으로 시간 복잡도 문제에서 해결 불가능
- HashMap을 통한 Key, Value 1대1 매핑으로 시간복잡도 문제를 해결
- playersmap에 players배열의 요소들을 put 이 때, value는 1부터 넣는다.
- callings의 0번쨰 index부터 불린 playermap에서 교체 알고리즘을 통해
- players에서 교체 후 playermap 값을 callings가 끝날때까지 반복 변경

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
import java.util.*;

// 달리기 경주
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map <String, Integer> playersmap = new HashMap();
        for(int i=0;i<players.length;i++) playersmap.put(players[i],i+1);
        for(int i=0;i<callings.length;i++) {
        	String temp = "";
        	temp = players[playersmap.get(callings[i])-2];
        	players[playersmap.get(callings[i])-2] = players[playersmap.get(callings[i])-1];
        	players[playersmap.get(callings[i])-1] = temp;
        	
        	playersmap.put(callings[i],playersmap.get(callings[i])-1);
        	playersmap.put(temp,playersmap.get(temp)+1);
        	
        }
        return players;
    }
}

```

</details>
