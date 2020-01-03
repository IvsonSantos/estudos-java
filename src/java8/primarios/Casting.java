package java8.primarios;

public class Casting {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		byte b1 = 3; 	// compila, dá um desconto		
		//b1 = b1 + 4; 	// não compila, conta com int devolve int
		
		byte b2 = 3; 	// compila, dá um desconto		
		b2 += 4; 		// compila também, compilador gente boa!
		b2 += 400;
		
		System.out.println(b2);
	}

}
