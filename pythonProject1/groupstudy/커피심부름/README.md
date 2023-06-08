# 커피 심부름

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/9bccdbb9-81ec-40e2-bbcf-c746c49fd72e)

## 풀이방식

- String의 메서드 contains()를 잘 사용해서 해결

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java

class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String coffee : order) {
        	if(coffee.contains("americano") || coffee.contains("anything")) {
        		answer += 4500;
        	}else if(coffee.contains("cafelatte")) {
        		answer += 5000;
        	}
        }
        return answer;
    }
}

```

</details>
