package java7.thread.exemplo;

public class Test {

	public static void main(String args[]) {
		ExemploThread R1 = new ExemploThread("Thread-1");
		R1.start();

		ExemploThread R2 = new ExemploThread("Thread-2");
		R2.start();
	}

}
