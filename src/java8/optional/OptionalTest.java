package java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {

		Curso c1 = new Curso("compiladores");
		Curso c2 = new Curso("administracao");
		
		// Para evitar NullPointerException podemos utilizar o m�todo ofNullable
		Matricula m1 = new Matricula("Joao", Optional.ofNullable(c1));
		Matricula m2 = new Matricula("Maria", Optional.ofNullable(c2));
		
		

		List<Matricula> matriculas = new ArrayList<>();
		matriculas.add(m1);
		matriculas.add(m2);

		// A simples aus�ncia de algum desses valores pode resultar no t�o frequente
		// NullPointerException
		for (Matricula matricula : matriculas) {
			System.out.println(matricula.getNome());
		}
		
		


		// O m�todo ifPresent recebe um Consumer que pode ser traduzido em uma express�o lambda c -> System.out.println(c.getNome())
		for (Matricula matricula : matriculas) {
			matricula.getCurso().ifPresent(c -> System.out.println(c.getNome()));			
		}
		
		// podemos sim fazer o for da maneira nova! Utilizando o j� conhecido forEach:
		matriculas.forEach(m -> {
			m.getCurso().ifPresent(c -> System.out.println(c.getNome()));
		});		
		
		
	}
}
