package br.com.zoologico.principal;

import br.com.zoologico.classes.Animal;
import br.com.zoologico.heranca.Cachorro;
import br.com.zoologico.heranca.Gato;

public class Main {

	public static void main(String[] args) {

		// criando uma nova instancia do objeto
		Gato a1 = new Gato("Jojo todinho", "Gato", 1, "Branco");

		System.out.println("Ol�, o nome do meu animal � " + a1.getNome());
		System.out.println("Especie " + a1.getEspecie());

		a1.emitirSom();
		if (a1.isAdulto()) {
			System.out.println("� adulto ");
		} else {
			System.out.println("N�o � adulto ");
		}
		System.out.println("----------------------");

		// Criando uma nova instancia do objeto
		Cachorro a2 = new Cachorro("Spike", "Cachorro", 3, "Branco");

		System.out.println("Ol�, o nome do meu animal � " + a2.getNome());
		System.out.println("Especie " + a2.getEspecie());

		a2.emitirSom();
		if (a2.isAdulto()) {
			System.out.println("� adulto ");
		} else {
			System.out.println("N�o � adulto ");
		}
		System.out.println("----------------------");

		Cachorro a3 = new Cachorro("Fred");

		System.out.println("Ol�, o nome do meu animal � " + a3.getNome());

	}

}
