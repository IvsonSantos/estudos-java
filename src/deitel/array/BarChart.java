package deitel.array;

public class BarChart {

	public static void main(String[] args) {
		
		int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
		
		System.out.println("Grade distribution:");
		
		for (int i = 0; i < array.length; i++) {
			
			if (i == 10) {
				System.out.printf("%5d ", 100);
			} else {
				System.out.printf("%02d-%02d ", i * 10, i *10 + 9);
			}
			
			//imprime a barra de asteriscos
			for (int s = 0; s < array[i]; s++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
/*

19 System.out.printf("%02d-%02d: ",
20 counter * 10, counter * 10 + 9);
21
22 ï// imprime a barra de asteriscos ÿ
23 ïfor (int stars = 0; stars < array[counter]; stars++)ÿ
24 ï System.out.print("*"); ÿ
25
26 System.out.println();
27 }
28 }
*/