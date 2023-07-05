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
        for j in range(x):
            sum += 1
    return sum