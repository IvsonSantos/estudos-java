package deitel.problemas;

/**
 * Uma pessoa investe US$ 1.000 em uma conta-poupan�a que rende juros de 5% ao ano. Supondo que todo
o juro seja aplicado, calcule e imprima a quantia de dinheiro na conta no fim de cada ano por 10 anos.
Utilize a seguinte f�rmula para determinar as quantidades:
a = p (1 + r)n
onde
p � a quantia original investida (isto �, o principal)
r � a taxa de juros anual (por exemplo, utilize 0,05 para 5%)
n � o n�mero de anos
a � a quantia em dep�sito no fim do n-�simo ano.
 * @author Santo
 *
 */
public class JurosCompostos {

	public static void main(String[] args) {
	
		double amount; // quantia em dep�sito ao fim de cada ano
		double principal = 1000.0; // quantidade inicial antes dos juros
		double rate = 0.05; // taxa de juros
	
		// exibe cabe�alhos
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
	
		// calcula quantidade de dep�sito para cada um dos dez anos
		for (int year = 1; year <= 10; ++year) { 
			// calcula nova quantidade durante ano especificado 
			amount = principal * Math.pow(1.0 + rate, year); 
		
			// exibe o ano e a quantidade
			System.out.printf("%4d%,20.2f%n", year, amount); 
		}
	}
}