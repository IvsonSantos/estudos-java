package java8.map;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import java8.codigos.Usuario;

public class MapMediaTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 90);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		double media = usuarios.stream()
							   .mapToInt(Usuario::getPontos)
							   .average()
							   .getAsDouble();
		// com Optional
		OptionalDouble opt = usuarios.stream()
									.mapToInt(Usuario::getPontos)
									.average();
		// Se a lista for vazia, o valor de pontuacaoMedia será 0.0.
		double optMedia = opt.orElse(0.0);
		
		// em uma unica linha
		double media1 = usuarios.stream()
								.mapToInt(Usuario::getPontos)
								.average()
								.orElse(0.0);
		
		// lancando exception
		double media2 = usuarios.stream()
								.mapToInt(Usuario::getPontos)
								.average()
								.orElseThrow(IllegalStateException::new);
		
		// Podemos verificar o contrário: se realmente existe um valor dentro do opcional.
		// E, no caso de existir, passamos um Consumer como argumento:
		usuarios.stream()
				.mapToInt(Usuario::getPontos)
				.average()
				.ifPresent(v -> System.out.println(v));
		
		
		
	}
}
