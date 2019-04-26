package java8.stream;

import java.util.Arrays;
import java.util.List;

import java8.codigos.Usuario;

public class MaximaPontuacao {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Adrian Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 90);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		double pontuacaoMedia = usuarios.stream()
				.mapToInt(Usuario::getPontos)
				.average()
				.getAsDouble();
		
		System.out.println(pontuacaoMedia);
		
		// somar todos pontos
		int total = usuarios.stream().mapToInt(Usuario::getPontos).sum();
		
		System.out.println(total);
	}
}
