package java7.thread;

public class TestaThread {

	public static void main(String[] args) {
		
		GeraNumero g = new GeraNumero();
		Thread teste = new Thread(g);
		teste.start();
	}

}