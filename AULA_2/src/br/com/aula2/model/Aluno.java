package br.com.aula2.model;

public class Aluno extends Pessoa {
	
	private String ra;
	private int numDisciplina;
	
	public Aluno(String nome, String ra, int numDisciplina) {
		super(nome);
		this.ra = ra;
		this.numDisciplina = numDisciplina;
	}

	public Aluno(String nome) {
		super(nome);
	}

	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", numDisciplina=" + numDisciplina + "]";
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public int getNumDisciplina() {
		return numDisciplina;
	}

	public void setNumDisciplina(int numDisciplina) {
		this.numDisciplina = numDisciplina;
	}
	
	
	
	

}
