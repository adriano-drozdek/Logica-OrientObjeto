package br.com.zoologico.interfaces;

public interface IAnimal {
	
	// Tudo que for declarado na interface é publico
	// por esse motivo não possui a visibilidade.
	
	boolean isAdulto();
	void emitirSom();
	void morrer();
}
