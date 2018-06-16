package thread;

/**
 * � comum aparecer uma classe an�nima junto com uma thread.
 * @author Santo
 *
 */
public class ClasseAnomina {
		
	public static void main(String[] args) {
		
		/**
		 * Em vez de criar essa classe Programa1 , podemos utilizar o recurso de classe an�nima. Ela nos
		   permite dar new numa interface, desde que implementemos seus m�todos
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
		 * D� para ir mais longe com o Java 8, utilizando o lambda. Como Runnable � uma interface
		   funcional (cont�m apenas um m�todo abstrato), ela pode ser facilmente escrita dessa forma
		 */
		Runnable r2 = () -> {
			for(int i = 0; i < 10; i++)
			System.out.println("programa 2 valor " + i);
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}
	
}
