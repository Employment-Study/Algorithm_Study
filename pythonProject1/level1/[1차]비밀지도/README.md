# [1차]비밀지도

## 문제

![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/42a43533-d06a-411c-abdb-806985d1f4b7)
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/38a5cf7e-3241-4170-b08b-1f4c0fa76dd6)
![image](https://github.com/Employment-Study/Algorithm_Study/assets/44068819/0ac3423d-1005-49a9-b162-1a5bff78474f)

## 풀이방식

- 지도 두개를 겹치기 위해 String 배열을 두 개 사용하였다.
- Math.pow(2,n-1)로 나눌 수를 구해서 반복문으로 나누어 이진수를 만들었다
- 2진수 각 자리를 charAt으로 비교하였다.

## 코드

<details>
<summary>
[코드 보기/접기]
</summary>

```java
// [1차] 비밀지도
class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[arr1.length];
		String[] s_arr1 = new String[arr1.length];
		String[] s_arr2 = new String[arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			String test = "";
			int num = (int)Math.pow(2, n-1);
			while(num > 0) {
				if(arr1[i] / num == 1) {
					test+="#";
				}else {
					test+=" ";
				}
				arr1[i] %= num;
				num /= 2;
			}
			s_arr1[i] = test;
		}

		System.out.println();
		
		for(int i=0;i<arr2.length;i++) {
			String test = "";
			int num = (int)Math.pow(2, n-1);
			while(num > 0) {
				if(arr2[i] / num == 1) {
					test+="#";
				}else {
					test+=" ";
				}
				arr2[i] %= num;
				num /= 2;
			}
			s_arr2[i] = test;
		}
		for(int i=0;i<n;i++) {
			answer[i] = "";
			for(int j=0;j<n;j++) {
				if (s_arr1[i].charAt(j) != s_arr2[i].charAt(j)) {
					answer[i] += "#";
				}else if(s_arr1[i].charAt(j) == '#' && s_arr2[i].charAt(j) == '#'){
					answer[i] += "#";
				}else {
					answer[i] += " ";
				}
			}
		}
		return answer;
	}
}

```

</details>
