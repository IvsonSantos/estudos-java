package java8.consumer;

public class Usuario {

	private String nome;
	private int pontos;
	private boolean moderador;

	public Usuario(String nome) {
		this.nome = nome;
	}

	public Usuario(String nome, int pontos, boolean moderador) {
		this.pontos = pontos;
		this.nome = nome;
		this.moderador = moderador;
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void tornaModerador() {
		this.moderador = true;
	}

	public boolean isModerador() {
		return moderador;
	}

	public String toString() {
		return "Usuario " + nome;
	}
}
