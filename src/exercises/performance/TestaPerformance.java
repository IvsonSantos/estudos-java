package exercises.performance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		
		System.out.println("Iniciando...");
		Collection<Integer> teste = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		long fim1 = System.currentTimeMillis();
		long tempo1 = fim1 - inicio;
		System.out.println("Tempo gasto inserindo: " + tempo1);
		
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long fim3 = System.currentTimeMillis();
		long tempo3 = fim3 - inicio;
		System.out.println("Tempo gasto buscando: " + tempo3);
		
		long fim2 = System.currentTimeMillis();
		long tempo2 = fim2 - inicio;
		System.out.println("Tempo gasto total: " + tempo2);
		
		System.out.println();
		testaComHashSet();
	}
	
	public static void testaComHashSet() {
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		long fim1 = System.currentTimeMillis();
		long tempo1 = fim1 - inicio;
		System.out.println("Tempo gasto inserindo: " + tempo1);
		
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long fim3 = System.currentTimeMillis();
		long tempo3 = fim3 - inicio;
		System.out.println("Tempo gasto buscando: " + tempo3);
		
		long fim2 = System.currentTimeMillis();
		long tempo2 = fim2 - inicio;
		System.out.println("Tempo gasto total: " + tempo2);
	}
	
}
