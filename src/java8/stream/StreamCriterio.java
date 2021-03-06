package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import java8.codigos.Usuario;

public class StreamCriterio {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		Stream<Usuario> stream = usuarios.stream();
		stream.filter(u -> {
			return u.getPontos() > 100;
		});
		
		// ou
		Stream<Usuario> stream2 = usuarios.stream();
		stream2.filter(u -> u.getPontos() > 100);
		
		// ou
		usuarios.stream().filter(u -> u.getPontos() > 100);
	}
}
