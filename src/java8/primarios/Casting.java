package java8.primarios;

public class Casting {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		byte b1 = 3; 	// compila, d� um desconto		
		//b1 = b1 + 4; 	// n�o compila, conta com int devolve int
		
		byte b2 = 3; 	// compila, d� um desconto		
		b2 += 4; 		// compila tamb�m, compilador gente boa!
		b2 += 400;
		
		
		// primeiro s�o executados pr�-incrementos/decrementos,
//		depois multiplica��o/divis�o/mod, passando para soma/subtra��o, depois os
//		shifts ( <<, >>, >>>) e, por �ltimo, os p�s-incrementos/decrementos.
//		As quest�es da certifica��o n�o entram em mais detalhes que isto.
		System.out.println(b2);
		
		int a = 10;
		a += ++a + a + ++a;
		System.out.println(a); 
		
		int j = 0;
		int i = (j++ * j + j++);
		System.out.println(i);
		System.out.println(j);
		
		int d = 15, b = 20, c = 30;
		d = b = c;
		System.out.println(d);
		
		
		int i1 = 3/2;
    	double i2 = 3/2;
    	double i3 = 3/2.0;
    	long x = 0; double y = 0;
    	double zero = x + y;
    	System.out.println(i1 + i2 + i3 + x + y + zero);
	}

}
