![Collection 상속계층도](https://github.com/Employment-Study/Algorithm_Study/assets/132982907/a4e82013-6001-4b8b-9077-b4b6e8bf26f2)

## 레포지토리 작성법
- <h3>각자 만든 브랜치에 본인 폴더 만들어서 자유롭게 커밋</h3>


---

## 브랜치 바로가기

| 번호 |  멤버  |  사용하시는 언어  |     바로가기      | 
| :--: | :--------: | :-----------------: | :---------------: |
|  01  | 이선로 |      자바      | [바로가기][sunro] |
|  02  | 이병길 |     파이썬      | [바로가기][LeeBG] |
|  03  | 정수용 |      자바      | [바로가기][SuYong] |
|  04  |  |      자바      | . |
|  05  |  |      자바      | . |
|  06  |  |      자바      | . |




[sunro]: https://github.com/Employment-Study/Algorithm_Study/tree/Sunro_Algo
[LeeBG]: https://github.com/Employment-Study/Algorithm_Study/tree/LeeBG
[SuYong]: https://github.com/Employment-Study/Algorithm_Study/tree/Accept

//ListIterator

내가 보려고 쓴 메모 : Iterator에서 remove메서드를 사용하려면 UnsupprtedOperationException을 throws로 명시해줘야 한다. 
remove메서드를 선언부에 예외처리하지 않은 이유는 UnsupprtedOperationException이 RuntimeException의 자손이기 때문이다.
또한 next()를 쓰고 remove()를 써야한다 꼭!! 특정위치의 요소를 불러와서 삭제하는것이 아니라 next로 불러온 요소를 삭제하는 것이기 때문이다.

next와 previous또한 hasNext와 hasPrevious를 사용해야한다.

toString은 1차원 배열의 출력
2차원 이상 배열은 deepToString()으로 출력 가능

1차원 비교 = equals
다차원 비교 = deepequals

comparable > java.lnag package
comparator = java.util package


HashSet를 사용하되 저장 순서대로 배열을 유지하고 싶으면 LinkedHashSet사용, 중복된 값은 저장이 되지 않지만 타입이 다른 형태의 동일한 값은 저장이 가능

Collection은 interface이고 Collections는 Class이다.


HashSet을 통해 중복을 제거한 리스트들 간의 교집합, 차집합, 합집합이 가능하다.


이진검색 트리는 검색과 정렬에 유리하다. 하지만 노드의 추가와 삭제에 시간이 걸린다.( 추가와 삭제는 링크드리스트가 더 빠름)
Set을 사용하기 때문에 중복x, 레드블랙 트리를 사용
왼쪽 자식노드 > 부모노드 > 오른쪽 자식 노드 순으로 검색시 오름차순 가능



2023.06.04

배운 메서드 :  copyOfRange(arraay, start, end(not inclusive end))
배운 문제풀이 :  n번째 위치의 문자열을 기준으로 정렬을 하고 싶으면 n번째 문자를 가장 앞으로 가져와서 정렬하면 된다.
