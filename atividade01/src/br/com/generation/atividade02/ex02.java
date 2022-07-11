package br.com.generation.atividade02;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero, par = 0, impar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número");
			numero = entrada.nextInt();

			if (numero % 2 == 0) {
				par++;
			}
			if (numero % 2 == 1) {
				impar++;
			}
		}

		System.out.println("Foram digitados " + par + " números pares e " + impar + " números ímpares");
		entrada.close();

	}

}
