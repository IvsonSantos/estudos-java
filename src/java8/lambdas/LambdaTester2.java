package java8.lambdas;

public class LambdaTester2 {

	final static String salutation = "Hello! ";

	public static void main(String[] args) {

		GreetingService greetService1 = message -> System.out.println(salutation + message);
		greetService1.sayMessage("Mahesh");

	}

	interface GreetingService {
		void sayMessage(String message);
	}
}
