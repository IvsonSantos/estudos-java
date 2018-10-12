package java7.concurrent;

import java.util.concurrent.Semaphore;

/**
 * Semáforospermitem um número maior de Thread acessando os recursos
 * 
 * Um semáforo é uma estrutura de dados que controle o acesso de aplicações aos
 * recursos, baseando-se em um número inteiro, que representa a quantidade de
 * acessos que podem ser feitos. Assim utilizamos semáforos para controlar a
 * quantidade de acesso a determinado recurso.
 * 
 * @author Santo
 *
 */
public class ProcessadorThread extends Thread {

	private int idThread;
	private Semaphore semaforo;

	/**
	 * Definimos inicialmente um identificador para a nossa Thread e uma referência
	 * a um semáforo que irá controlar o acesso a essas variáveis.
	 * 
	 * @param id
	 * @param semaphore
	 */
	public ProcessadorThread(int id, Semaphore semaphore) {
		this.idThread = id;
		this.semaforo = semaphore;
	}

	/**
	 * Este método processar() apenas faz a thread dormir por algum tempo, simulando
	 * o efeito de um processamento longo.
	 */
	private void processar() {
		try {
			System.out.println("Thread #" + idThread + " processando");
			Thread.sleep((long) (Math.random() * 10000));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Este método simula o acesso da Thread em uma região não crítica, ou seja, uma
	 * região ao qual não é necessário pedir uma trava. Exibimos o atual estado da
	 * Thread, para facilitar o entendimento do progama, e realizamos um
	 * processamento qualquer.
	 */
	private void entrarRegiaoNaoCritica() {
		System.out.println("Thread #" + idThread + " em região não crítica");
		processar();
	}

	/**
	 * Este outro método será utilizado para simular o acesso da Thread em uma
	 * região crítica. Ele será chamado logo após conseguir a trava do semáforo.
	 */
	private void entrarRegiaoCritica() {
		System.out.println("Thread #" + idThread + " entrando em região crítica");
		processar();
		System.out.println("Thread #" + idThread + " saindo da região crítica");
	}

	/**
	 * E finalmente, como nossa classe extende o comportamento de uma Thread, nós
	 * sobrecarregamos o método run() que será chamado quando a Thread iniciar.
	 * Neste método nós realizamos um processamento não crítico, depois requisitamos
	 * o acesso ao semáforo (com o semaforo.acquire()) e em seguida realizamos o
	 * processamento de uma região crítica. Por fim, liberamos o recurso do semáforo
	 * (com o semaforo.release()).
	 */
	public void run() {
		entrarRegiaoNaoCritica();
		try {
			semaforo.acquire();
			entrarRegiaoCritica();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}

	/**
	 * Para construir um semáforo precisamos informar o número máximo de Thread que
	 * podem acessar o recurso ao mesmo tempo. No nosso exemplo, apenas duas Thread
	 * poderão entrar na região crítica.
	 * 
	 * O que é realmente importante notar é que nunca temos mais que duas Thread na
	 * região crítica.
	 */
	public static void main(String[] args) {
		int numeroDePermicoes = 2;
		int numeroDeProcessos = 6;
		Semaphore semaphore = new Semaphore(numeroDePermicoes);
		ProcessadorThread[] processos = new ProcessadorThread[numeroDeProcessos];
		for (int i = 0; i < numeroDeProcessos; i++) {
			processos[i] = new ProcessadorThread(i, semaphore);
			processos[i].start();
		}
	}

}