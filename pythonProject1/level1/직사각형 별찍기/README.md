# 직사각형 별 찍기

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/9fcb86d7-2ee6-425f-a1a6-112c5d0bc528)

## 풀이방식

- 이중 for문을 사용해서 가로 세로의 입력에 따른 '\*' 직사각형을 출력한다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// 직사각형 별 찍기
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b;i++){
            for(int j = 0;j<a;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
```

</details>
