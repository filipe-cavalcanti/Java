package br.com.generation.atividade05;

public abstract class Animal {

	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void emitirSom() {
		System.out.println("Está emitindo um som...");

	}

	public void acao() {
		System.out.println("E está fazendo alguma coisa...");
	}

}
