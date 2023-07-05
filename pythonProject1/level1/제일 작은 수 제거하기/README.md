# 제일 작은 수 제거하기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/618dbee3-7f5e-4ce3-93f9-ad40471dfecf)

## 풀이방식

- 배열의 크기가 1이면 -1만을 담은 배열을 리턴한다.
- 최소값을 반복문으로 비교하면서 구한다.
- 최솟값 갯수를 제외한 배열 사이즈를 구한다.
- 구한 배열 사이즈만큼의 int 배열을 만들어서 담아준다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 제일 작은 수 제거하기
class Solution {
    public int[] solution(int[] arr) {
    	if(arr.length==1) {
    		int[] answer = {-1};
    		return answer;
    	}
        
        int min = Integer.MAX_VALUE;
        int index = 0;
        // 최솟값 구하기
        for(int i=0;i<arr.length;i++) {
        	if(arr[i] < min) {
        		min = arr[i];
        	}
        }
        // 최솟값 갯수 제외한 배열 사이즈 구하기
        for(int i=0;i<arr.length;i++) {
        	if(arr[i] != min) {
        		index++;
        	}
        }
        // 배열사이즈 만큼 배열만들어서
        int[] answer = new int[index];
        index = 0;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]!=min) {
        		answer[index] = arr[i];
        		index++;
        	}	
        }    
        
        return answer;
    }
}
```

</details>
