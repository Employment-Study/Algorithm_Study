# 함수로 구현한 Bag
def contains(bag,e):
    return e in bag

def insert(bag, e):
    bag.append(e)
    
def remove(bag, e):
    bag.remove(e)
    
def count(bag):
    return len(bag)

def numOf(bag,e):
    count =0
    for i in range(len(bag)):
        if bag[i] == e:
            count = count + 1
    return count