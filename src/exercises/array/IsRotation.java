package exercises.array;

public class IsRotation {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] array2 = { 4, 5, 6, 7, 1, 2, 3 };

		System.out.println(isRotation(array1, array2));
	}

	public static boolean isRotation(int[] array1, int[] array2) {

		if (array1.length != array2.length) {
			return false;
		}

		int first = array1[0];
		boolean retorno = false;

		for (int j = 0; j < array2.length; j++) {
			if (array2[j] == first) {
				int proximo = j + 1;
				for (int i = 1; i < array1.length; i++) {
					if (array1[i] == array2[proximo]) {
						retorno = true;
						proximo++;
						if (proximo == array2.length) {
							proximo = 0;
						}
					} else {
						retorno = false;
						break;
					}
				}
				break;
			}
		}

		return retorno;
	}
}
