package nestedArray;

public class test01 {
public static void main(String[] args) {

	 
    
	int[][] arr= new int [5][5];
	int n=5;
	int garo;
	int sero;
	int cut=0;
	int number =1;
	
	      
		while(n>0) {
		
		//top 
		for(sero=0; sero<n; sero++) 		arr[cut][cut+sero] = number++; 
			               
		//right 
		for(garo=1; garo<n; garo++) 		arr[cut+garo][5-1-cut] = number++; 
		           	
		//bottom 	//garo = 5	
		for(sero=1; sero<n; sero++)			arr[cut+garo-1][5-sero-1-cut] = number++;
			
		//left 
		for(sero=1; sero<n-1; sero++)		arr[5-sero-1-cut][cut] = number++;
			  
		cut++; 
		n-=2;
	}


	//삽입된 데이터 출력 실시
	for(garo=0; garo<5; garo++){
		for(sero=0; sero<5; sero++){
			System.out.printf("%3d",arr[garo][sero]);
		}
		System.out.println();
	}   
}
}
