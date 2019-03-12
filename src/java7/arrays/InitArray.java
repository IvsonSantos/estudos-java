package java7.arrays;

public class InitArray {

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("Erro, entre com os 3 numeros");
		} else {
			int arrayLength = Integer.parseInt(args[0]);
			int array[] = new int[arrayLength];

			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);

			for (int i = 0; i < array.length; i++) {
				array[i] = initialValue + increment * i;
			}

			System.out.printf("%s%8s%n", "Index", "Value");

			// exibe o valor e o índice de array
			for (int counter = 0; counter < array.length; counter++)
				System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}

}