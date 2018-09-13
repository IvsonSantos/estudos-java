package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestandoStream {

	public static void main(String[] args) {

		// cria a lista de testes
		List<String> sc = new ArrayList<>();
		sc.add("ddd2");
		sc.add("aaa2");
		sc.add("bbb1");
		sc.add("aaa1");
		sc.add("bbb3");
		sc.add("ccc1");
		sc.add("bbb2");
		sc.add("ddd1");
		
		// imprimindo o array
		System.out.println(Arrays.asList(sc));
		
		
		/** Filter accepts a predicate to filter all elements of the stream. 
			This operation is intermediate which enables us to call another stream operation 
			(forEach) on the result. 
			ForEach accepts a consumer to be executed for each element in the filtered stream. 
			ForEach is a terminal operation. It's void, so we cannot call another stream operation. */
		sc.stream()
						.filter((s) -> s.startsWith("b"))
						.forEach(System.out::println);
		
		// "bbb1", "bbb3", "bbb2"
		
		
		/** Sorted is an intermediate operation which returns a sorted view of the stream. 
			The elements are sorted in natural order unless you pass a custom Comparator. */		
		sc.stream()
						.sorted()
						.filter((s) -> s.contains("1"))
						.forEach(System.out::println);
		
		// "aaa1","bbb1","ccc1"
		
		/** Map
			The intermediate operation map converts each element into another object via 
			the given function. 
			The following example converts each string into an upper-cased string. 
			But you can also use map to transform each object into another type. 
			The generic type of the resulting stream depends on the generic type of the function 
			you pass to map. */		
		sc.stream()
					    .map(String::toUpperCase)
					    .sorted((a,b) -> b.compareTo(a))
					    .forEach(System.out::println);
		// "DDD2", "DDD1", "CCC", "BBB3", "BBB2", "AAA2", "AAA1"
		
		/** Reduce
		    This terminal operation performs a reduction on the elements of the stream with the 
		    given function. The result is an Optional holding the reduced value. */
		Optional<String> reduced = sc.stream()
									 .sorted()
									 .reduce((s1,s2) -> s1 + "#" + s2); 
		reduced.ifPresent(System.out::println);
		// "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"
						
		
		/** Match
			Various matching operations can be used to check whether a certain predicate matches 
			the stream. All of those operations are terminal and return a boolean result. */
		boolean anyStartsWithA = sc.stream().anyMatch((s) -> s.startsWith("a"));
		System.out.println(anyStartsWithA);      
		// true
					
		boolean allHave1 = sc.stream().allMatch((s) -> s.contains("1"));
		System.out.println(allHave1);      
		// false
		
		boolean noneHaveLenght5 = sc.stream().noneMatch((s) -> s.length() == 5);
		System.out.println(noneHaveLenght5);      
		// true
		
		
		/** Count
			Terminal operation returning the number of elements in the stream as a long */
		long startsWithB = sc.stream()
							 .filter((s) -> s.startsWith("b"))
							 .count();
		System.out.println(startsWithB);    
		// 3
		
	}
}
