package br.com.zoologico.classes;

// construindo o objeto animal
public abstract class Animal {

	// atributos ou propriedade do objeto
	// nesse momento as propriedads s�o publicas
	private String nome;
	private String especie;
	private int idade;
	private String corPelo;

	public Animal(String nome, String especie, int idade, String corPelo) {
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.corPelo = corPelo;
	}

	// construtor padr�o java
	// N�O � UTILIZADO
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
	
	public void setcorPelo(String corpelo) {
	    this.corPelo = corPelo;
	}
	
	public String corPelo() {
		return corPelo;
	}
	public  abstract void emitirSom();
	

	public boolean isAdulto() {
		return idade >= 1;
	}
	
	

}
