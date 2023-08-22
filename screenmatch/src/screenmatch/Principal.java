package screenmatch;

public class Principal {

	public static void main(String[] args) {
		Filme filme = new Filme();
		
		filme.nome = "Interestelar";
		filme.anoDeLancamento = 2014;
		filme.avaliacao = 4.9;
		filme.duracaoEmMinutos = 169;
		
		
		
		System.out.println(filme.nome);
		System.out.println(filme.anoDeLancamento);

	}

}
