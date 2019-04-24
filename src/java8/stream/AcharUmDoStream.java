package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import java8.codigos.Usuario;

public class AcharUmDoStream {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Adrian Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 90);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		// para pegar apenas 1
		// no caso de não haver nenhum usuário com mais de 100 pontos, receberemos
		// uma exception.
		Usuario maisDe100= usuarios.stream()
				.filter(u -> u.getPontos() > 100)
				.collect(Collectors.toList())
				.get(0);
		
		// como todo o trabalho foi lazy, o stream não foi inteiramente filtrado
		Optional<Usuario> optMaisDe100 = usuarios.stream()
				.filter(u -> u.getPontos() > 100)
				.findAny();

	}

}
