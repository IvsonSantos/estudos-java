package java8.primarios;

public class Igualdade {

	public static void main(String[] args) {
		
		// true.
		System.out.println(1 == 1.0);
		
		// true.
		System.out.println(1 == 1);
		
		// true. 1.0 float � 1.0 double
		System.out.println(1.0f == 1.0d);
		
		// true. 1.0 float � 1 long
		System.out.println(1.0f == 1l);
		
		// n�o compila, tipo n�o primitivo s� aceita != e ==
		//System.out.println("Mario" > "Guilherme");
		
		// n�o compila, boolean s� aceita != e ==
		//System.out.println(true < false);
		
		//N�o podemos comparar tipos incompar�veis, como um boolean com
		//um valor num�rico. Mas podemos comparar chars com num�ricos.
		// n�o compila, boolean � boolean
		//System.out.println(true == 1);
		
		// compila, 'a' tem valor num�rico tamb�m
		System.out.println('a' > 1);
		
		int a = 5;
		System.out.println(a = 5); // n�o imprime true, imprime 5
	}
}
