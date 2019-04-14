package java8.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8.codigos.Usuario;

public class ComparatorTest {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		
		Comparator<Usuario> comparator = new Comparator<Usuario>() {
			@Override
			public int compare(Usuario o1, Usuario o2) {
				return o1.getNome().compareTo(o2.getNome()) ;
			}
		};
		
		Collections.sort(usuarios, comparator);
		
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		// java 8 comparandoß
		Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		
		// melhor metodo
		usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		
		
		usuarios.sort(Comparator.comparing(u -> u.getNome()));
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		
		/**
		 * Melhor forma de comparacao
		 */
		usuarios.sort(Comparator.comparing(Usuario::getNome));
	}
	
}
