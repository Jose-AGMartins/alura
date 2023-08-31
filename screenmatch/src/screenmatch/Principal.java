package screenmatch;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

	public static void main(String[] args) {
		Filme filme = new Filme();
		
		filme.setNome ("Interestelar");
		filme.setAnoDeLancamento(2014);
		filme.setDuracaoEmMinutos (169);
		
		
		
		filme.exibeFichaTecnica();
		filme.avalia(8);
		filme.avalia(10);
		filme.avalia(9);
		filme.avalia(8.9);
		
		//System.out.println(filme.somaDasAvaliacao);
		System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
		System.out.println(filme.pegaMedia() );
		
		Serie lost = new Serie();
		lost.setNome("Lost");
		lost.setAnoDeLancamento(2000);
		
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutosPorEpisodio(50);
		lost.exibeFichaTecnica();
		
		System.out.println("Tempo para maratonar " + lost.getNome() + ": " + lost.getDuracaoEmMinutos() + " minutos.");
		

	}

}
