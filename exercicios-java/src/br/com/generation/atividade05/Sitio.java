package br.com.generation.atividade05;

public class Sitio {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();

		cachorro.setNome("Spike");
		cachorro.setIdade(7);

		cavalo.setNome("Pé de Pano");
		cavalo.setIdade(13);

		preguica.setNome("Flecha");
		preguica.setIdade(25);

		System.out.println(cachorro.getNome() + " tem " + cachorro.getIdade() + " anos");
		cachorro.emitirSom();
		cachorro.acao();

		System.out.println(cavalo.getNome() + " tem " + cavalo.getIdade() + " anos");
		cavalo.emitirSom();
		cavalo.acao();

		System.out.println(preguica.getNome() + " tem " + preguica.getIdade() + " anos");
		preguica.emitirSom(); 
		preguica.acao();

	}

}
