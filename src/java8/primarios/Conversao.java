package java8.primarios;

public class Conversao {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		byte b = 1;
		short s = 2;

		// devolve no mínimo int, compila
		int i = b + s;

		// não compila, ele devolve no mínimo int
		//byte b2 = i + s;

		// compila forçando o casting, correndo risco de perder
		// informação
		byte b2 = (byte) (i + s);
	}
}
