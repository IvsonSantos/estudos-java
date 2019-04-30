package exercises.performance;

import java.util.Comparator;

public class ComparadorInteger implements Comparator<Integer> {

	public int compare(Integer s1, Integer s2) {
		return Integer.compare(s1, s2);
	}

}
