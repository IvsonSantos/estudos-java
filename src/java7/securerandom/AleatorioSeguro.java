package java7.securerandom;

import java.security.SecureRandom;

/**
 * As edi��es mais recentes deste livro usavam a classe Random do Java para
 * obter valores �aleat�rios�. Essa classe produzia valores determin�sticos que
 * poderiam ser previstos por programadores mal-intencionados. Objetos
 * SecureRandom produzem n�meros aleat�rios n�o determin�sticos que n�o podem
 * ser previstos. N�meros aleat�rios determin�sticos foram a fonte de muitas
 * falhas de seguran�a de software
 * 
 * @author Santo
 *
 */
public class AleatorioSeguro {

	public static void main(String[] args) {

		SecureRandom secure = new SecureRandom();
		
		// retorna 0 ou 1
		Integer aleatorio = secure.nextInt(2);
	}

}
