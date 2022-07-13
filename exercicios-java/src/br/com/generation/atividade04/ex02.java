package br.com.generation.atividade04;

public class ex02 {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		
		aviao.setModelo("Boeing 747");
		aviao.setCor("Branco com faixas pretas na lateral");
		aviao.setCapacidade(410);
		
		System.out.println("Modelo: " + aviao.getModelo());
		System.out.println("Cor: " + aviao.getCor());
		System.out.println("Capacidade: " + aviao.getCapacidade() + " pessoas");
	}

}
