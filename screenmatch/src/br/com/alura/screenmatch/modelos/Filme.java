package br.com.alura.screenmatch.modelos;

public class Filme {
	public String nome;
	int anoDeLancamento;
	boolean incluidoNoPlano;
	private double somaDasAvaliacao;
	private int totalDeAvaliacoes;
	String resumo;
	int duracaoEmMinutos;
	
	public int getTotalDeAvaliacoes () {
		return totalDeAvaliacoes;
	}
	
	public void exibeFichaTecnica () {
		System.out.println("Nome do filme: "+nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);
	}
	
	public void avalia(double nota) {
		somaDasAvaliacao += nota;
		totalDeAvaliacoes ++;
	}
	
	public double pegaMedia() {
		return somaDasAvaliacao / totalDeAvaliacoes;
	}

}
