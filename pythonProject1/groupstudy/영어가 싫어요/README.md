# 영어가 싫어요

## 문제
---
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/91c593d2-c71d-4577-9e3b-744f76205b5b)

## 풀이방식
- 파이썬의 딕셔너리 사용
- 반복문으로 키에 해당하는 값으로 문자열 대체(replace) 

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```python
# 영어가 싫어요
def solution(numbers):
  nums = {"one":1,"two":2,"three":3,"four":4,"five":5,"six":6,"seven":7,"eight":8,"nine":9,"zero":0}
  answer = ""
  for i in list(nums.keys()):
    if i in numbers:
      numbers = numbers.replace(i, str(nums.get(i)))
  return int(numbers)

print(solution('onefourzerosixseven'))

```
</details>