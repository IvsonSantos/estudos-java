package java7.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *  Iniciando um modelo de servidor de chat, o serviço do computador que funciona como base deve,
	primeiro, abrir uma porta e ficar ouvindo até alguém tentar se conectar
 */
public class Servidor {

	public static void main(String[] args) throws IOException {

		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		Socket cliente = servidor.accept();
		
		// Para que o servidor seja capaz de trabalhar com dois clientes ao mesmo tempo 
		// é necessário criar uma thread logo após executar o método accept
		System.out.println("Nova conexão com o cliente " + 
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
