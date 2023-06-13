# 행렬의 덧셈

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/023b7b1b-8bd2-4582-9a65-3e983024b35d)

## 풀이방식

- 1차원 배열영역과 2차원 배열영역의 최대 크기를 구하여 만들어진 answer배열에서 서로 다른 두 배열의 합의 결과값을 저장하여
- 그대로 answer 반환

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 행렬의 덧셈
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
    	int max = 0;
    	int max2 = 0;

    	if(arr1.length < arr2.length) {
    		max2 = arr2.length;
    	}else {
    		max2 = arr1.length;
    	}

    	for(int[] a :arr1 ) {
    		if(a.length > max) {
    			max = a.length;
    		}
    	}

    	for(int[] b : arr2) {
    		if(b.length > max) {
    			max = b.length;
    		}
    	}

        int[][] answer = new int[max2][max];

        for(int i=0;i<max2;i++) {
        	for(int j=0;j<max;j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        	}
        }

        return answer;
    }
}

```

</details>
