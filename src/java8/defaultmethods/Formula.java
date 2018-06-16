package java8.defaultmethods;

/**
 * Permite adicionar implementacao de metodos nao abstratos a interfaces
 * utilizando a palavra DEFAULT. Esta � conhecida como 'Extension Methods'
 * 
 * Besides the abstract method calculate the interface Formula also defines the
 * default method sqrt
 */
public interface Formula {
	
	double calculate(int a);

	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}
