package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		
		List<String> palavras = Arrays.asList("Paulinho","Zulu","Ivson","Ana","Givanilton");
		
		OptionalDouble media = palavras.stream()
							   .mapToInt(String::length)
							   .average();
		
		System.out.println(media.orElse(0));
				
		
		// filtrar strings
		palavras.stream().sorted()
		        .filter(s -> s.length() < 6)
				.forEach(System.out::println);
				
		
		// transformar em List
		List<String> resultado = palavras.stream()
				  .filter(s -> s.length() < 6)
				  .sorted()
				  .collect(Collectors.toList()); 
		System.out.println(resultado);
				
	}
}
