# 문자열 묶기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/67864b4d-d8be-40d9-8fcd-206f0131e061)

## 풀이방식

- HashMap으로 구현하였음
- 문자열의길이(key)를 길이에 해당하는 문자열들의 갯수(Value)로 주고 반복자(iterator)로 순회하여 value의 최대값을 찾아서 answer에 담아 리턴하였음

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 문자열 묶기
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int maxValue = 0;

        // HashMap에 key, value로 길이를 Key로 둔 갯수(value) Map을 만듦
        Map<Integer, Integer> numArr = new HashMap<Integer, Integer>();

        for(int i=0;i<strArr.length;i++) {
        	if(numArr.get(strArr[i].length())!= null)
        		numArr.put(strArr[i].length(), numArr.get(strArr[i].length())+1);
        	else
        		numArr.put(strArr[i].length(), 1);
        }

        Set set = numArr.entrySet();
        Iterator iterator = set.iterator();

        // 반복자(iterator)를 사용하여 다음 요소가 없을 때까지 값을 가져와서 MAX값과 비교
        while(iterator.hasNext()) {
        	Entry<Integer, Integer> entry = (Entry)iterator.next();
        	int value = (Integer)entry.getValue();
        	if(value > maxValue) {
        		maxValue = value;
        	}
        }

        answer = maxValue;
        return answer;
    }
}
```

</details>
