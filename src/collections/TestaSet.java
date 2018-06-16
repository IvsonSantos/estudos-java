package collections;

import java.util.HashSet;
import java.util.Set;

/**
 * O uso de um Set pode parecer desvantajoso, j� que ele n�o armazena a ordem, e n�o aceita
elementos repetidos. N�o h� m�todos que trabalham com �ndices, como o get(int) que as listas
possuem.
 * 
 * A grande vantagem do Set � que existem implementa��es, como a HashSet , que possui
uma performance incompar�vel com as List s quando usado para pesquisa (m�todo contains por
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
		cargos.add("Secret�ria");
		cargos.add("Funcion�rio");
		cargos.add("Diretor"); // repetido! Nao adiciona
		
		// imprime na tela todos os elementos
		System.out.println(cargos);
	}

}
