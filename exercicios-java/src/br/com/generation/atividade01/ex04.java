package br.com.generation.atividade01;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero = 0;

		System.out.println("Digite um número: ");
		numero = entrada.nextInt();

		if (numero % 2 == 0) {
			System.out.println(numero + " é par e a raiz quadrada dele é: " + Math.sqrt(numero));
		} else {
			System.out.println(numero + " é ímpar e ele elevado ao quadrado é: " + Math.pow(numero, 2));
		}

		entrada.close();
	}

}
