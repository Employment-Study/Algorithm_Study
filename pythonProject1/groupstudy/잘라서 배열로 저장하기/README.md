# 잘라서 배열에 저장하기

## 문제
---
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/8040f902-4c5a-4281-ae8d-0c41081ac686)

## 풀이방식
- 파이썬의 리스트 사용

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```python
# 잘라서 배열로 저장하기

def solution(my_str, n):
    answer = []
    for i in range(0,len(my_str),n):
      if(i+n<len(my_str)):
        answer.append(my_str[i:i+n])
      else:
        answer.append(my_str[i:])
    return answer
    
print(solution("abc1Addfggg4556b",6))
```


</details>