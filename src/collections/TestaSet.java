package collections;

import java.util.HashSet;
import java.util.Set;

/**
 * O uso de um Set pode parecer desvantajoso, já que ele não armazena a ordem, e não aceita
elementos repetidos. Não há métodos que trabalham com índices, como o get(int) que as listas
possuem.
 * 
 * A grande vantagem do Set é que existem implementações, como a HashSet , que possui
uma performance incomparável com as List s quando usado para pesquisa (método contains por
exemplo).
 * @author Santo
 *
 */
public class TestaSet {
	
	public static void main(String[] args) {
		
		Set<String> cargos = new HashSet<>();
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Funcionário");
		cargos.add("Diretor"); // repetido! Nao adiciona
		
		// imprime na tela todos os elementos
		System.out.println(cargos);
	}

}
