package java7.numeros;

public class FormatoNumero {
	
	int numero1 = 1000000;
	
	int numero2 = 1_000_000;
	
	public static void main(String[] args) {
		
		FormatoNumero f = new FormatoNumero();
		
		System.out.println(f.numero1);
		
		System.out.println(f.numero2);
	}

}
