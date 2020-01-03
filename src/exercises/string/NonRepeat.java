package exercises.string;

import java.util.HashMap;
import java.util.Map;

public class NonRepeat {

	public static void main(String[] args) {
		System.out.println(nonRepeating("abcab"));	// should return 'c'
		System.out.println(nonRepeating("abab"));	// should return null
		System.out.println(nonRepeating("aabbbc"));	// should return 'c'
		System.out.println(nonRepeating("aabbdbc"));// should return 'd'
	}

	private static Character nonRepeating(String valor) {

		Map<Character, Integer> charCount = new HashMap<>();

		for (char c : valor.toCharArray()) {
			if (charCount.containsKey(c)) {
				Integer newVal = charCount.get(c) + 1;
				charCount.put(c, newVal);
			} else {
				charCount.put(c, 1);
			}
		}
		
		for (char c : valor.toCharArray()) {
			if (charCount.get(c) == 1) {
				return c;
			}
		}
		
		return null;
	}
	
	
//     for (char c : s.toCharArray()) {
//         if (charCount.get(c) == 1) return c;
//     }
//     return null;

}
