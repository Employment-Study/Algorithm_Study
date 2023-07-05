class Car:
    def __init__(self, color, speed=0):
        self.color = color
        self.speed = speed

    def display(self):
        print(self.color, ":", self.speed)

    def speedUp(self):
        self.speed += 10

    def speedDown(self):
        self.speed -= 10
        
    def __str__(self):
        return "[%s] [speed = %d]" % (self.color, self.speed)


class SuperCar(Car):
    def __init__(self, color, speed=0, bTurbo=True):
        super().__init__(color, speed)  # 부모(Car) 클래스의 생성자 호출
        self.bTurbo = bTurbo            # 터보모드를 위한 변수 생성 및 초기화

    def setTurbo(self, bTurbo=True):
        self.bTurbo = bTurbo

    def speedUp(self):
        if self.bTurbo:
            self.speed += 50
        else:
            super().speedUp()

    def __str__(self):
        if self.bTurbo:
            return "[%s] [speed = %d] 터보모드 " % (self.color, self.speed)
        else:
            return "[%s] [speed = %d] 일반모드 " % (self.color, self.speed)


s1 = SuperCar('GOLD', 0, True)
s2 = SuperCar('White', 0, False)
s3 = Car('RED', 0)

s1.speedUp()
s2.speedUp()
s3.speedUp()

print(s1)
print(s2)
print(s3)
