package java7.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class CollectionsLib {

	public void testaMapa() {
		String s1 = "Valor do Mapa 1";
		String s2 = "Valor do Mapa 2";

		// cria o mapa
		Map<String, String> mapa = new HashMap<>();
		mapa.put("String1", s1);
		mapa.put("String2", s2);

		String total = mapa.get("String2");
		System.out.println(total);
	}

	public void testaPerformanceArray() {

		System.out.println("Iniciando...");
		Collection<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		//busca é muito mais lento
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("(Array) Tempo gasto(ms): " + tempo);
	}
	
	public void testaPerformanceHashSet() {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		for (int i=0; i < total; i++) {
			teste.add(i);
		}
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("(Hash) Tempo gasto(ms): " + tempo);		
	}
	
	public void ordemCrescente() {
		
		Collection<Integer> teste = new TreeSet<>();
		
		int total = 1000;
		for (int i=0; i < total; i++) {
			teste.add(i);
		}
		
//		Collections.reverse(teste);
	}


//	2. Gere todos os números entre 1 e 1000 e ordene em ordem decrescente utilizando um ArrayList .
//	Como ficou seu código?
}
