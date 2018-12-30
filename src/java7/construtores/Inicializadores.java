package java7.construtores;

public class Inicializadores {

	private String name = "Fluffy";
	
	{
		System.out.println("Excuta eses bloco para instanciar campos");
	}

	public Inicializadores() {
		name = "Tiny";
		System.out.println("Construtor");
	}

	public static void main(String[] args) {
		Inicializadores chick = new Inicializadores();
		System.out.println(chick.name);
	}
	
	{
		System.out.println("Esse aqui tb");
	}
}
