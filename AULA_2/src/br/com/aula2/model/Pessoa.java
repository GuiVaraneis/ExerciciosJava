package br.com.aula2.model;

public class Pessoa {
	String nome;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
	
	

}
