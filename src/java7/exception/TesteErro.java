package java7.exception;

public class TesteErro {

	public static void main(String[] args) {
		System.out.println("inicio");
		try {
			metodo1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("erro: " + e);
		}
		System.out.println("fim");
	}

	static void metodo1() {
		System.out.println("inicio m1");

		metodo2();

		System.out.println("fim m1");
	}

	static void metodo2() {
		System.out.println("inicio m2");
		int[] array = new int[10];
		for (int i = 0; i <= 15; i++) {

			array[i] = i;
			System.out.println(i);

		}
		System.out.println("fim m2");
	}

}
