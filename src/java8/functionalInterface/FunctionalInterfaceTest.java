package java8.functionalInterface;

/**
 * Uma vez que a interface tenha sido anotada como interface funcional, ela deve ter apenas um metodo
 * os outros metodos podem ser DEFAULT e STATIC
 * @author Santo
 *
 */
@FunctionalInterface
public interface FunctionalInterfaceTest {

	void method();
	
	default void m() {
		
	}
}
