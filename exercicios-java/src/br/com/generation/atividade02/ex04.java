package br.com.generation.atividade02;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int pessoas = 0, idade = 0, sexo = 0, temperamento = 0, pessoasCalmas = 0, mulheresNervosas = 0,
				homensAgressivos = 0, outrosCalmos = 0, nervosas40 = 0, calmas18 = 0;

		while (pessoas <= 150) {

			System.out.println("Idade: ");
			idade = entrada.nextInt();
			System.out.println("Sexo: 1-Feminino, 2-Masculino, 3-Outros");
			sexo = entrada.nextInt();
			System.out.println("Temperamento: 1-Calmo(a), 2-Nervoso(a), 3-Agressivo(a)");
			temperamento = entrada.nextInt();

			if (temperamento == 1) {
				pessoasCalmas++;
			}
			if (sexo == 1 && temperamento == 2) {
				mulheresNervosas++;
			}
			if (sexo == 2 && temperamento == 3) {
				homensAgressivos++;
			}
			if (sexo == 3 && temperamento == 1) {
				outrosCalmos++;
			}
			if (temperamento == 2 && idade > 40) {
				nervosas40++;
			}
			if (temperamento == 1 && idade < 18) {
				calmas18++;
			}

			pessoas++;

		}

		System.out.println("O número de pessoas calmas são: " + pessoasCalmas);
		System.out.println("O número de mulheres nervosas são: " + mulheresNervosas);
		System.out.println("O número de homens agressivos são: " + homensAgressivos);
		System.out.println("O número de outros calmos são: " + outrosCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos são: " + nervosas40);
		System.out.println("O número de pessoas calmas com menos de 18 anos são: " + calmas18);
		entrada.close();

	}

}
