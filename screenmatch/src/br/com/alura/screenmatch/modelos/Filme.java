package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
	private String diretor;

	public Filme(String nome, int anoDeLancamento) {
		// TODO Auto-generated constructor stub
		super (nome, anoDeLancamento);
	}


	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		// TODO Auto-generated method stub
		return (int)pegaMedia()/2 ;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Filme: " + this.getNome() + " ("+ this.getAnoDeLancamento() + " )";
	}
	

}
