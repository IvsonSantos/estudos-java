package java7.strings;

public class StringLib {

	public void stringDentro() {
		String teste = "aa";
		String t = "aabbcc";
		
		if (t.contains(teste)) {
			System.out.println("contem");
		} else {
			System.out.println("nao contem aa");
		}
	}
	
	public void tirarEspacoBranco() {		
		String a = " outro ";
		String b = a.replace(" ", "");
		System.out.println(b);
	}
	
	public void isNull() {		
		String a = "";
		if (a.isEmpty()) {
			System.out.println("vazia");
		} else {
			System.out.println("cheia");			
		}
	}
	
	public void contaCaracteres() {		
		String a = "ivson";
		System.out.println(a.length());
	}
	
	public void imprimeCaracteres() {		
		String a = "ivson";
		for (int i = 0; i < a.length(); i++ ) {
			System.out.print(a.charAt(i) + "-");			
		}
	}
	
	public void imprimeReverso() {		
		StringBuilder b = new StringBuilder("anotaram a data da maratona");
		System.out.println(b.reverse());
	}
	
	public void ordemInvertida() {
		
		String palavra = "Socorram-me subi no onibus em Marrocos";
		
		String[] palavras = palavra.split(" ");
		for (int i = palavras.length-1; i >= 0; i--) {
			System.out.print(palavras[i] + " ");
		}
	}
	
	

}
