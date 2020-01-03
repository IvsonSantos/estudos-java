package java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java8.codigos.Usuario;

public class ListaPontos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 90);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		// somando os pontos
		List<Integer> pontos = new ArrayList<Integer>();
		usuarios.forEach(u -> pontos.add(u.getPontos()));
		
		//mais enxuto
		List<Integer> pontos2 = usuarios.stream()
				.map(u -> u.getPontos())
				.collect(Collectors.toList());
		
		// mais simples ainda
		List<Integer> pontos3 = usuarios.stream()
				.map(Usuario::getPontos)
				.collect(Collectors.toList());

	}
}
