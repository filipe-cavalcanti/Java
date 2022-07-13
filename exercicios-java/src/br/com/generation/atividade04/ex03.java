package br.com.generation.atividade04;

public class ex03 {

	public static void main(String[] args) {
		
		ProdutoEletronico celular = new ProdutoEletronico();
		
		celular.setModelo("Iphone");
		celular.setCor("Preto");
		celular.setVersao(13);
		
		System.out.println("Modelo: " + celular.getModelo());
		System.out.println("Cor: " + celular.getCor());
		System.out.println("Versão: " + celular.getVersao() + " Pro Max");
		

	}

}
