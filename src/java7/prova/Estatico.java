package java7.prova;

public class Estatico {

	static int x = 15;
	
	public static void main(String[] x) {
		//x = 200; DA ERRO
		//Estatico.x = 200; OK AQUI
		System.out.println(x);
	}
	
}
