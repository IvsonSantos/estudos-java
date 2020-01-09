package java7.arrays;

public class CastingArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Não há casting de arrays de tipo primitivo, portanto não adianta tentar:
		int[] values = new int[10];
		// long[] vals = values; // compile error
	}
}
