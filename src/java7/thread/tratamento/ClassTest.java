package java7.thread.tratamento;

public class ClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		final ClassWithThreadingProblem c = new ClassWithThreadingProblem();
		
		Runnable run = new Runnable() {
			public void run() {
				c.getNetxId();
			}
		};
		
		for (int  i = 0; i < 12000; ++i) {
			int startId = c.nextId;
			int expected = 2 + startId;
			
			Thread t1 = new Thread(run);
			Thread t2 = new Thread(run);
			
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			
			int ending = c.nextId;
			
			if (ending != expected) {
				return;
			}
			
			System.out.println("Erro.");
			
		}
	}
	
}
