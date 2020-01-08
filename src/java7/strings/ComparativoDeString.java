package java7.strings;

public class ComparativoDeString {

	public static void main(String[] args) {

		Client c1 = new Client("guilherme");
		Client c2 = new Client("mario");
		
		System.out.println(c1.equals(c2)); // false
		
		System.out.println(c1.equals(c1)); // true
		
		Client c3 = new Client("guilherme");
		
		System.out.println(c1.equals(c3));
		// false, pois não é a mesma
		// referência: são objetos diferentes na memória
	}

}

class Client {
	private String name;

	Client(String name) {
		this.name = name;
	}
}