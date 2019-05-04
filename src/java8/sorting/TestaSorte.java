package java8.sorting;

import java.util.Arrays;
import java.util.List;

public class TestaSorte {

	public static void main(String[] args) {

		List<String> ls = Arrays.asList("João", "José", "Maria", "Adam");

		ls.sort((o1, o2) -> o1.compareTo(o2));

		ls.forEach(System.out::println);
		
		
		
		// melhor
        ls.sort(String::compareTo);
        ls.forEach(System.out::println);
	}

}
