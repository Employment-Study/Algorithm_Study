# 파이썬의 클래스와 객체
# 추상 자료형의 구현 방법

# 프로그래밍 기법 측면에서
# 1. 함수 기반 프로그래밍
# 2. 객체 지향 프로그래밍

# 함수 기반 프로그래밍의 문제점
# - 같은 이름의 여러 함수가 여러 자료구조에서 필요ㅛ

# 클래스와 객체
# 클래스    : 객체를 만들어 낼 수 있는 틀 (도면)
# 객체      : 클래스를 이용해 만들어 낸 사례
# 인스턴스  : 객체와 유사한 의미, 클래스의 인스턴스가 객체


# 자동차 클래스
class Car:
    def __init__(self, color, speed=0):
        self.color=color
        self.speed=speed  
    def speedUp(self):
        self.speed += 10
    def speedDown(self):
        self.speed -= 10
        

# 연산자 중복
# - 사용자 정의 클래스의 객체들에게 ==, + , - 등의
# 표준 연산자들을 적용할 수 있도록 하는 기능


# car3 = car1+ car2
# if car1 == car2:...
