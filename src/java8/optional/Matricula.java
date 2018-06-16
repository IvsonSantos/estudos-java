package java8.optional;

import java.util.Optional;

public class Matricula {

	private String nome;
	
	// classe que pode ou n�o conter um valor n�o nulo
	private Optional<Curso> curso = Optional.empty();

	public String getNome() {
		return nome;
	}

	public Matricula(String nome, Optional<Curso> curso) {
		super();
		this.nome = nome;
		this.curso = curso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Optional<Curso> getCurso() {
		return curso;
	}

	public void setCurso(Optional<Curso> curso) {
		this.curso = curso;
	}
}
