package java8.primarios;

import java.util.ArrayList;
import java.util.List;

public class Atribuicao {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		
		// copia o valor da referência, o objeto é o mesmo
		List<String> names2 = names;
		
		names2.add("Guilherme");
		
		// true
		System.out.println(names.size() == names2.size());
		
		int age = 15;
		
		int age2 = age; // copia o valor
		
		age2 = 20;
		
		System.out.println(age == age2); // false

	}
}
