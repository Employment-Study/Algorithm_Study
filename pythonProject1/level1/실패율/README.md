# 실패율

## 문제

![image](https://github.com/LeeBG/BaekjoonHub/assets/44068819/2038b23a-0a44-418c-8b97-7551336d2540)
![image](https://github.com/LeeBG/BaekjoonHub/assets/44068819/3cd793b1-10ae-4728-8242-78a2fa1df781)
![image](https://github.com/LeeBG/BaekjoonHub/assets/44068819/7bd32da0-15d2-42f9-b299-79701fa9f851)

## 풀이방식

- 실패율을 계산하기 위해 유저와 실패자의 비율을 계산해서 resultMap에 stage별로 담는다. 담는다.
- 실패율이 높은 높은것부터 낮은순으로 정렬하기 위해 EntryList의 sort()를 사용했다.(EntrySet)

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// 실패율
class Solution {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		int stage = 1;
		int mans = stages.length;
		HashMap<Integer, Double> resultMap = new HashMap<Integer, Double>();

		for (int i = 1; i < N + 1; i++) {
			int count = 0;
			for (int j = 0; j < stages.length; j++) { // N+1이 있으면 모든 스테이지 깬거임
				if(stages[j] == stage) {
					count++;
				}
			}
			resultMap.put(i,(double)count / mans) ;
			stage++;
			mans -= count;
		}

		List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(resultMap.entrySet());
		entryList.sort(new Comparator<Map.Entry<Integer, Double>>() {
			@Override
			public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
				if(o2.getValue() > o1.getValue()) {
					return 1;
				}else if(o2.getValue() < o1.getValue()) {
					return -1;
				}else {
					return 0;
				}
			}

		});
		int index = 0;
		for(Map.Entry<Integer, Double> entry : entryList) {
			// System.out.println("keys : " + entry.getKey() + ", values : " + entry.getValue());
			answer[index] = entry.getKey();
			index++;
		}


		System.out.println(Arrays.toString(answer));
		return answer;
	}
}
```

</details>
