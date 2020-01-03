package java7.variaveis;

public class Iniciar {

	@SuppressWarnings("unused")
	public int notValid() {
		int y = 10;
		int x;
		int reply = 0;
		//int reply;  // DOES NOT COMPILE
		//int reply = x + y; // DOES NOT COMPILE
		return reply;
	}

}
