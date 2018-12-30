package java7.construtores;

/**
 * Se voce declarar um construtor para uma classe, o compilador nao ira criar um construtor
 * padrao para ela
 *
 */
public class TestaConstrutor {
	
	public TestaConstrutor(String oi) {
		System.out.println(oi);
	}
	
	public static void main(String[] args) {
		
		// ERRO DE COMPILACAO
		TestaConstrutor t = new TestaConstrutor("oi");
	}

}