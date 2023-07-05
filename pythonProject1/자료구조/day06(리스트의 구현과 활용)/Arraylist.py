'''
Array List 클래스 구현

리스트 ADT 추상 자료형 

isFull()      : 리스트가 가듣 차있는 지 검사
size()        : 리스트의 요소의 갯수를 반환
clear()       : 리스트를 초기화
getEmtry(pos) : pos index에 있는 요소를 반환
find(e)       : 리스트에서 항목 e가 있는 지 찾아 인덱스 반환
replace(pos,e): pos에 있는 항복을 e로 바꿈
append(e)     : 리스트의 맨 뒤에 새로운 항목을 추가
pop()         : 리스트의 맨 뒤 항목을 꺼내고 반환
display()     : 리스트의 화면에 보기 좋게 출력

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
    