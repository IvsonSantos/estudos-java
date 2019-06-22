package exercises;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Interest {

	public static void main(String args[]) {
		// quantidade principal inicial antes dos juros ÿ
		BigDecimal principal = BigDecimal.valueOf(10600.0);
		BigDecimal rate = BigDecimal.valueOf(0.00543); // taxa de juros

		// exibe cabeçalhos
		System.out.printf("%s%20s%n", "Year", "Amount on deposit");

		// calcula quantidade de depósito para cada um dos dez anos
		for (int year = 1; year <= 12; year++) {
			
			// calcula nova quantidade durante ano especificado
			BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(year));

			// exibe o ano e a quantidade
			System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
		}
	}
}
