package java7.paralelo;

public class Programa implements Runnable {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Programa " + id + " valor: " + i);
		}
	}

}
