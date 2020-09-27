package br.com.zoologico.principal;

import br.com.zoologico.classes.Animal;

public class Main {

	public static void main(String[] args) {
		// criando uma nova instancia do objeto
		Animal a1 = new Animal(); 
		
		a1.setNome("Jojo todinho");
		a1.setEspecie("Gato");
		a1.setIdade(1) ;
		
		// Criando uma nova instancia do objeto
		Animal a2 = new Animal();
		
		// atribuindo os valores as propriedades
		a2.setNome("Spike");
		a2.especie = "Cachorro";
		a2.idade = 3;
		
		System.out.println("Olá, o nome do meu animal é " + a1.getNome());
		System.out.println("Especie " + a1.getEspecie());
	}
	
}
