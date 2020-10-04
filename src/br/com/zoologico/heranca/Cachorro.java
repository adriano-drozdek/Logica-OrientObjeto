package br.com.zoologico.heranca;

import br.com.zoologico.classes.Animal;

public class Cachorro extends Animal {

	public Cachorro(String nome, String especie, int idade, String corPelo) {
		super(nome, especie, idade, corPelo);
	}

	public Cachorro(String nome) {
		super(nome);
	}

	@Override
	public void emitirSom() {
		System.out.println("Latindo.");

	}

}
