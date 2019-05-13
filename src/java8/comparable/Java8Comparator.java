package java8.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8.consumer.Usuario;

public class Java8Comparator {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150, false);
		Usuario user2 = new Usuario("Rodrigo Turini", 120, false);
		Usuario user3 = new Usuario("Guilherme Silveira", 190, false);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		
		// antes
		Collections.sort(usuarios, new Comparator<Usuario>() {
			@Override
			public int compare(Usuario u1, Usuario u2) {
				return u1.getPontos() - u2.getPontos();
			}
		});
		Collections.reverse(usuarios);
		List<Usuario> top10 = usuarios.subList(0, 10);
		for (Usuario u : top10) {
			u.tornaModerador();
		}
		
		
		// no java 8
		usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
		usuarios.subList(0, 10).forEach(Usuario::tornaModerador);
	}
}
