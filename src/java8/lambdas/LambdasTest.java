package java8.lambdas;

public class LambdasTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Thread " + Thread.currentThread().getName());
				}
				
			}
		};
		
		Runnable runnaleLambda = () -> {
			for (int i = 0; i < 3; i++) {
				System.out.println("Thread " + Thread.currentThread().getName());
			}
			
		};
		
		Thread t = new Thread(runnaleLambda);
		t.start();
		t.join();
	}

}
