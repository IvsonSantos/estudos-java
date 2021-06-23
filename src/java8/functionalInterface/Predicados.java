package java8.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Predicados {
	
	public static void main(String[] args) {
		
		Predicate<String> p1 = s -> s.length() < 20;
		Predicate<String> p2 = s -> s.length() > 20;
		Predicate<String> p3 = p1.and(p2);
		Predicate<String> id = Predicate.isEqual(p2);
		
		List<String> strings = Arrays.asList("a", "c", "b");
		List<String> result = new ArrayList<>();
		
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = result::add;
		Consumer<String> c3 = c1.andThen(c2);
		
		strings.forEach(c1.andThen(c2));
		System.out.println(result.size());
		System.out.println(strings.size());
		
		Predicate<String> p = Predicate.isEqual("two");
		Stream<String> s1 = Stream.of("one","two","three");
		Stream<String> s2 = s1.filter(p);
		System.out.println(s2);
		
	
	}

}
