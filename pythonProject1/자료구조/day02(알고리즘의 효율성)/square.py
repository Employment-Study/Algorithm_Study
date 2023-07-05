## 제곱을 구하는 알고리즘 3개 비교
import time;

def squareAlgorithmA(x):
    sum = x * x
    return sum
    
def squareAlgorithmB(x):
    sum = 0
    for i in range(x):
        sum += x
    return sum

def squareAlgorithmC(x):
    sum = 0
    for i in range(x):
        for i in range(x):
            sum += 1
    return sum

a = squareAlgorithmA(5)
b = squareAlgorithmB(5)
c = squareAlgorithmC(5)

print(a)
print(b)
print(c)