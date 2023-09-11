package theMergeSort;

public class Main {
	private static int[] sorted;
	
	public static void merge_sort(int[] a) {
		
		sorted = new int[a.length];
		merge_sort(a,0,a.length-1);
		sorted = null;
	}//merge_sort
	public static void merge_sort(int[]a , int left, int right) {
		
		
		
		//1 ...2 ... 4... 8... 으로 나누는 기준을 두배로 늘린다.
		for(int size=1; size <= right ; size += size){
			/*
			 * 두 부분 리스트를 순서대로 병합한다.
			 * 예를 들어 현재 부분리스트의 크기가 1(size=1)일 때
			 * 왼쪽 부분리스트(low~mid) 와 오른쪽 부분리스트 (mid +1 ~high)를 생각하면
			 * 왼쪽 부분 리스트는 low = mid = 0;
			 * 오른쪽 부분 리스트는 mid+1부터 low+(2*size)-1이다.
			 * 
			 * 이때 high가 배열의 인덱스를 넘어갈 수 있으므로 right와 둘 중 작은 값이 병합되도록 해야 한다.
			 */
			
			for(int l=0; l<=right-size;l+=(2*size)) {
				int low =l;
				int mid = l + size -1;
				int high  = Math.min(l+(2*size)-1,right);
				merge(a,low,mid,high);	//병합
			}
		}
		
	}//merge_sort
		public static void merge(int[] a, int left , int mid, int right) {
			int l = left;
			int r = mid+1;
			int idx = left;
			
			while(l<=mid && r <= right) {
				/*
				 * 왼쪽 부분리스트 1번째 원소가 오른쪽 부분리스트 r번째 원소보다 작거나 같을 경우
				 * 왼쪽의 1번쨰 원소를 새 배열에 넣고 1과 idx를 1 증가시킨다.
				 */
				if(a[l]<=a[r]) {
					sorted[idx]=a[l];
					idx++;
					l++;
				}
				else {
					sorted[idx]=a[r];
					idx++;
					r++;
				}
			}
			
			if(l>mid) {
				while(r<=right) {
					sorted[idx]=a[r];
					idx++;
					r++;
				}
			}
			else {
				while(l<=mid) {
					sorted[idx]=a[l];
					idx++;
					l++;
				}
			}
			
			for(int i=left; i<=right; i++) {
				a[i] = sorted[i];
			}
			
			
			
			
		}
		
		
		
		
		
}
