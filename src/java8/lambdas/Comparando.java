package java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparando {
	
	public static void main(String[] args) {
		
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		};
		

		Comparator<String> compLambda  = (String o1, String o2) -> Integer.compare(o1.length(), o2.length()); 

		// other way
		Comparator<Integer> maior = Integer::compare;

		List<String> list = Arrays.asList("***","**","****","*");
		Collections.sort(list, compLambda);
		
		for (String s : list) {
			System.out.println(s);
		}
		
	}

}
