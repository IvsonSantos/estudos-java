package java7.exception;

public class ExcecaoPersonalizada {

	public static void main(String[] args) {
		
		int saca = 100;
		int saldo = 50;
		
		if (saldo < saca) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
	}
}
