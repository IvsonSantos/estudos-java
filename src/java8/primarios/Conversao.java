package java8.primarios;

public class Conversao {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		byte b = 1;
		short s = 2;

		// devolve no m�nimo int, compila
		int i = b + s;

		// n�o compila, ele devolve no m�nimo int
		//byte b2 = i + s;

		// compila for�ando o casting, correndo risco de perder
		// informa��o
		byte b2 = (byte) (i + s);
	}
}
