package memory;

public class Main {

	public static void main(String[] args) {
		
		Runtime run = Runtime.getRuntime();
		
		long availableBytes = run.freeMemory();
		System.out.println("Available memory: " + availableBytes / 1024 + "k");
		
		// lets create a ton of garbage
		for (int i = 0; i < 1000000; i++) {
			Customer c;
			c = new Customer("oi");
		}
		
		availableBytes = run.freeMemory();
		System.out.println("Available memory: " + availableBytes / 1024 + "k");
		
		System.gc();
		
		availableBytes = run.freeMemory();
		System.out.println("Available memory: " + availableBytes / 1024 + "k");
	}
}
