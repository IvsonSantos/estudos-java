package java8.primarios;

public class Igualdade {

	public static void main(String[] args) {
		
		// true.
		System.out.println(1 == 1.0);
		
		// true.
		System.out.println(1 == 1);
		
		// true. 1.0 float é 1.0 double
		System.out.println(1.0f == 1.0d);
		
		// true. 1.0 float é 1 long
		System.out.println(1.0f == 1l);
		
		// não compila, tipo não primitivo só aceita != e ==
		//System.out.println("Mario" > "Guilherme");
		
		// não compila, boolean só aceita != e ==
		//System.out.println(true < false);
		
		//Não podemos comparar tipos incomparáveis, como um boolean com
		//um valor numérico. Mas podemos comparar chars com numéricos.
		// não compila, boolean é boolean
		//System.out.println(true == 1);
		
		// compila, 'a' tem valor numérico também
		System.out.println('a' > 1);
		
		int a = 5;
		System.out.println(a = 5); // não imprime true, imprime 5
	}
}
