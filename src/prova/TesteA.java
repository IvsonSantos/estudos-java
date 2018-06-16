package prova;

/**
	Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes regras:
	- O terceiro número de C é o segundo número de A;
	- O quarto número de C é o segundo número de B;
	Assim sucessivamente…
	- Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante dos 
		números do inteiro maior. 
	- Caso C seja maior que 1.000.000, retornar -1
*/
public class TesteA {

	public static void main(String[] args) {

		String A = "10256";
		String B = "512";
		StringBuilder C = new StringBuilder(); //15012256
		int Aindex = 0;
		int Bindex = 0;
		int total = A.length() + B.length();
		
		for (int i = 0; i < total; i++) {
			
			if (i % 2 == 0) {				
				if (Aindex < A.length()) {
					C.append(A.charAt(Aindex++));	
				} else {
					C.append(B.charAt(Bindex++));
				}		
			} else {
				if (Bindex < B.length()) {
					C.append(B.charAt(Bindex++));	
				} else {
					C.append(A.charAt(Aindex++));
				}	
			}
		}		
		
		String ultimo = C.toString();
		if (Integer.parseInt(ultimo) > 1000000) {
			System.out.println("-1");
		} else {		
			System.out.println(C);
		}
	}

}