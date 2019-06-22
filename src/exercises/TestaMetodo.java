package exercises;

public class TestaMetodo {

	void method(int a) {
		double x;
		if (a > 1) {
			x = 6;
		}
		//System.out.println(x); // compile error
		
		// não compila pois 737821237891232 é um valor maior que
		// o int aceita
		//System.out.println(737821237891232);
		System.out.println(737821237891232d);
		
		
		// Um número na base octal tem que começar com um zero à esquerda e
		// pode usar apenas os algarismos de 0 a 7
		
		//Na base octal o algarismo
		//9 não existe, portanto o código a seguir não compila
		//int i = 0769;
		int j = 011;
		
		
		char sete = 7; // número, pois não está entre aspas simples
		System.out.println(sete); // Não imprime nada!!!!
		
		char c = '\u03A9'; // unicode
		System.out.println(c); // imprime a letra grega ômega
	}
}
