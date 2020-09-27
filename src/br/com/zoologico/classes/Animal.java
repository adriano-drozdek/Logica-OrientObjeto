package br.com.zoologico.classes;

// construindo o objeto animal
public abstract class Animal {

	// atributos ou propriedade do objeto
	// nesse momento as propriedads são publicas
	private String nome;
	private String especie;
	private int idade;

	public Animal(String nome, String especie, int idade) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
	}

	// construtor padrão java
	// NÃO É UTILIZADO
	public Animal() {
	}

	public Animal(String nome) {
		this.nome = nome;
	}

	// metodos acessores
	// GETTERS e SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void emitirSom() {
		System.out.println("Som do animal ");
	}

	public boolean isAdulto() {
		return idade >= 1;
	}

}
