# 문자열 내 마음대로 정렬하기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/7fff4e6a-929f-4cd8-a7c3-5bed27c6cbfa)

## 풀이방식

- comparator를 사용하여 -1,1,String의 compareTo를 이용하여 오름차순 정렬하였다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
import java.util.Arrays;
import java.util.Comparator;

//  문자열 내 마음대로 정렬하기
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.charAt(n) > o2.charAt(n)) {
                    return 1;
                } else if (o1.charAt(n) < o2.charAt(n)) {
                    return -1;
                } else if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                }
                return 0;
			}
		});

        answer = strings;
        return answer;
    }
}
```

</details>
