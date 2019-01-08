package java7.compilador;

public class Problema {

	public static void main(String[] args) {		
		Problema p = new Problema();
		p.square(3);
	}
	
	void square(int a) {
		System.out.println(a);
	}
	
	void square(double a) {
		System.out.println(a);
	}
}
