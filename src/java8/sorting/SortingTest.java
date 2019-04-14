package java8.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingTest {

	public static void main(String[] args) {

		List<String> p = Arrays.asList("p1", "p2", "p3");

		/*
		 * não compila. Não há esse método sort em List que não recebe parâmetro. Nem
		 * teria como haver, pois o compilador não teria como saber se o objeto invocado
		 * é uma List de Comparable ou de suas filhas.
		 */

		// Collectors.sort(p);

		List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");
		palavras.sort(Comparator.naturalOrder());

	}

}
