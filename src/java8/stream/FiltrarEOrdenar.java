package java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import java8.codigos.Usuario;

public class FiltrarEOrdenar {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Adrian Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 90);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		// No stream, o método de ordernação é o sorted.
		List<Usuario> lista = usuarios.stream()
				.filter(u -> u.getPontos() > 100)
				.sorted(Comparator.comparing(Usuario::getNome))
				.collect(Collectors.toList());
		
		System.out.println(lista);
		
	}

}
