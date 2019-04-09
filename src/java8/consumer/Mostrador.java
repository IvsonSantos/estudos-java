package java8.consumer;

import java.util.function.Consumer;

/**
 * Criamos uma classe que implementa essa nova interface do Java 8. Ela é bem
 * trivial, possuindo o único método accept responsável por pegar um objeto do
 * tipo Usuario e consumi-lo. ‘Consumir’ aqui é realizar alguma tarefa que faça
 * sentido pra você.
 * 
 * @author ivsonhenrique
 *
 */
public class Mostrador implements Consumer<Usuario> {

	@Override
	public void accept(Usuario u) {
		System.out.println(u.getNome());
	}

}
