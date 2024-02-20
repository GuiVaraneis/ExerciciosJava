package EX4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String args[]) {

		ArrayList alunos = new ArrayList<>();
		Random random = new Random();

		try {
			FileWriter writer = new FileWriter("/home/veterano/alunos2.csv");

			for (int i = 0; i < 10; i++) { // Gerar 10 alunos com notas aleatórias
				String nome = "Aluno" + (i + 1);
				float n1 = random.nextFloat() * 10; // Gera uma nota entre 0 e 10
				float n2 = random.nextFloat() * 10;
				float nf = (n1 + n2) / 2;

				writer.write(nome + "," + n1 + "," + n2 + "\n");

				System.out.println(nome);
				System.out.println("SUA NOTA FINAL É: " + nf);

				if (nf >= 8)
					System.out.println("CONCEITO A");
				else if (nf >= 6 && nf < 8)
					System.out.println("CONCEITO B");
				else if (nf >= 4 && nf < 6)
					System.out.println("CONCEITO C");
				else if (nf >= 2 && nf < 4)
					System.out.println("CONCEITO D");
				else if (nf >= 0 && nf < 2)
					System.out.println("CONCEITO E");
				else
					System.out.println("VALORES INSERIDOS INVÁLIDOS");

				Aluno aluno = new Aluno();
				aluno.setNome(nome);
				aluno.setN1(n1);
				aluno.setN2(n2);
				aluno.setNf(nf);
				alunos.add(aluno);
			}

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
