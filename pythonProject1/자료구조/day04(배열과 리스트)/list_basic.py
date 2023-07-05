# 자료구조 리스트

A = [] # 빈 리스트
B = [1,2,3,4] # [1,2,3,4]
C = ["hi", "list"]

print("len(A) = ", len(A))
print("len(B) = ", len(B))
print("B[1] = ",B[1])
print("B = ", B)

# index는 0부터 시작이고
# 배열과는 달리 파이썬의 리스트는 크기가 정해져있지 않음

sum = 0
for i in range(len(B)):
    sum = sum + B[i]

print("sum(B) = ", sum)


