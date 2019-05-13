package java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	/**
	 * Rode o código.Você vai ver que ambos os consumidores serão executados
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150, false);
		Usuario user2 = new Usuario("Rodrigo Turini", 120, false);
		Usuario user3 = new Usuario("Guilherme Silveira", 190, false);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		Consumer<Usuario> mostraMensagem = u -> System.out.println("antes de imprimir os nomes");
		Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());

		usuarios.forEach(mostraMensagem.andThen(imprimeNome));
	}
}
