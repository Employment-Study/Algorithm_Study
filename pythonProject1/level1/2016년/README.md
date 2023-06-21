# 2016년

## 문제

![image](https://github.com/LeeBG/BaekjoonHub/assets/44068819/0f7ec99c-6031-4fcf-a2d5-cae727de5ac9)

## 풀이방식

- 2016년의 각 월의 1일의 요일을 계산해서 HashMap에 담았음
- 그 후 월(a)로 요일을 1일의 요일값을 받아서 1일 기준으로 요일을 계산한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
import java.util.HashMap;
import java.util.Map;

// 2016년
class Solution {
	public String solution(int a, int b) {
		String answer = "";
		String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		// a= 1, b=1, day = FRI;
		// 각 달마다 1일의 요일을 알아보자
		// 1 - 금 (31일)+3
		// 2 - 월 (29일) + 1
		// 3 - 화(31일) + 3
		// 4 - 금(30일) + 2
		// 5 - 일(31일) + 3
		// 6 - 수 (30일) + 2
		// 7 - 금 (31일) + 3
		// 8 - 월(31일) + 3
		// 9 - 목(30일) + 2
		// 10 - 토(31일) + 3
		// 11 - 화(30일)  +2
		// 12 - 목(31일)

		HashMap<Integer,String> dayMap = new HashMap<Integer, String>();
		dayMap.put(1, "FRI");
		dayMap.put(2, "MON");
		dayMap.put(3, "TUE");
		dayMap.put(4, "FRI");
		dayMap.put(5, "SUN");
		dayMap.put(6, "WED");
		dayMap.put(7, "FRI");
		dayMap.put(8, "MON");
		dayMap.put(9, "THU");
		dayMap.put(10, "SAT");
		dayMap.put(11, "TUE");
		dayMap.put(12, "THU");

		for( Map.Entry<Integer, String> elem : dayMap.entrySet() ){
            if(elem.getKey() == a) {
            	int index = 0;
            	for(int i =0;i<days.length;i++) {
            		if(days[i].equals(elem.getValue())) {
            			index = i;
            		}
            	}
            	index = ((b-1)%7 + index)%7;

            	answer = days[index];
            }
        }

		return answer;
	}
}
```

</details>
