package java8.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDiferenca {

	public static void main(String[] args) {

		// usando antes do JAVA 8
		List<String> names = Arrays.asList("Tite", "Paulinho", "Jesus", "Neymar");

		System.out.println(names);

		// The static utility method Collections.sort accepts a list and a comparator in
		// order to sort the elements of the given list.
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});

		System.out.println(names);

		// mesmo codigo com o Java 8
		Collections.sort(names, (String a, String b) -> {
			return a.compareTo(b);
		});
		System.out.println(names);

		// Java 8 mais otimizado
		Collections.sort(names, (String a, String b) -> a.compareTo(b));
		System.out.println(names);

		// For one line method bodies you can skip both the braces {}
		// and the return keyword. But it gets even more shorter:
		Collections.sort(names, (a, b) -> a.compareTo(b));
		System.out.println(names);
	}
}
