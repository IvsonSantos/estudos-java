package java8.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

import java8.consumer.Usuario;

public class ConstrutorReferenceTest {
	
	public static void main(String[] args) {
		
		Function<String, Usuario> u = Usuario::new;
		
		Function<String, Usuario> criadorDeUsuarios = Usuario::new;
		Usuario rodrigo = criadorDeUsuarios.apply("Rodrigo Turini");
		Usuario paulo = criadorDeUsuarios.apply("Paulo Silveira");
		
		// para construtor com 2 argumentos
//		BiFunction<String, Integer, Usuario> criador = Usuario::new;
//		Usuario u1 = criador.apply("Usuario 1", 50);
//		Usuario u2 = criador.apply("Usuario 2", 300);
	}

}
