# 나누어 떨어지는 숫자 배열

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/41866940-809b-46ba-9973-cd3e28117b3e)

## 풀이방식

- 나누어 떨어지면 이후 만들어지는 배열의 크기인 size를 증가시키고
- 나누어 떨어지지 않아 size가 0인 경우에는 -1을 담은 배열을 반환
- 나누어 떨어진다면 size에 맞는 배열을 만들어서 나누어 떨어지는 데이터만 저장
- 마지막으로 Arrays의 sort()함수로 병합정렬 후 return 해주는 방식이다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int size = 0;
        for(int i =0; i<arr.length;i++) {
        	if(arr[i] % divisor == 0) {
        		size++;
        	}
        }
        if(size == 0) {
        	int[] answer = { -1 };
        	return answer;
        }
        int[] answer = new int[size];
        size = 0;
        for(int i =0; i<arr.length;i++) {
        	if(arr[i] % divisor == 0) {
        		answer[size] = arr[i];
        		size++;
        	}
        }
        Arrays.sort(answer);
        return answer;
    }
}

```

</details>
