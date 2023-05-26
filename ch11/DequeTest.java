package ch11;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
public static void main(String[] args) {
	//Deque는 stack과 queue를 모두 사용할 수 있다.
	//구현체로는 ArrayDeque와 LinkedList가 있다.
	ArrayDeque<String> arr_de = new ArrayDeque();
	
	arr_de.offerFirst("I");
	arr_de.offerLast("Am");
	arr_de.offerLast("Groot");
	Object obj = null;
	
	while((obj = arr_de.poll())!=null) System.out.println(obj);
}
}
