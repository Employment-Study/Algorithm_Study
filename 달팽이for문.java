package nestedArray;

public class 달팽이for문 {
	static void show(int[][] arr) {
		for(int garo=0; garo<5; garo++){
			for(int sero=0; sero<5; sero++){
				System.out.printf("%3d",arr[garo][sero]);
			}
			System.out.println(""); 
		} 
		System.out.println();
	}
	
public static void main(String[] args) {
	int arr[][]= new int [5][5];
	int garo; 
	int sero;
	int n=5;
	int cut=0; 
	int number =1;
	

	while(n>0){
		//top
		for(sero=0; sero<n; sero++)			arr[cut][cut+sero] = number++;            
		show(arr);	
		//right 
		for(garo=1; garo<n; garo++)			arr[cut+garo][4-cut] = number++; 
		show(arr);	
			           	
			
		//bottom 
		System.out.printf("%d , %d\n", garo ,cut);
		for(sero=1; sero<n; sero++)			arr[cut+garo-1][4-sero-cut] = number++;
		show(arr);	
			
			
		//left 
		for(sero=1; sero<n-1; sero++)		arr[4-sero-cut][cut] = number++;
		show(arr);	
			
		
		cut++; 
		n-=2;
	}
	
	show(arr);

	   
}
}
