package java8.comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import java8.consumer.Usuario;

public class ComparingTest {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		Function<Usuario, String> extraiNome = u -> u.getNome();
		
		Comparator<Usuario> comparator = Comparator.comparing(extraiNome);
		
		usuarios.sort(comparator);
		
		usuarios.forEach(u -> System.out.println(u.getNome()));
	}
	
}
