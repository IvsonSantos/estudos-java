package interview;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Person {

	private List<Person> persons = new ArrayList<>();

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public void addSubordinate(Person p) {
		persons.add(p);
	}

	public void removeSubordinate(Person p) {
		persons.remove(p);
	}

	public void changePosition(Integer i, Person p) {

		int ind = 0;
		int origin = 0;

		Person atual = persons.get(i);

		for (Person person : persons) {
			if (person.equals(p)) {
				origin = ind;
			}
			ind++;
		}

		persons.set(i, p);
		persons.set(origin, atual);
	}

}
