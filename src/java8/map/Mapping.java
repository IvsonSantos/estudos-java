package java8.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Mapping {

	public static void main(String[] args) {
		
		List<String> palavras = Arrays.asList("Paulinho", "Zulu", "Ivson", "Armando", "Givanilton");
		
		IntStream stream = palavras.stream().mapToInt(String::length);

		System.out.println(stream);
	}
}
