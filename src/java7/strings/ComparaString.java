package java7.strings;

public class ComparaString {

	public static void main(String[] args) {

		String x = new String("fj11");
		String y = new String("fj11");

		if (x == y) {
			System.out.println("referência para o mesmo objeto");
		} else {
			System.out.println("referências para objetos diferentes!");
		}

		if (x.equals(y)) {
			System.out.println("consideramos iguais no critério de igualdade");
		} else {
			System.out.println("consideramos diferentes no critério de igualdade");
		}

	}

}
