package br.com.zoologico.principal;

import br.com.zoologico.classes.Animal;

public class Main {

	public static void main(String[] args) {
		// criando uma nova instancia do objeto
		Animal a1 = new Animal(); 
		
		a1.nome = "Jojo todinho";
		a1.especie = "Gato";
		a1.idade = 1;
		
		// Criando uma nova instancia do objeto
		Animal a2 = new Animal();
		
		// atribuindo os valores as propriedades
		a2.nome = "Spike";
		a2.especie = "Cachorro";
		a2.idade = 3;
	}
	
}
