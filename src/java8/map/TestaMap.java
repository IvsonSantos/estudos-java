package java8.map;

import java.util.HashMap;
import java.util.Map;

public class TestaMap {
	
	public static void main(String[] args) {
		
		/** Map
			As already mentioned maps don't support streams. 
			Instead maps now support various new and useful methods for doing common tasks. */

		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < 10; i++) {
		    map.putIfAbsent(i, "val" + i); //prevents us from writing additional if null checks 
		}

		map.forEach((id, val) -> System.out.println(id + " " + val));
		
		map.computeIfPresent(3, (num, val) -> val + num);
		System.out.println(map.get(3));  // val33

		map.computeIfPresent(9, (num, val) -> null);
		map.containsKey(9);     // false

		map.computeIfAbsent(23, num -> "val" + num);
		map.containsKey(23);    // true
		
		// removendo se existir valido
		map.remove(3, "val3");
		map.get(3);             // val33
		map.remove(3, "val33");
		map.get(3);             // null
		
		// verifica se existe
		map.getOrDefault(42, "not found");  // not found
		
		// merge
		map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
		map.get(9);             // val9
		map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
		map.get(9);             // val9concat
	}

}
