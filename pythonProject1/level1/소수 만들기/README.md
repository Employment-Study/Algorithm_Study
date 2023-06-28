# 소수 만들기

## 문제

![image](https://github.com/Employment-Study/Team_StudyJava/assets/44068819/42597bf1-895d-4012-ad7c-1461a84d3555)

## 풀이방식

- 소수 판별 함수를 만들고
- 3중 for문을 돌려서 세개의 합이 소수이면 answer에 1을 더한 값을 리턴하도록한다. 효율은 최악이다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
//소수 만들기
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0;i<nums.length-2;i++) {
        	for(int j=i+1;j<nums.length-1;j++) {
        		for(int k=j+1;k<nums.length;k++) {
        			int sum =nums[i]+nums[j]+nums[k];
        			if(verify(sum)) {
        				answer++;
        			}
        		}
        	}
        }
        return answer;
    }

    // 소수 판별
    public boolean verify(int num){
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num % i == 0){
                count++;
            }
        }

        return count == 2 ? true : false;
    }
}

```

</details>
