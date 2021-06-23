package java8.colecoes;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {

		List<String> palavras = Arrays.asList("Paulinho", "Zulu", "Ivson", "Armando", "Givanilton");
		
		
		palavras.forEach(System.out::println);
		
		System.out.println();
		
		//palavras.stream().forEach(palavra -> System.out.println(palavra));
		palavras.parallelStream().forEach(System.out::println);
		
	}

}
