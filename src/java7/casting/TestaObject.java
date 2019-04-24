package java7.casting;

public class TestaObject {

	/**
	 * Compila, pois existe a chance de um Object ser um Gerente. Porém não roda,
	 * ele vai lançar uma Exception (ClassCastException) em tempo de execução. É
	 * importante diferenciar tempo de compilação e tempo de execução.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// nós garantimos ao java que nosso Objeto object era um Gerente com o casting,
		// por isso
		// compilou,
		Object obj = new Conta();

		// mas na hora de rodar, quando ele foi receber um Gerente, ele recebeu uma
		// Conta, daí ele reclamou
		// lançando ClassCastException!
		Gerente gerente = (Gerente) obj;
	}
}
