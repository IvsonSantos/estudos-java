package java8.functionalInterface.exemplo;

public class ValidatorTest {

	public static void main(String[] args) {
		
		/*
		 * Pelo metodo antigo
		 */
		Validator<String> validadorCPF = new Validator<String>() {
			@Override
			public boolean valida(String t) {
				return t.matches("[0-9]{5}-[0-9]{3}");
			}
		};
		
		if (validadorCPF.valida("55555-000")) {
			System.out.println("CEP ok");
		}
		System.out.println("Fim");
		
		
		
		/*
		 * Pelo java 8
		 */
		Validator<String> validadorCPF8 = v -> v.matches("[0-9]{5}-[0-9]{3}");
		System.out.println(validadorCPF.valida("55555-000"));
	}
}
