package br.com.alura.principal;
import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.scrennmatch.modelos.Episodio;
import br.com.alura.scrennmatch.modelos.Filme;
import br.com.alura.scrennmatch.modelos.Serie;
import java.util.ArrayList;

public class Principal  {
    public static void main(String[] args) {

        System.out.println("=============PRIMEIRO FILME==================");
        var meuFilme = new Filme("O poderoso chefão",1970,180);
        meuFilme.exibeFichaTecnicaFilme();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(String.format("media das notas do filme :%.2f " , meuFilme.pegaMedia()));
        System.out.println("=============SEGUNDO FILME====================");

        var filmeDoVini = new Filme("Divertidamente",2020,200);
        filmeDoVini.exibeFichaTecnicaFilme();
        filmeDoVini.avalia(9);
        filmeDoVini.avalia(10);
        filmeDoVini.avalia(5);
        System.out.println("Total de avaliações: " + filmeDoVini.getTotalDeAvaliacoes());
        System.out.println(String.format("Media das notas do filme : %.2f" , filmeDoVini.pegaMedia()));
        System.out.println("=============PRIMEIRA SERIE====================");

        var lost = new Serie("lost",2001,93,10,10);
        lost.setMinutosPorEpisodios(50);
        lost.exibirFichaTecnicaSerie();
        System.out.println("Duracao para maratonar lost: " + lost.getDuracaoEmMinutos());
        System.out.println("=============CALCULADORA========================");

        var calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(filmeDoVini);
        calculadora.inclui(lost);
        System.out.println("Tempo total: " + calculadora.getTempoTotal());
        System.out.println("============FILTRO RECOMENDACAO=================");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(filmeDoVini);
        filtro.filtra(lost);
        System.out.println("============EPISODIO=========================");

        var episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(300);
        filtro.filtra(episodio);
        System.out.println("============LISTA DE FILME=====================");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoVini);
        listaDeFilmes.add(meuFilme);
        System.out.println("O tamanho dessa lista é de : " + listaDeFilmes.size());
        System.out.println("O primeiro filme é o : " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);









    }

}
