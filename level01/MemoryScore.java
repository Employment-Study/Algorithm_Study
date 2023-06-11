package step01;

import java.util.Arrays;
import java.util.HashMap;

public class MemoryScore {
public static void main(String[] args) {
	String[] name = {"may", "kein", "kain", "radi"};
	
	int[] yearning = {5,10,1,3};
	
	String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
	
	HashMap<String, Integer> map = new HashMap<>();
	
	for(int i=0; i<name.length; i++) {
		map.put(name[i], yearning[i]);
	}
	int[] result = new int[photo.length];
	
	for(int i=0; i<photo.length;i++) {
		for(int j=0; j<photo[i].length;j++) {
			if(map.get(photo[i][j])!=null)
			result[i] += map.get(photo[i][j]);
		}
	}
	
	
//	Map<String, Integer> map = IntStream.range(0, name.length)					
//	.mapToObj(operand -> Map.entry(name[operand], yearning[operand]))			
//	.collect(Collectors.toSet()).stream()										
//	.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));			
	
	
//    return Arrays.stream(photo)																							
//	.mapToInt(strings -> Arrays.stream(strings).					
//	mapToInt(value -> map.getOrDefault(value, 0))					
//	.sum()).toArray();												
}
}



/*
 IntStream.range(0, name.length): IntStream은 주어진 범위 내의 정수 시퀀스를 생성합니다. 
 이 코드에서는 0부터 name 배열의 길이(name.length)까지의 정수 시퀀스를 생성합니다.

.mapToObj(operand -> Map.entry(name[operand], yearning[operand])): mapToObj는 IntStream의 각 요소를 객체로 매핑하는 데 사용됩니다. 
여기서는 operand라는 변수를 사용하여 name 배열과 yearning 배열의 해당 인덱스 요소를 Map.entry() 메서드로 매핑합니다.
 Map.entry()는 주어진 키와 값으로 Map.Entry 객체를 생성합니다.

.collect(Collectors.toSet()).stream(): .collect()는 Stream의 요소를 수집하는 데 사용됩니다. 
여기서는 Collectors.toSet()을 사용하여 중복이 없는 요소로 이루어진 Set을 생성합니다. 
그런 다음 .stream()을 호출하여 Set을 다시 Stream으로 변환합니다.

.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)): 
.collect()를 다시 사용하여 Stream의 요소를 수집하고, Collectors.toMap()을 사용하여 Map<String, Integer> 객체를 생성합니다. 
toMap()은 Map.Entry의 키와 값으로 매핑합니다. Map.Entry::getKey는 Map.Entry 객체의 키를, Map.Entry::getValue는 Map.Entry 객체의 값으로 매핑합니다.

따라서, 주어진 코드는 name과 yearning 배열을 사용하여 키와 값의 쌍으로 이루어진 Map<String, Integer> 객체를 생성합니다. 
각 name 배열의 요소는 키로 사용되고, 해당 인덱스의 yearning 배열의 요소는 값으로 사용됩니다.
*/