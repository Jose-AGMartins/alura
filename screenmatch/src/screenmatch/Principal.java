package screenmatch;

import br.com.alura.screenmatch.modelos.Filme;

public class Principal {

	public static void main(String[] args) {
		Filme filme = new Filme();
		
		filme.nome = "Interestelar";
		filme.anoDeLancamento = 2014;
		filme.duracaoEmMinutos = 169;
		
		
		
		filme.exibeFichaTecnica();
		filme.avalia(8);
		filme.avalia(10);
		filme.avalia(9);
		filme.avalia(8.9);
		
		//System.out.println(filme.somaDasAvaliacao);
		System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());
		System.out.println(filme.pegaMedia() );
		

	}

}
