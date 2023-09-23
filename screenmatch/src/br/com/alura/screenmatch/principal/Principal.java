package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.Episodio;

import java.util.ArrayList;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

	public static void main(String[] args) {
		Filme filme = new Filme("Interestelar", 2014);
		filme.setDuracaoEmMinutos (169);
		
		
		
		filme.exibeFichaTecnica();
		filme.avalia(8);
		filme.avalia(10);
		filme.avalia(9);
		filme.avalia(8.9);
		filme.avalia(3);
		filme.avalia(2);
		filme.avalia(2);
		
		//System.out.println(filme.somaDasAvaliacao);
		System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
		System.out.println(filme.pegaMedia() );
		
		Serie lost = new Serie("Lost", 2000);
		
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutosPorEpisodio(50);
		lost.exibeFichaTecnica();
		
		System.out.println("Tempo para maratonar " + lost.getNome() + ": " + lost.getDuracaoEmMinutos() + " minutos.");
		
		Filme filmeDois = new Filme("Homem Aranha", 2002);
		filmeDois.setDuracaoEmMinutos(140);
		
		Filme filmeTres = new Filme("Homem Aranha 2", 2004);
		filmeTres.setDuracaoEmMinutos(155);
		
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(filme);
		calculadora.inclui(filmeDois);
		calculadora.inclui(lost);
		calculadora.inclui(filmeTres);
		System.out.println(calculadora.getTempoTotal());
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(filme);
		
		Episodio episodio = new Episodio ();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalDeVisualizacoes(300);
		
		filtro.filtra (episodio);
		
		ArrayList<Filme>listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add(filmeTres);
		listaDeFilmes.add(filmeDois);
		listaDeFilmes.add(filme);
		
		System.out.println("Tamanho da lista " + listaDeFilmes.size());
		System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
		System.out.println(listaDeFilmes);
		
		
	
	}

}
