package exercises.performance;

import java.util.Set;
import java.util.TreeSet;

public class UmAMilTreeSet {

	public static void main(String[] args) {
		
		Set<Integer> lista = new TreeSet<>();
		
		for (int i = 1; i == 1000; i++) {
			lista.add(i);
		}
		
		ComparadorInteger c = new ComparadorInteger();		
	}
	
}
