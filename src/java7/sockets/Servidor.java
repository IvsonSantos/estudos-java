package java7.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *  Iniciando um modelo de servidor de chat, o servi�o do computador que funciona como base deve,
	primeiro, abrir uma porta e ficar ouvindo at� algu�m tentar se conectar
 */
public class Servidor {

	public static void main(String[] args) throws IOException {

		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		Socket cliente = servidor.accept();
		
		// Para que o servidor seja capaz de trabalhar com dois clientes ao mesmo tempo 
		// � necess�rio criar uma thread logo ap�s executar o m�todo accept
		System.out.println("Nova conex�o com o cliente " + 
							cliente.getInetAddress().getHostAddress());

		Scanner s = new Scanner(cliente.getInputStream());
		while (s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		
		s.close();
		servidor.close();
		cliente.close();
	}
}
