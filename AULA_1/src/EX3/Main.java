package EX3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) {

		ArrayList alunos = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(
					new FileReader("/home/veterano/alunos.csv"));
			String line;

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				String nome = data[0];
				float n1 = Float.parseFloat(data[1]);
				float n2 = Float.parseFloat(data[2]);
				float nf = (n1 + n2) / 2;

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
					System.out.println("VALORES INSERIDOS INVALIDOS");

				Aluno aluno = new Aluno();
				aluno.setNome(nome);
				aluno.setN1(n1);
				aluno.setN2(n2);
				aluno.setNf(nf);
				alunos.add(aluno);
			}

			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}