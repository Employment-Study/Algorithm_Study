# 본 문제는 python 의 빠른 기초 학습을 위해 설계된 문제로서 python 코드 제출을 기준으로 설명되어 있습니다. 
# ------

# 영일이는 생명과학에 관심이 생겨 왕개미를 연구하고 있었다.

# 왕개미를 유심히 살펴보던 중 특별히 성실해 보이는 개미가 있었는데,
# 그 개미는 개미굴에서 나와 먹이까지 가장 빠른 길로 이동하는 것이었다.

# 개미는 오른쪽으로 움직이다가 벽을 만나면 아래쪽으로 움직여 가장 빠른 길로 움직였다.
# (오른쪽에 길이 나타나면 다시 오른쪽으로 움직인다.)

# 이에 호기심이 생긴 영일이는 그 개미를 미로 상자에 넣고 살펴보기 시작하였다.

# 미로 상자에 넣은 개미는 먹이를 찾았거나, 더 이상 움직일 수 없을 때까지
# 오른쪽 또는 아래쪽으로만 움직였다.

# 미로 상자의 구조가 0(갈 수 있는 곳), 1(벽 또는 장애물)로 주어지고,
# 먹이가 2로 주어질 때, 성실한 개미의 이동 경로를 예상해보자.

# 단, 맨 아래의 가장 오른쪽에 도착한 경우, 더 이상 움직일 수 없는 경우, 먹이를 찾은 경우에는
# 더이상 이동하지 않고 그 곳에 머무른다고 가정한다.

# 미로 상자의 테두리는 모두 벽으로 되어 있으며,
# 개미집은 반드시 (2, 2)에 존재하기 때문에 개미는 (2, 2)에서 출발한다.

# 10 x 10은 고정

d = []
j = 1
for i in range(11):
    d.append([])
    for j in range(11):
        d[i].append(0)
    
for i in range(10):
    a = input().split()
    for j in range(10):
        d[i+1][j+1] = int(a[j])


x = 2
y = 2

while True:
    d[x][y] = 9
    if d[x][y+1] == 0:
        y += 1
    elif d[x][y+1] == 1:
        if d[x+1][y] == 0:
            x +=1
        elif d[x+1][y]== 1:
            break
        elif d[x+1][y] == 2:
            d[x+1][y] = 9
            break
    elif d[x][y+1] == 2:
        d[x][y+1] = 9
        break
    
for i in range(1,11):
    for j in range(1,11):
        print(d[i][j],end=" ")
    print()
