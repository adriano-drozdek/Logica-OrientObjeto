package br.com.zoologico.principal;

import br.com.zoologico.classes.Animal;

public class Main {

	public static void main(String[] args) {
		
		// criando uma nova instancia do objeto
		Animal a1 = new Animal("Jojo todinho", "Gato", 1);

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
		Animal a2 = new Animal("Spike", "Cachorro", 3);

		System.out.println("Ol�, o nome do meu animal � " + a2.getNome());
		System.out.println("Especie " + a2.getEspecie());

		a2.emitirSom();
		if (a2.isAdulto()) {
			System.out.println("� adulto ");
		} else {
			System.out.println("N�o � adulto ");
		}
		System.out.println("----------------------");
		
		Animal a3 = new Animal("Fred");

		System.out.println("Ol�, o nome do meu animal � " + a3.getNome());

	}

}
