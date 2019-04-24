package java8.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import java8.codigos.Usuario;

public class MapMaiorPontos {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 90);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		Optional<String> maxNome = usuarios.stream()
										   .max(Comparator.comparing(Usuario::getPontos))
										   .map(u -> u.getNome());
		
		System.out.println(maxNome);
	}
}
