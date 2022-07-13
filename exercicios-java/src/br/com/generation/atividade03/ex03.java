package br.com.generation.atividade03;

import java.util.Random;

public class ex03 {

	public static void main(String[] args) {

		Random gerador = new Random();

		int n1[][] = new int[4][6];
		int n2[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];

		System.out.println("Matriz N1");
		for (int l = 0; l < n1.length; l++) {
			for (int c = 0; c < n1[l].length; c++) {
				n1[l][c] = gerador.nextInt(1, 10);
				System.out.print(n1[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println("Matriz N2");
		for (int l = 0; l < n2.length; l++) {
			for (int c = 0; c < n2[l].length; c++) {
				n2[l][c] = gerador.nextInt(1, 10);
				System.out.print(n2[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println("Matriz M1");
		for (int l = 0; l < m1.length; l++) {
			for (int c = 0; c < m1[l].length; c++) {
				m1[l][c] = n1[l][c] + n2[l][c];
				System.out.print(m1[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println("Matriz M2");
		for (int l = 0; l < m2.length; l++) {
			for (int c = 0; c < m2[l].length; c++) {
				m2[l][c] = n1[l][c] - n2[l][c];
				System.out.print(m2[l][c] + " | ");
			}
			System.out.println();
		}

	}

}
