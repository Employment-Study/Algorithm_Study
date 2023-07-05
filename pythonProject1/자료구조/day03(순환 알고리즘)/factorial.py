# 순환적으로 구현한 factorial함수: 복잡도 O(n)
def factorial(n):
    if n == 1:
        return 1
    else :
        return (n * factorial(n-1))


print(factorial(5)) # 5 x 4 x 3 x 2 x 1 = 120

# 반복 구조로 구현한 Factorial함수 : 복잡도 O(n)
def factorial_iter(n):
    result = 1
    for k in range(n,0,-1):
        result = result * k
    return result

# 순환호출의 동작과정
# - 어떤 함수가 자신을 다시 호출한다는 것은 그 함수가 다른 함수를 호출하는 것과 동일
# - 함수 처리가 끝나기 전에 다른 함수를 호출하려면
# - 함수 복귀를 위한 정보를 어딘가에 저장해야한다.
# - 호출된 함수가 끝난 후 복귀 정보를 이용해 복귀
# - 이 때, 활성 레코드와 시스템 스택이 사용된다.

# 활성 레코드
# 함수의 복귀를 위한 정보를 저장하는 레코드
# 프로그램의 복귀 주소,매개변수, 지역변수 등
# 순환호출이 계속 될 수록 스택에 활성 레코드가 쌓임
