# 자료구조 1차시
#
# 파이썬으로 기술한 알고리즘 : 배열에서 최대값 찾기
def find_max(A):
    max = A[0]# 알고리즘
    for item in A:
        if item > max:
            max = item
    return max

# 테스트 코드
array = [20,34,12,93,84,39,64,55,24]    # 정수 리스트
print("A = ",array)                     # 리스트의 내용
print("max(A) = ",find_max(array))      # 배열의 최대값을 반환하는 함수 호출

