package deitel;

/**
 * Classe Account com uma variável de instância balance do tipo double e um
 * construtor e método deposit que executa a validação.
 */
public class Account {

	private String name;
	private double balance;

	public Account(String name, double balance) {
		this.name = name; // atribui name à variável de instância name

		// valida que o balance é maior que 0.0; se não for,
		// a variável de instância balance mantém seu valor inicial padrão de 0.0
		if (balance > 0.0) 
			this.balance = balance; 
	}

	public void deposit(double depositAmount) {
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
