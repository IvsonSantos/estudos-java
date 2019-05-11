package java8.supplier.fibonacci;

import java.util.stream.IntStream;

public class TestaFibonacci {

	public static void main(String[] args) {
		
		IntStream.generate(new Fibonacci())
				 .limit(10)
				 .forEach(System.out::println);
		
		int maiorQue100 = IntStream.generate(new Fibonacci())
				.filter(f -> f > 100)
				.findFirst()
				.getAsInt();
		System.out.println(maiorQue100);
	}
}
