package java7.thread.multithreadsincronizado;

public class PrintDemo {

	public void printCount() {
		
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Contador = " + i);
			}
		} catch (Exception e) {
			System.out.println("Thread interrompida"); 
		}
	}
}
