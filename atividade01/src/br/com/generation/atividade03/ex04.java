package br.com.generation.atividade03;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int matriz[][] = new int[3][3], somaTotal = 0, somaDiagonal = 0;

		System.out.println("Digite os valores da matriz: ");
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = entrada.nextInt();
				somaTotal += matriz[l][c];
			}
		}
		somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.println("A soma total da matriz é " + somaTotal);
		System.out.println("A soma da diagonal principal da matriz é " + somaDiagonal);
		entrada.close();
	}

}
