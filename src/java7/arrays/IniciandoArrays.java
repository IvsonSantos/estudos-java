package java7.arrays;

public class IniciandoArrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 5, 7, 5 }; // ok
		
		int[] numbers2;
		// numbers2={1,2,5,7,5}; // compile error, tem que inicializar na mesma linha		
		
		int[] numbers3;
		numbers3 = new int[]{1,2,5,7,5}; // ok porque usou o NEW
	}
}
