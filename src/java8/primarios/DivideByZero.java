package java8.primarios;

public class DivideByZero {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int i = 200;
		int v = 0;
		
		// compila, mas exception
		//System.out.println(i / v);
		
		// compila e roda, infinito positivo
		System.out.println(i / 0.0);
		
		
		double positiveInfinity = 100 / 0.0;
		double negativeInfinity = -100 / 0.0;
		// número não definido (NaN)
		System.out.println(positiveInfinity + negativeInfinity);
		
		
		//System.out.println(3 / 0);		// erro
    	System.out.println(3 / 0.0);	// Inf
    	System.out.println(3.0 / 0);	//
    	System.out.println(-3.0 / 0);	//
	}
}
