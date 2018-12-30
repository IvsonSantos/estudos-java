package java7.construtores;

/**
 * A ordem dos inicializadores importa
 */
public class InicializadoresComProblema {
	
	{
		System.out.println(name);
	}
	
	private String name = "Fluffy";


	public InicializadoresComProblema() {
		name = "Tiny";
		System.out.println("Construtor");
	}

	public static void main(String[] args) {
		InicializadoresComProblema chick = new InicializadoresComProblema();
		System.out.println(chick.name);
	}
	
	{
		System.out.println("Esse aqui tb");
	}
}
