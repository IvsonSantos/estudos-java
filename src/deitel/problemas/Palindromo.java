package deitel.problemas;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o numero a ser lido");
		int num = input.nextInt();
		
		boolean a = verificaPalindromo(num);
		System.out.println(a);
		
		input.close();
	}
	
	public static boolean verificaPalindromo(int num) {		
		return num == Integer.reverse(num);
	}
}
