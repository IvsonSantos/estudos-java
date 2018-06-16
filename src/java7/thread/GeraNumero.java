package java7.thread;

public class GeraNumero implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println(i);

			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
