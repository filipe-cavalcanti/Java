package br.com.generation.atividade03;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double nota[] = new double[5], maiorNota = 0;

		System.out.println("Notas do 1º semestre");
		for (int i = 0; i < nota.length; i++) {
			System.out.print(i + 1 + "º nota: ");
			nota[i] = entrada.nextDouble();

			if (nota[i] > maiorNota) {
				maiorNota = nota[i];
			}
		}
		System.out.println("A maior nota do aluno foi " + maiorNota);
		entrada.close();
	}

}
