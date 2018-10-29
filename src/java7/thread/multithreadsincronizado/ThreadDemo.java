package java7.thread.multithreadsincronizado;

public class ThreadDemo extends Thread {

	private Thread thread;
	private String nome;
	PrintDemo printDemo;

	ThreadDemo(String nome, PrintDemo printDemo) {
		this.nome = nome;
		this.printDemo = printDemo;
	}

	public void run() {

		synchronized (printDemo) {
			printDemo.printCount();
		}

		System.out.println("Thread " + nome + " saindo");
	}
	
	public void start() {
		System.out.println("Iniciando " + nome);
		if (thread == null) {
			thread = new Thread(this, nome);
			thread.start();
		}
	}

}
