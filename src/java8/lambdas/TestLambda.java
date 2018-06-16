package java8.lambdas;

import java.util.Arrays;

public class TestLambda {

	public static void main(String[] args) {
		
//		Arrays.asList("aa", "bb", "cc")
//			  .forEach(e -> System.out.println(e));
//		
//		// outra forma				
//		Arrays.asList( "a", "b", "d" )
//		      .forEach((String e) -> System.out.println(e));
		
		// usando lambda body
//		Arrays.asList( "a", "b", "d" )
//		      .forEach( e -> {
//		    	  System.out.print( e );
//		    	  System.out.println( e );
//		      } );
		
		// lambdas podem referenciar membros de classe e variaveis locais, fazendo elas finais]
		String separator = ";";
		Arrays.asList("a", "b", "c")
	          .forEach(e -> System.out.println(e + separator));

		// lambdas podem retornar um valor
		Arrays.asList("a","b","c")
		      .sort((e1,e2) -> e1.compareTo(e2));
		// ou
		Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
			int result = e1.compareTo(e2);
			return result;
		} );
	}
}
