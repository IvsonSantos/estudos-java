package java8.consumer;

import java.util.function.Consumer;

public class ConsumidorTest {

	public static void main(String[] args) {
		
		Usuario ivson = new Usuario("Ivson", 10, false);
		
		Consumer<Usuario> consumer = Usuario::tornaModerador;
		consumer.accept(ivson);
	}
}
