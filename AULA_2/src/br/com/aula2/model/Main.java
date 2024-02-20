package br.com.aula2.model;

public class Main {
	
	public static void main(String[] args) {
		
		//INSTANCIANDO PESSOA
		Pessoa pessoa = new Pessoa("Giovana");
		System.out.println(pessoa.getNome());
		System.out.println("----------------");
		
		Pessoa pessoa2 = new Pessoa("Cardi");
		System.out.println(pessoa2.getNome());
		System.out.println("----------------");
		
		System.out.println(pessoa.getNome().equals(pessoa2.getNome()));
		
		System.out.println(pessoa.getNome().hashCode());
		System.out.println(pessoa2.getNome().hashCode());
		
		
		
		//INSTANCIANDO FUNCIONARIO
		Funcionario funcionario = new Funcionario ("Secretaria", 123, 1000.00);
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getNumMatricula());
		System.out.println(funcionario.getSalario());
		System.out.println("---------------------");
		
		
		
		//INSTANCIANDO PROFESSOR 
		Professor professor = new Professor("Secretaria", 123, 1000.00, "Doutor");
		System.out.println(professor.getNome());
		System.out.println(professor.getNumMatricula());
		System.out.println(professor.getSalario());
		System.out.println(professor.getTitulo());
		System.out.println("---------------------");
		
		
		//INSTANCIANDO ALUNO 
		Aluno aluno = new Aluno("Fernanda", "N77", 18);
		System.out.println(aluno.getNome());
		System.out.println(aluno.getRa());
		System.out.println(aluno.getNumDisciplina());
		
	}

}
