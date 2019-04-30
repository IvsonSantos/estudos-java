package java7.casting;

public class Conta {

	protected Integer saldo;

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
	
	public void deposita(Integer saldo) {
		this.saldo += saldo;
	}
	
	
}
