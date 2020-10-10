package br.com.zoologico.heranca;

import br.com.zoologico.classes.Animal;

public class Gato extends Animal {

	public Gato(String nome, String especie, int idade, String corPelo) {
		super(nome, especie, idade, corPelo);
	}

	public Gato(String nome) {
		super(nome);
	}

	@Override
	public void emitirSom() {
		if (estaVivo) {
			System.out.println("Miando");
		} else {
			System.out.println("O animal morreu");
		}
	}

	public boolean isAdulto() {
		if (estaVivo) {
			return idade >= 2;
		} else {
			return false;
		}

	}
	public void morrer() {
		this.estaVivo = false;
	}

}
