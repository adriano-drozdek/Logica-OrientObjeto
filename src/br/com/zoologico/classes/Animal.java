package br.com.zoologico.classes;


    // construindo o objeto animal
public class Animal {
	
	// atributos ou propriedade do objeto
	// nesse momento as propriedads são publicas
  private String nome;
  public String especie;
  public  int idade;
  // metodos acessores 
  // GETTERS e  SETTERS
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
