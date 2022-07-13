package br.com.generation.atividade04;

public class ex01 {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();

		cliente.setNome("Ronaldo");
		cliente.setDataNascimento("01/01/1991");
		cliente.setEndereco("R. Fenômeno, 9 - São Paulo - SP, 09999-999");

		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Data de nascimento: " + cliente.getDataNascimento());
		System.out.println("Endereço: " + cliente.getEndereco());
	}

}
