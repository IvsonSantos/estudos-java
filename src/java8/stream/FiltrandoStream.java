package java8.stream;

import java.util.Arrays;
import java.util.List;

import java8.codigos.Usuario;

public class FiltrandoStream {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Adrian Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 90);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		// O processamento dessa operação vai parar assim que
		// o stream encontrar algum usuário que é moderador
		boolean hasModerador = usuarios.stream().anyMatch(Usuario::isModerador);

		// descobrir se todos os usuários são moderadores
		boolean allModerador = usuarios.stream().allMatch(Usuario::isModerador);
		
		// com allMatch ou se nenhum deles é, com o noneMatch
		boolean noneModerador = usuarios.stream().noneMatch(Usuario::isModerador);
	}

}
