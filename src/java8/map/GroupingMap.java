package java8.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8.consumer.Usuario;

public class GroupingMap {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150, true);
		Usuario user2 = new Usuario("Rodrigo Turini", 120, true);
		Usuario user3 = new Usuario("Guilherme Silveira", 90, false);
		Usuario user4 = new Usuario("Sergio Lopes", 120, false);
		Usuario user5 = new Usuario("Adriano Almeida", 100, false);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3, user4, user5);

		// Queremos um mapa em que a chave seja a pontuação do usuário e o valor seja
//		uma lista de usuários que possuem aquela pontuação. Isto é, um Map<Integer,
//		List<Usuario>>.

		Map<Integer, List<Usuario>> pontuacao = new HashMap<>();
		
		for (Usuario u : usuarios) {
			pontuacao.computeIfAbsent(u.getPontos(), user -> new ArrayList<>()).add(u);
		}
		
		System.out.println(pontuacao);
		
		
		// 2 metodo
		Map<Integer, List<Usuario>> pontuacao2 = usuarios
				.stream()
				.collect(Collectors.groupingBy(Usuario::getPontos));
		
		
		//Podemos particionar todos os usuários entre moderadores
		//e não moderadores, usando o partitionBy
		Map<Boolean, List<Usuario>> moderadores = usuarios
				.stream()
				.collect(Collectors.partitioningBy(Usuario::isModerador));
		
		
		// Em vez de guardar os objetos dos usuários, poderíamos guardar uma lista com
		// apenas o nome de cada usuário, usando o mapping para coletar esses nomes em
		// uma lista
		Map<Boolean, List<String>> nomesPorTipo = usuarios
				.stream()
				.collect(
						Collectors.partitioningBy(
								Usuario::isModerador,
								Collectors.mapping(Usuario::getNome,
										Collectors.toList())
						)
				);
		
		System.out.println();
		
		// coletando nomes
		String nomes = usuarios
				.stream()
				.map(Usuario::getNome)
				.collect(Collectors.joining(", "));
		System.out.println(nomes);
		
		
		// Filtrar os usuários commais
		// de 100 pontos, ordená-los e coletar o resultado em uma lista:
		List<Usuario> filtradosOrdenados = usuarios.stream()
				.filter(u -> u.getPontos() > 100)
				.sorted(Comparator.comparing(Usuario::getNome))
				.collect(Collectors.toList());
		
		//para processamento em paralelo com milhoes de registros
		List<Usuario> filtradosOrdenados2 = usuarios.parallelStream()
				.filter(u -> u.getPontos() > 100)
				.sorted(Comparator.comparing(Usuario::getNome))
				.collect(Collectors.toList());

	}
}
