package java8.functionalInterface;

public class IFTest {

	/**
	 * Você pode até mesmo acessar a variável local que não é final
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 5;

		new Thread(() -> {
			System.out.println(num);
		}).start();

		/*
		 * Porém, ela deve ser efetivamente final. Isso é, apesar de não precisar
		 * declarar as variáveis locais como final, você não pode alterá-las se estiver
		 * utilizando-as dentro do lambda. O seguinte código não compila:
		 */
		
		// num = 10;
	}

}
