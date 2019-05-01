package java7.thread.basico;

public class MeuPrograma {
	
	public static void main(String[] args) {
		
		GeraPDF pdf = new GeraPDF();
		Thread t1 = new Thread(pdf);
		t1.start();
		
		BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
		Thread threadDaBarra = new Thread(barraDeProgresso);
		threadDaBarra.start();
	}

}
