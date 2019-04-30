package java7.classe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClasseAnonima {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("Sérgio");
		lista.add("Paulo");
		lista.add("Guilherme");

		/**
		 * Realmente new Comparator() não compila. Mas vai compilar se você abrir chaves
		 * e implementar tudo o que é necessário
		 * 
		 * Numa única linha nós denimos uma classe e a instanciamos! Uma classe que nem
		 * mesmo nome tem. Por esse motivo o recurso é chamado de classe anônima
		 */
		Comparator<String> comparador = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};

		Collections.sort(lista, comparador);
		System.out.println(lista);

		// melhor forma
		Collections.sort(lista, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});

	}

}
