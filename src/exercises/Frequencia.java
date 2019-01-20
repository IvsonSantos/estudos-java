package exercises;

/**
 * Vinte estudantes foram solicitados a classificar em uma escala de 1 a 5 a
 * qualidade da comida no refeitório estudantil, com 1 sendo “horrível” e 5
 * sendo “excelente”. Coloque as 20 respostas em um array de inteiros e
 * determine a frequência de cada classificação.
 */
public class Frequencia {

	public static void main(String[] args) {

		int[] respostas = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
		int[] frequencia = new int[6];
		
		// para cada resposta, seleciona elemento de respostas e utiliza esse valor
		// como índice de frequência para determinar elemento a incrementar
		for (int questao = 0; questao < respostas.length; questao++) {
			try {
				++frequencia[respostas[questao]];
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		
		System.out.printf("%s%14s%n", "Resposta", "Frequencia");
		
		// gera saída do valor de cada elemento do array
		for (int rating = 1; rating < frequencia.length; rating++) {
			System.out.printf("%6d%14d%n", rating, frequencia[rating]);
		}
	}
	
	
	
}