package br.com.alura.screenmatch.modelos;

//import br.com.alura.screenmatch.calculo.Classificavel; implements Classificavel

public class Titulo  {
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacao;
	private int totalDeAvaliacoes;
	private String resumo;
	private int duracaoEmMinutos;
	
	public Titulo (String nome, int anoDeLancamento) {
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}
	

	public int getTotalDeAvaliacoes () {
		return totalDeAvaliacoes;
	}
	
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}
	public String getNome() {
		return nome;
	}
	public String getResumo() {
		return resumo;
	}
	
	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setAnoDeLancamento (int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public void setDuracaoEmMinutos (int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
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

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}
}
