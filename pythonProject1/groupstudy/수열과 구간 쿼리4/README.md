# 수열과 구간 쿼리4

## 문제
---
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/ebf239e7-0393-42eb-b80c-9ea00b634daa)


## 풀이방식
- 이차원 배열의 인덱스 사용 조심하며
- 반복문과 조건제어문을 적절히 사용



## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];//0
            int e = query[1];//4
            int k = query[2];//1

            if(k==0){
                if(s == 0){
                    arr[0]++;
                    continue;
                }
            }
            if(e < arr.length){
                for(int i = s;i<e+1; i++){
                    if (i%k==0)
                        arr[i]+=1;
                }    
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
```

</details>