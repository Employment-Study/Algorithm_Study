package step0;


import java.util.function.Predicate;
import java.util.stream.Stream;

public class coffeeErrand {
public static void main(String[] args) {
	// 아메리카노(4500), 카페라테(5000)
	// 아무거나(4500)
	
	String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
	int result =0;
	Stream<String> str = Stream.of(order);
	for(String i: order) i=i.replaceAll("[ice|hot]","");
	
	Predicate<String> p = i -> i.contains("latte");
	
	for(String i: order) if(p.test(i)) result += 5000; else result+=4500;

		System.out.println(result);


	} 
}
