package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.codigos.Usuario;

public class StreamImutavelTest {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 90);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		usuarios.stream().filter(u -> u.getPontos() > 100);
		
		// imprime todos, nao remove o menos de 100 pontos porque o Stream é imutavel
		usuarios.forEach(System.out::println);
		
		System.out.println();
		
		Stream<Usuario> stream = usuarios.stream().filter(u -> u.getPontos() > 100);
		stream.forEach(System.out::println);
		
		// obter uma listade volta
		List<Usuario> maisQue100 = new ArrayList<>();
		
		usuarios.stream()
				.filter(u -> u.getPontos() > 100)
				//.forEach(u -> maisQue100.add(u));
				.forEach(maisQue100::add);
		
		// melhor ainda
		List<Usuario> mais100 = usuarios.stream().filter(u -> u.getPontos() >100).collect(Collectors.toList());
	}
}
