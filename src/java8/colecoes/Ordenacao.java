package java8.colecoes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ordenacao {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<String> palavras = Arrays.asList("Paulinho","Zulu","Ivson","Armando","Givanilton");
		
		// compara pelo primeiro caractere
		Comparator<String> comparator = new Comparator<String>() {			
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.charAt(0), s2.charAt(0));
			}
		};
		
		// usando o comparador com Stream, Essa é a sintaxe do Lambda no Java 8. Ela pode ser utilizada com qualquer interface funcional. 
		Comparator<String> comparador = (s1, s2) -> {
			 return Integer.compare(s1.length(), s2.length()); 
		};
		
		// melhorando o codigo acima
		Comparator<String> comp = (s1, s2) -> Integer.compare(s1.length(), s2.length());
		
		// outra forma melhor
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
				
		palavras.sort(comparator);		
		System.out.println(palavras);
		
		palavras.sort(comparador);
		System.out.println(palavras);
		
		// ordenar usando MAPS
		List<String> palavras2 = Arrays.asList("Paulinho","Zulu","Ivson","Ana","Givanilton");
		palavras2.sort(Comparator.comparingInt(String::length));
		System.out.println(palavras2);
	}
}
