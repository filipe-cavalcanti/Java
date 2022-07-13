package br.com.generation.atividade01;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n1 = 0, n2 = 0, n3 = 0;

		System.out.println("Insira o 1º número: ");
		n1 = entrada.nextInt();

		System.out.println("Insira o 2º número: ");
		n2 = entrada.nextInt();

		System.out.println("Insira o 3º número: ");
		n3 = entrada.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior número é: " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior número é: " + n2);
		} else {
			System.out.println("O maior número é: " + n3);
		}

		entrada.close();
	}

}
