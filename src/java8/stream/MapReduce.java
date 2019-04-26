package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

import java8.codigos.Usuario;

public class MapReduce {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Adrian Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 90);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		
		int valorInicial = 0;
		
		// recebe dois inteiros e devolve um inteiro
		IntBinaryOperator operacao = (a, b) -> a + b;
		
		int total = usuarios.stream()
				.mapToInt(Usuario::getPontos)
				.reduce(valorInicial, operacao);
		System.out.println(total);
		
		// outra forma
		int total2 = usuarios.stream()
				.mapToInt(Usuario::getPontos)
				.reduce(0, (a,b) -> a + b);
		System.out.println(total2);
		
		// outra
		int total3 = usuarios.stream()
				.mapToInt(Usuario::getPontos)
				.reduce(0, Integer::sum);
		System.out.println(total3);
		
		// multiplicando
		int multiplicacao = usuarios.stream()
				.mapToInt(Usuario::getPontos)
				.reduce(1, (a,b) -> a * b);
		System.out.println(multiplicacao);
		
		
	}
}
