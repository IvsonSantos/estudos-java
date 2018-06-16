package java8.colecoes;

import java.util.Arrays;
import java.util.List;

public class Filtrando {

	public static void main(String[] args) {

		List<String> palavras = Arrays.asList("Paulinho", "Zulu", "Ivson", "Armando", "Givanilton");

		// para filtrar as Strings com menos de 6 caracteres
		palavras.stream().filter(s -> s.length() < 6).forEach(System.out::println);

		/*
		 * O método filter recebe a interface funcional Predicate como parâmetro. Essa
		 * interface possui apenas o método test que recebe T e retorna um boolean. Você
		 * nem precisava saber disso! Com o lambda, os nomes das interfaces funcionais
		 * perdem um pouco a importância e tornam o código mais simples de ler.
		 */
	}
}
