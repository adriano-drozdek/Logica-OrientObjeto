package br.com.zoologico.heranca;

import br.com.zoologico.classes.Animal;

public class Gato extends Animal {

	public Gato(String nome, String especie, int idade, String corPelo) {
		super(nome, especie, idade, corPelo);
	}

	public Gato(String nome) {
		super(nome);
	}

}
