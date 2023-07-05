# 자료구조-2회차 : bin_digit.py
# 
# 2진수 표기이 비트 수
# 복잡도 분석의 예 : 반복 알고리즘
# 반복할 때마다 크기가 절반씩 줄어듬
# 이 알고리즘의 복잡도는 log2N
def binary_digits(n):        # 입력 양의 정수 n
    count = 1               # 이진수 최소 길이는 0
    while n > 1:            # n이 1보다 크면 더 나눌 수 있음
        count = count + 1   # count 증가
        n = n // 2          # 몫 구하기
    return count            # count반환


#-======================================================

print("총 비트 수 ( 0) = ",binary_digits(0))
print("총 비트 수 ( 1) = ",binary_digits(1))
print("총 비트 수 ( 13) = ",binary_digits(13))
print("총 비트 수 (123) = ",binary_digits(123))
print("총 비트 수 (123456789012345) = ",binary_digits(123456789012345))