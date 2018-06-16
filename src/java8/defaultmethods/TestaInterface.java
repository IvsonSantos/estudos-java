package java8.defaultmethods;

/**
 * Concrete classes only have to implement the abstract method calculate. The
 * default method sqrt can be used out of the box.
 *
 */
public class TestaInterface {

	public static void main(String[] args) {

		// The formula is implemented as an anonymous object
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
		};

		System.out.println(formula.calculate(100));
		System.out.println(formula.sqrt(16));
	}
}
