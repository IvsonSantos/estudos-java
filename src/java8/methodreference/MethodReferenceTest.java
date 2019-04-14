package java8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import java8.consumer.Usuario;

public class MethodReferenceTest {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		usuarios.forEach(u -> u.tornaModerador());

		/**
		 * Mas é possível executar essa mesma lógica de uma forma muito mais simples,
		 * apenas informando ao nosso forEach qual método deverá ser chamado. Podemos
		 * fazer isso usando um novo recurso da linguagem, o method reference
		 */
		usuarios.forEach(Usuario::tornaModerador);

		/**
		 * Outra forma Vale frisar que aqui não há reflection sendo utilizada, tudo é
		 * resolvido em tempo de compilação, sem custos de overhead para a performance.
		 */
		Consumer<Usuario> tornaModerador = Usuario::tornaModerador;
		usuarios.forEach(tornaModerador);
	}

}
