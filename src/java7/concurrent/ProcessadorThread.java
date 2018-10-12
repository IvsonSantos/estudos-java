package java7.concurrent;

import java.util.concurrent.Semaphore;

/**
 * Sem�forospermitem um n�mero maior de Thread acessando os recursos
 * 
 * Um sem�foro � uma estrutura de dados que controle o acesso de aplica��es aos
 * recursos, baseando-se em um n�mero inteiro, que representa a quantidade de
 * acessos que podem ser feitos. Assim utilizamos sem�foros para controlar a
 * quantidade de acesso a determinado recurso.
 * 
 * @author Santo
 *
 */
public class ProcessadorThread extends Thread {

	private int idThread;
	private Semaphore semaforo;

	/**
	 * Definimos inicialmente um identificador para a nossa Thread e uma refer�ncia
	 * a um sem�foro que ir� controlar o acesso a essas vari�veis.
	 * 
	 * @param id
	 * @param semaphore
	 */
	public ProcessadorThread(int id, Semaphore semaphore) {
		this.idThread = id;
		this.semaforo = semaphore;
	}

	/**
	 * Este m�todo processar() apenas faz a thread dormir por algum tempo, simulando
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
	 * Este m�todo simula o acesso da Thread em uma regi�o n�o cr�tica, ou seja, uma
	 * regi�o ao qual n�o � necess�rio pedir uma trava. Exibimos o atual estado da
	 * Thread, para facilitar o entendimento do progama, e realizamos um
	 * processamento qualquer.
	 */
	private void entrarRegiaoNaoCritica() {
		System.out.println("Thread #" + idThread + " em regi�o n�o cr�tica");
		processar();
	}

	/**
	 * Este outro m�todo ser� utilizado para simular o acesso da Thread em uma
	 * regi�o cr�tica. Ele ser� chamado logo ap�s conseguir a trava do sem�foro.
	 */
	private void entrarRegiaoCritica() {
		System.out.println("Thread #" + idThread + " entrando em regi�o cr�tica");
		processar();
		System.out.println("Thread #" + idThread + " saindo da regi�o cr�tica");
	}

	/**
	 * E finalmente, como nossa classe extende o comportamento de uma Thread, n�s
	 * sobrecarregamos o m�todo run() que ser� chamado quando a Thread iniciar.
	 * Neste m�todo n�s realizamos um processamento n�o cr�tico, depois requisitamos
	 * o acesso ao sem�foro (com o semaforo.acquire()) e em seguida realizamos o
	 * processamento de uma regi�o cr�tica. Por fim, liberamos o recurso do sem�foro
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
	 * Para construir um sem�foro precisamos informar o n�mero m�ximo de Thread que
	 * podem acessar o recurso ao mesmo tempo. No nosso exemplo, apenas duas Thread
	 * poder�o entrar na regi�o cr�tica.
	 * 
	 * O que � realmente importante notar � que nunca temos mais que duas Thread na
	 * regi�o cr�tica.
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