package br.com.generation.atividade01;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n1 = 0, n2 = 0, n3 = 0;

		System.out.println("Insira o 1º número: ");
		n1 = entrada.nextInt();

		System.out.println("Insira o 2º número: ");
		n2 = entrada.nextInt();

		System.out.println("Insira o 3º número: ");
		n3 = entrada.nextInt();

		if (n1 < n2) {
			if (n2 < n3) {
				System.out.println("A ordem dos números são: " + n1 + ", " + n2 + ", " + n3);
			} else if (n1 < n3) {
				System.out.println("A ordem dos números são: " + n1 + ", " + n3 + ", " + n2);
			} else {
				System.out.println("A ordem dos números são: " + n3 + ", " + n1 + ", " + n2);
			}
		} else if (n2 < n3) {
			if (n1 < n3) {
				System.out.println("A ordem dos números são: " + n2 + ", " + n1 + ", " + n3);
			} else {
				System.out.println("A ordem dos números são: " + n2 + ", " + n3 + ", " + n1);
			}
		} else {
			System.out.println("A ordem dos números são: " + n3 + ", " + n2 + ", " + n1);
		}

		entrada.close();
	}

}
