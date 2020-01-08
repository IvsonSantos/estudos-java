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

		// neste caso o JVM entende que � o mesmo objeto na HEAP, pois strings sao
		// imutaveis
		String one = "hello";
		String two = "hello";
		if (one == two) {
			System.out.println("referência para o mesmo objeto");
		} else {
			System.out.println("referências para objetos diferentes!");
		}

		String a = new Integer(76).toString();
		String b = "76";
		if (a == b) {
			System.out.println("referência para o mesmo objeto");
		} else {
			System.out.println("referências para objetos diferentes!");
		}

		String c = new Integer(76).toString().intern();
		String d = "76";
		if (c == d) {
			System.out.println("referência para o mesmo objeto");
		} else {
			System.out.println("referências para objetos diferentes!");
		}

	}

}
