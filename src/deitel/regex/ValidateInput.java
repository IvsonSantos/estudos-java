package deitel.regex;

public class ValidateInput {
	
	// \d qualquer d�gito 
	// \D qualquer caractere que n�o seja um d�gito
	// \w qualquer caractere de palavra 
	// \W qualquer caractere que n�o seja uma palavra
	// \s qualquer caractere de espa�o em branco 
	// \S qualquer caractere que n�o seja um espa�o em branco

	// valida nome
	public static boolean validateFirstName(String firstName) {
		return firstName.matches("[A-Z][a-zA-Z]*");	// Jane
	}

	// valida sobrenome
	public static boolean validateLastName(String lastName) {
		return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*"); // Doe
	}

	// valida endere�o
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
		// O n�mero de telefone combina com tr�s d�gitos (o primeiro n�o pode ser zero) seguidos por um tra�o seguido por mais tr�s d�gitos 
		//(novamente o primeiro n�o pode ser zero) seguido por mais quatro d�gitos.
	}
}
