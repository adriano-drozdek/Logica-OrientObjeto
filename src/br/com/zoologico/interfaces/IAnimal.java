package br.com.zoologico.interfaces;

public interface IAnimal {
	
	// Tudo que for declarado na interface � publico
	// por esse motivo n�o possui a visibilidade.
	
	boolean isAdulto();
	void emitirSom();
	void morrer();
}
