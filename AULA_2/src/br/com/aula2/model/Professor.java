package br.com.aula2.model;

public class Professor extends Funcionario{
	
	private String titulo;

	public Professor(String nome, int numMatricula, double salario, String titulo) {
		super(nome, numMatricula, salario);
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Professor [titulo=" + titulo + "]";
	}
	
	

}
