package deitel.regex;

public class ValidateInput {
	
	// \d qualquer dígito 
	// \D qualquer caractere que não seja um dígito
	// \w qualquer caractere de palavra 
	// \W qualquer caractere que não seja uma palavra
	// \s qualquer caractere de espaço em branco 
	// \S qualquer caractere que não seja um espaço em branco

	// valida nome
	public static boolean validateFirstName(String firstName) {
		return firstName.matches("[A-Z][a-zA-Z]*");	// Jane
	}

	// valida sobrenome
	public static boolean validateLastName(String lastName) {
		return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*"); // Doe
	}

	// valida endereço
	public static boolean validateAddress(String address) {
		return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)"); // 123 Some Street
	}

	// valida cidade
	public static boolean validateCity(String city) {
		return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)"); // Some City
	}

	// valida estado
	public static boolean validateState(String state) {
		return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");	// SS
	}

	// valida CEP
	public static boolean validateZip(String zip) {
		return zip.matches("\\d{5}");	// 12345
	}

	// valida telefone
	public static boolean validatePhone(String phone) {
		return phone.matches("[1-9]\\d{3}-[1-9]\\d{3}-\\d{4}"); // 123-456-7890
		// O número de telefone combina com três dígitos (o primeiro não pode ser zero) seguidos por um traço seguido por mais três dígitos 
		//(novamente o primeiro não pode ser zero) seguido por mais quatro dígitos.
	}
}
