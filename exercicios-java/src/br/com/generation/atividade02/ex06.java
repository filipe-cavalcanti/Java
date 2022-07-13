package br.com.generation.atividade02;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i = 0, numero = 0, soma = 0, media = 0;

		System.out.println("AVISO! - Para encerrar o programa, digite 0");
		do {
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();

			if (numero % 3 == 0) {
				soma += numero;
				i++;
			}

		} while (numero != 0);

		i--;
		media = soma / i;

		System.out.println("A média dos números múltiplos de 3 é: " + media);

		entrada.close();

	}

}
