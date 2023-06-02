"""
길이가 
100 이하인 문자열로 구성된 암호문을 발견하였다.

이 암호문은 예전에 작성된 것으로 판단된다.

이 문자열에서 “C”라는 문자와 “CC”라는 문자가 몇 개 있는지 조사하고자 한다.

길이가 
100 이하인 문자열을 입력받아, "CC"라는 문자와 "C"라는 문자가 각각 몇 개 존재하는지 알아내는 프로그램을 작성하시오. 
(단,C, CC는 대소문자를 구분하지 않는다. 즉, "C"는 "c"와 같다.)

"""
num1 = 0
num2 = 0

str = input()
str = str.lower()


for i in range(len(str)):
    if str[i]=='c':
        num1+=1
    if i<len(str)-1 and str[i]=='c' and str[i+1]=='c':
        num2+=1

print(num1)
print(num2)
