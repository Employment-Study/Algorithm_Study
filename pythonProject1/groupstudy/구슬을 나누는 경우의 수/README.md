# 구슬을 나누는 경우의 수

## 문제

---

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/be67f5ff-0899-413a-9229-0c70ef31bf54)
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/6c5ab16a-7f60-41dd-849b-b0f4bf268171)

## 풀이방식

- 분자의 위치에 팩토리얼(!) 할 숫자들을 배열에 담고
- 분모의 위치에 팩토리얼(!) 할 숫자들을 다른 배열에 담아서
- 적절히 나누어 순열 조합의 식을 완성한다.
- 곱해서 값을 만들 때 long타입이 필요한 경우가 생길 수 있다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java

class Solution {
    public long solution(int balls, int share) {
        int answer = 0;
        int[] bunza = new int[balls-share];
        int[] bunmo = new int[balls-share];

        if(balls == share) {
        	return 1;
        }
		// solution(5,3) 이라면 분자는 (4,5) 이기 때문
        int value = share+1;

        // 분자 부분
        for(int i = 0; i < bunza.length; i++) {
        	bunza[i] = value;
        	value++;
        }


        // 분모 부분
        for(int i = 0;i < bunmo.length; i++) {
        	bunmo[i] = i+1;
        }

        // 분자의 약수가 분모 라면 나누기
        for(int i=0;i<bunmo.length;i++) {
        	for(int j=0;j<bunza.length;j++) {
        		if(bunza[j] % bunmo[i] == 0) {
        			bunza[j] = bunza[j]/bunmo[i];
        			bunmo[i] = 1;
        			break;
        		}
        	}
        }
		// long타입(타입 에러 주의)
        long a=1,b=1;
        for(int i=0;i<bunmo.length;i++) {
        	a *= bunza[i];
        	b *= bunmo[i];
        }

        answer = Long.valueOf(a / b).intValue();

        return answer;
    }
}

```

</details>

## 사실 더 쉬운 방법이 있는데
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/8a673f43-34a6-424d-909a-0af930beebe8)

## 위의 식을 활용해 재귀 호출하는 것이다...