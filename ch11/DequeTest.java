package ch11;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
public static void main(String[] args) {
	//Deque�� stack�� queue�� ��� ����� �� �ִ�.
	//����ü�δ� ArrayDeque�� LinkedList�� �ִ�.
	ArrayDeque<String> arr_de = new ArrayDeque();
	
	arr_de.offerFirst("I");
	arr_de.offerLast("Am");
	arr_de.offerLast("Groot");
	Object obj = null;
	
	while((obj = arr_de.poll())!=null) System.out.println(obj);
}
}
