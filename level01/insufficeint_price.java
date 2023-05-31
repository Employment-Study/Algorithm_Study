package step01;

public class insufficeint_price {
public static void main(String[] args) {
	int price = 3;
	int money = 20;
	int count = 4;
	int result =0;
	for(int i=1 ; i<=count ; i++) {
		result += i*price;
	}
	
	if ( money > result ) System.out.println(0);
	else {System.out.println(result- money); }
	System.out.println(result);
	
	// n(1+2+3)
}
}
