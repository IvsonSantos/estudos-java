package deitel.problemas;

import java.util.Scanner;

/**
 * Escreva um aplicativo que solicita ao usuário que insira o tamanho do lado de um quadrado e, 
 * então, exibe um
   quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar com quadrados de 
   todos os comprimentos de lado possíveis entre 1 e 20.
 * @author Santo
 *
 */
public class Quadrado {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//System.out.println("Informe o lado do quadrado:");
		//int lados = input.nextInt();
		int lados = 3;
		
		if (lados > 20 || lados < 1) {
			System.out.println("O tamanho deve ser entre 1 e 20");
		}
		
		if (lados == 1) {
			System.out.println("*");
 		} else {
		
			for (int i = 0; i < lados; i++) {
				if (i < lados) {
					System.out.print("*");
				} else {
					System.out.println("*");					
				}
			}
 		}
		
		input.close();
	}

}
