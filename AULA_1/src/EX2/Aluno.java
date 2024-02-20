package EX2;

public class Aluno {
	String nome;
	float n1, n2, nf;

	public Aluno(String nome, float n1, float n2, float nf) {
	super();
	this.nome = nome;
	this.n1 = n1;
	this.n2 = n2;
	this.nf = nf;
	}

	public Aluno() {
	super();
	}

	public String getNome() {
	return nome;
	}

	public void setNome(String nome) {
	this.nome = nome;
	}

	public float getN1() {
	return n1;
	}

	public void setN1(float n1) {
	this.n1 = n1;
	}

	public float getN2() {
	return n2;
	}

	public void setN2(float n2) {
	this.n2 = n2;
	}

	public float getNf() {
	return nf;
	}

	public void setNf(float nf) {
	this.nf = nf;
	}



	}

