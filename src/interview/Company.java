package interview;

import java.util.List;

public class Company {

	private void addManager(Person person, Person manager) {

		if (manager instanceof Person) {
			person.setManager(manager);
		}

		if (manager instanceof Manager) {
			if (person.getManager() == null) {
				person.setManager(manager);
			}
		}

	}

	public static void main(String[] args) {

		Manager m = new Manager();

		Person p1 = new Person();
		p1.setNome("Joao");
		Person p2 = new Person();
		p2.setNome("Paulo");
		Person p3 = new Person();
		p3.setNome("Tiago");

		m.addSubordinate(p1);
		m.addSubordinate(p2);
		m.addSubordinate(p3);

		Manager m2 = new Manager();
		m2.setNome("Gerente de Paulo");
		p1.setManager(m2);

		imprimeListaPessoas(m);
	}

	public static void imprimeListaPessoas(Manager m) {

		List<Person> lista = m.getPersons();

		for (Person person : lista) {
			System.out.println(person.getNome());
			if (person.getManager() != null) {
				System.out.println("   -  " + person.getManager().getNome());
				imprimeListaPessoas((Manager) person.getManager());
			}
		}

	}

}
