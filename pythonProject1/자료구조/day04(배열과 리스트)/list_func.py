# 파이썬 리스트의 내장함수

A = [1,2,3,4]

print("Original A = ", A)


# append는 리스트의 맨 뒤에 값을 추가한다.
# 남은 공간이 있는 경우 O(1)
# 최악의 경우는 용량 확장이 필요한 경우 O(n) 

A.append(7)
A.append(8)
A.append(9)

print("Appended A = ", A)


# pos위치의 항목을 꺼내고 반환한다.
# pop(pos)
# pos를 안주면 끝에서 부터 하나씩 뺴내서 반환한다.

A.pop()
A.pop()

print("Poped A = ",A)

# insert는 append와 달리 원하는 위치(index)에 값을 삽입할 수 있다.
# insert의 시간복잡도는 O(n)

A.insert(0,0)
A.insert(2,9)       # 2번 index에 9를 끼워넣고 나머지는 뒤로 한칸씩 미룸

print("Inserted A = " , A)

# 리스트의 용량 확장 방법 (시간복잡도 O(n))
# 1. 용량을 확장한 새로운 배열 할당
# 2. 기존의 배열을 새로운 배열에 복사
# 3. 항목을 삽입
# 4. 기존 배열 해제, 리스트로 새 배열 사용 

