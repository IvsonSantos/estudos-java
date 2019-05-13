package java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MostradorTest {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150, false);
		Usuario user2 = new Usuario("Rodrigo Turini", 120, false);
		Usuario user3 = new Usuario("Guilherme Silveira", 190, false);
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		// consumindo
		Mostrador m = new Mostrador();
		usuarios.forEach(m);

		// criando o consumidor sem criar uma classe a parte
		// Isso vai acabar gerando um .class com nome estranho, como por exemplo
		// Capitulo2$1.class. Como não podemos nos referenciar a um nome dessa
		// classe, chamamo-la de classe anônima, como já deve ser de seu conhecimento
		Consumer<Usuario> mostrador = new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println("- " + u.getNome());
			}
		};
		usuarios.forEach(mostrador);

		// melhorando o codigo ainda mais
		usuarios.forEach(new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println("--> " + u.getNome());
			}
		});

		// um lambda no Java é uma maneira mais simples de implementar
		// uma interface que só tem um único método
		// O compilador percebe que você o está atribuindo a um
		// Consumer<Usuario> e vai tentar jogar esse código no único método que essa
		// interface
		// define. Repare que não citamos nem a existência do método accept! Isso é
		// inferido durante o processo de compilação.
		Consumer<Usuario> mostra = (Usuario u) -> {
			System.out.println("====> " + u.getNome());
		};
		usuarios.forEach(mostra);

		// O compilador consegue também inferir o tipo, sema necessidade
		// de utilizar Usuario, nem parênteses:
		Consumer<Usuario> mostra2 = u -> System.out.println("** " + u.getNome());
		usuarios.forEach(mostra2);

		//Não está satisfeito? Caso o bloco dentro de { } contenha apenas uma instrução,
		//podemos omiti-lo e remover também o ponto e vírgula:
		Consumer<Usuario> mostra3 = u -> System.out.println("**** " + u.getNome());
		usuarios.forEach(mostra3);
		
		// metodo mais simples possivel
		usuarios.forEach(u -> System.out.println(u.getNome()));

	}

}
