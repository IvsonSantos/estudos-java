package java8.lambdas;

import java.util.Arrays;
import java.util.List;

public class Listas {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","b");
		list.forEach(s -> System.out.println(s));
		list.forEach(System.out::println);
	}

}
