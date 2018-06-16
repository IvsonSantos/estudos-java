package thread;

/**
 * É comum aparecer uma classe anônima junto com uma thread.
 * @author Santo
 *
 */
public class ClasseAnomina {
		
	public static void main(String[] args) {
		
		/**
		 * Em vez de criar essa classe Programa1 , podemos utilizar o recurso de classe anônima. Ela nos
		   permite dar new numa interface, desde que implementemos seus métodos
		 */	
//		Runnable r = new Runnable() {
//			public void run() {
//				for(int i = 0; i < 10; i++)
//					System.out.println("programa 1 valor " + i);
//				}
//		};
//
//		
//		Thread t = new Thread(r);	
//		t.start();		
		
		/**
		 * Dá para ir mais longe com o Java 8, utilizando o lambda. Como Runnable é uma interface
		   funcional (contém apenas um método abstrato), ela pode ser facilmente escrita dessa forma
		 */
		Runnable r2 = () -> {
			for(int i = 0; i < 10; i++)
			System.out.println("programa 2 valor " + i);
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}
	
}
