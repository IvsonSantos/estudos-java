package java7.securerandom;

import java.security.SecureRandom;

/**
 * As edições mais recentes deste livro usavam a classe Random do Java para
 * obter valores “aleatórios”. Essa classe produzia valores determinísticos que
 * poderiam ser previstos por programadores mal-intencionados. Objetos
 * SecureRandom produzem números aleatórios não determinísticos que não podem
 * ser previstos. Números aleatórios determinísticos foram a fonte de muitas
 * falhas de segurança de software
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
