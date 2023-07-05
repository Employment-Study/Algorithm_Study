# 나머지가 1이 되는 수 찾기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/e482639a-9c62-40df-9c1f-7279715f3334)

## 풀이방식

- 반복문과 조건문을 잘 사용하여 해결
- 나머지가 1인 가장작은 수를 발견했을 때 그 값을 리턴

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 나머지가 1이 되는 수 찾기
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=2;i<n;i++) {
        	if(n%i==1) {
        		answer = i;
        		break;
        	}
        }
        return answer;
    }
}

```

</details>
