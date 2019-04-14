package java8.methodreference;

import java8.consumer.Usuario;

public class ReferenciaDeInstancia {

	public static void main(String[] args) {

		/**
		 * Dada uma referência a um objeto, podemos criar um method reference que
		 * invoque um de seus métodos
		 */
		Usuario ivson = new Usuario("Ivson", 10);
		
		Runnable bloco = ivson::tornaModerador;
		Runnable bloco2 = () -> ivson.tornaModerador();
		
	}
}
