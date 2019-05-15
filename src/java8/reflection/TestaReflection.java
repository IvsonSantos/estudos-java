package java8.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class TestaReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		// tudo que precisamos fazer é chamar o método getParameters para
		// obter como resposta um array do tipo java.lang.reflect.Parameter
		Constructor<Usuario> constructor = Usuario.class.getConstructor(String.class, int.class);
		
		Parameter[] parameters = constructor.getParameters();
		
		Arrays.asList(parameters)
		.forEach(param -> System.out.println(param.getName()));

	}
}
