package java7.scope;

public class Escopo {

	// campo acess�vel para todos os m�todos dessa classe
	private static int x = 1;

	public static void main(String[] args) {

		// vari�vel local x do m�todo sombreia o campo
		int x = 5;

		System.out.printf("local X em MAIN � %d%n", x);

		useLocalVariable(); // useLocalVariable tem uma vari�vel local x
		useField(); // useField utiliza o campo x da classe Scope
		useLocalVariable(); // useLocalVariable reinicializa a vari�vel local x
		useField(); // campo x da classe Scope ret�m seu valor

		System.out.printf("local X em MAIN � %d%n", x);
	}

	// cria e inicializa a vari�vel local x durante cada chamada
	public static void useLocalVariable() {
		int x = 25; // inicializada toda vez que useLocalVariable � chamado
		System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);
		++x; // modifica a vari�vel local x desse m�todo�
		System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
	}

	// modifica o campo x da classe Scope durante cada chamada 38 public
	static void useField()  { 
		   System.out.printf( "%nfield x on entering method useField is %d%n", x); 
		   x *= 10; // modifica o campo x da classe Scope 
		   System.out.printf( "field x before exiting method useField is %d%n", x);  
	}

}
