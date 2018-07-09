package deitel;

/**
 * Classe Account com uma vari�vel de inst�ncia balance do tipo double e um
 * construtor e m�todo deposit que executa a valida��o.
 */
public class Account {

	private String name;
	private double balance;

	public Account(String name, double balance) {
		this.name = name; // atribui name � vari�vel de inst�ncia name

		// valida que o balance � maior que 0.0; se n�o for,
		// a vari�vel de inst�ncia balance mant�m seu valor inicial padr�o de 0.0
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
