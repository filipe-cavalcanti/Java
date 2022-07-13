package br.com.generation.atividade02;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int idade = 0, idade21 = 0, idade50 = 0;

		System.out.println("AVISO! - Para encerrar o programa, digite -99");
		while (idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();

			if (idade > 0 && idade < 21) {
				idade21++;
			}
			if (idade > 50) {
				idade50++;
			}
		}

		System.out.println(idade21 + " pessoas com menos de 21 anos");
		System.out.println(idade50 + " pessoas com mais de 50 anos");
		entrada.close();

	}

}
