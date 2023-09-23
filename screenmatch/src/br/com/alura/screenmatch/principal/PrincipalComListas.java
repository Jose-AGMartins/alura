package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {

	public static void main(String[] args) {
		
		Filme filme = new Filme("Interestelar", 2014);
		filme.avalia(10);
		Filme filmeDois = new Filme("Homem Aranha", 2002);
		filmeDois.avalia(7);
		Filme filmeTres = new Filme("Homem Aranha 2", 2004);
		filmeTres.avalia(8);
		Serie lost = new Serie("Lost", 2000);
		lost.avalia(5);
		
		ArrayList<Titulo>lista = new ArrayList<>();
		lista.add(filmeTres);
		lista.add(filmeDois);
		lista.add(filme);
		lista.add(lost);
		
		for (Titulo item: lista) {
			System.out.println(item.getNome());
			if (item instanceof Filme filme1 && filme1.getClassificacao() >2) {
				System.out.println("Clasificação "+ filme1.getClassificacao());
			}	
			
		}
				
	}

}
