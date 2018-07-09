package java7.thread.naothreadsafe;

import java.util.Collection;

/**
 * Nossa aplicação é multi-thread, então
	diferentes threads vão inserir diferentes mensagens para serem registradas. Não importa a ordem
	que elas sejam guardadas, desde que elas um dia sejam!
 * @author Santo
 *
 */
public class ProduzMensagens implements Runnable {
	
	private int comeco;
	private int fim;
	private Collection<String> mensagens;

	public ProduzMensagens(int comeco, int fim, Collection<String> mensagens) {
		this.comeco = comeco;
		this.fim = fim;
		this.mensagens = mensagens;
	}

	public void run() {
		for (int i = comeco; i < fim; i++) {
			//mensagens.add("Mensagem " + i);
			synchronized (mensagens) {
				mensagens.add("Mensagem " + i);
			}
		}
	}

}
