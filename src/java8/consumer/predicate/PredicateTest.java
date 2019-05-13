package java8.consumer.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import java8.consumer.Usuario;

public class PredicateTest {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150, false);
		Usuario user2 = new Usuario("Rodrigo Turini", 120, false);
		Usuario user3 = new Usuario("Guilherme Silveira", 190, false);

		/*
		 * Há um detalhe aqui: o removeIf invoca o remove de uma coleção, então ela não
		 * pode ser imutável, ou um UnsupportedOperationException será lançado. Esse é o
		 * caso da lista devolvida por Arrays.asList
		 */
		// List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);

		Predicate<Usuario> predicado = new Predicate<Usuario>() {
			@Override
			public boolean test(Usuario t) {
				return t.getPontos() > 160;
			}
		};

		usuarios.removeIf(predicado);
		usuarios.forEach(u -> System.out.println(u.getNome()));

		/**
		 * Podemos também usar aqui o lambda. Não precisamos nem mesmo declarar a
		 * variável predicado! Podemos passar o u.getPontos() > 160 direto para o
		 * removeIf:
		 */
		usuarios.removeIf(u -> u.getPontos() > 160);
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
	}

}
