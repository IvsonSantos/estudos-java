package java7.strings;

public class CriacaoString {

	public static void main(String[] args) {

		// tente descobrir quantos objetos String são criados:
		
		String h = new String("hello "); 	// Cria 2 objetos, um literal (que vai para o pool) e o outro [2]
		String h1 = "hello ";				// nenhum objeto criado, usa o mesmo do pool [2]
		String w = "world";					// novo objeto criado e inserido no pool [3]

		System.out.println("hello ");		// nenhum objeto criado, usa do pool [3]
		System.out.println(h1 + "world");   // criado um novo objeto resultante da concatenação, mas este não vai para o pool [4]
		System.out.println("Hello " == h1); // Novo objeto criado e colocado no pool (Hello com H maiúsculo). [5]
		
	}
}
