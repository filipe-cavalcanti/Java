package br.com.generation.atividade03;

import java.util.Random;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random gerador = new Random();
		int valores[] = new int[10], soma = 0, media = 0, maiorValor = 0, contagem = 0;

		for (int i = 0; i < valores.length; i++) {
			valores[i] = gerador.nextInt(1, 7);
			System.out.println(i + 1 + "º dado: " + valores[i]);
			soma += valores[i];
			media = soma / valores.length;

			if (valores[i] > maiorValor) {
				maiorValor = valores[i];
			}

		}

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == maiorValor) {
				contagem++;
			}
		}

		System.out.println("Soma dos valores: " + soma);
		System.out.println("Média dos valores: " + media);
		System.out.println("O maior valor foi " + maiorValor);
		System.out.println("O maior valor apareceu " + contagem + " vezes.");
		entrada.close();
	}

}
