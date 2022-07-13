package br.com.generation.atividade02;

import java.util.Scanner;

public class ex05 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero = 0, soma = 0;
		
		System.out.println("AVISO! - Para encerrar o programa, digite 0");
		do {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();

			if (numero != 0) {
				soma += numero;
			}

		} while (numero > 0);

		System.out.println("A soma dos números é: " + soma);

		entrada.close();

	}

}
