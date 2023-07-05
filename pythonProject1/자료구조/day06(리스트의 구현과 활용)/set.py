'''
집합의 개념
- 리스트와 유사하지만 원소의 중복을 허용하지 않는 자료구조
- 원소들 사이에 순서가 없음, 선형 자료구조가 아님
S = {item 0, item 1, item 3 ... item n-1}
- 특징적인 연산들
A B
A ∪ B
A ∩ B
A － B

집합 : 같은 유형의 유일한 원소들의 모임

# Set() : 비어있는 새로운 집합을 만듦
# insert(e) : 새로운 원소 e를 삽입함. 이미 e가 있다면 삽입하지 않음
# delete(e) : 원소 e를 집합에서 꺼내고(삭제) 반환
# isEmpty() : 공집합인지를 검사
# size() : 집합의 원소의 개수를 반환
# contains(e) : 집합이 원소 e를 포함하는지를 검사
# equals(set B) : setB와 같은 집합인지를 검사
# union (set B) : setB와 합집합을 만들어 반환
# intersect(set B) : setB와 교집합을 만들어 반환
# difference(set B) : setB와 차집합을 만들어 반환
# display() : 집합을 화면에 출력

'''
class ArrayList :
  def __init__(self, capacity = 10):  # 생성자 정의
    self.capacity = capacity          # 리스트의 용량
    self.items = [None]*self.capacity # 객체(데이터) : 인스턴스 변수
    self.nItems = 0                   # 리스트의 현재 원소 갯수
    
  def size (self) :                   # 원소의 갯수
    return self.nItems;

  def isEmpty(self) :
    return self.nItems == 0           # 공백 상태 검사
  
  def isFull(self) :
    return self.nItems >= self.capacity # 포화 상태 검사

  def clear(self) :
    self.nItems = 0                   # 리스트의 현재 원소 개수
  
  def getEntry(self, pos) :
    return self.items[pos]            # pos 위치의 원소 반환
  
  def insert(self, pos, elem):        # 삽입연산 O(n) pos위치에 원소 삽입
    if not self.isFull() :
      for i in range(self, nItem-1, pos-1, -1) :
        self.items[i+1] = self.items[i]
      self.items[pos] = elem
      self.nItems += 1
      
  def delete(self, pos) :             # 삭제 연산 O(n)
    if 0 <= pos < self.nItems :
      for i in range(pos, self.nItems-1):
        self.items[i] = self.items[i+1]
      self.nItems -= 1
  
  
  
  def append(self, elem):             # 맨 마지막 원소 elem 삽입 O(1)
    if not self.isFull() :            # 후단 삽입
      self.items[self.nItems] = elem
      self.nItems += 1
  
  def pop(self):                      # 맨 마지막 원소 삭제 O(1)
    if not self.isEmpty() :
      self.items[self.nItems-1] = None
      self.nItems -= 1
  
  def find(self, item):                 # 리스트에서 item의 위치 찾기
    for i in range(self.nItems):
      if self.items[i] == item:
        return i
    return -1

  def replace(self, pos, elem) :        # Pos위치의 원속 교체 O(1)
    self.items[pos] = elem
  
  def display(self, msg='ArrayList: '): # 리스트를 화면에 출력
    print(msg, end='=[')
    for i in range(self.nItems):
      print(self.items[i], end=', ')
    print(']')

class Set:
  def __init__(self, capacity=10) : # 생성자
    self.list = ArrayList(capacity)
  
  def size(self):
    return self.list.size()
  
  def contains(self,elem):
    if self.list.find(elem) >= 0:
      return True
    else : return False
  
  def isEmpty(self):
    return self.size() == 0
  
  def add(self, elem) : # add 삽입연산
    if not self.contains(elem):
      self.list.insert(self.size(),elem)
  
  def delete(self, elem):
    id = self,list.find(elem)
    if id >= 0:
      self.list.delete(id)
      
  def isSubsetOf(self, setB):
    for i in self.size():
      elem = self.list.getEntry()
      if not setB.contains(elem):
        return False
    return True
  
  def __equals__(self, setB):
    if self.size() != setB.size() : 
      return False
    else : 
      return self.isSubsetOf(setB) # 부분 집합이면 동일 집합
  
  def clone(self):
    newSet = Set()
    for i in range(self.size()):
      newSet.add(self.list.getEntry(i))
    return newSet
  
  def union(self, setB):  ## 합집합 복잡도 O(n^2)
    newSet = self.clone()
    for i in range(setB.size()):
      newSet.insert(setB.list.getEntry(i))
    return newSet
  
  def intersect(self, setB):      # 교집합
    newSet = Set()
    for i in range(self.size()):
      e1 = self.list.getEntry(i)
      for j in range(setB.size()):
        e2 = setB.list.getEntry(j)
        if e1 == e2:
          newSet.insert(e1)
    return newSet
  
  def difference(self, setB):
    newSet = self.clone()
    for i in range(setB.size()):
      newSet.delete(setB.list.getEntry(i))
    return newSet
  