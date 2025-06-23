package br.com.alura.principal;

import br.com.alura.scrennmatch.modelos.Filme;
import br.com.alura.scrennmatch.modelos.Serie;
import br.com.alura.scrennmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {


    public static void main(String[] args) {
        var meuFilme = new Filme("O poderoso chefão", 1970, 180);
        meuFilme.avalia(9);
        var filmeDoVini = new Filme("Divertidamente", 2020, 200);
        meuFilme.avalia(9);
        var lost = new Serie("lost", 2000, 500, 10, 10);
        meuFilme.avalia(10);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoVini);
        lista.add(meuFilme);
        lista.add(lost);

        lista.forEach(item -> {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificacao do filme : " + filme.getClassificacao());
            }
        });


        ArrayList<String> buscarPorArtista = new ArrayList<>();
        System.out.println("Nome dos artistas em ordem alfabetica:");
        buscarPorArtista.add("Adam sandler");
        buscarPorArtista.add("Vinicius de miranda");
        buscarPorArtista.add("Giulia mato serpa");
        Collections.sort(buscarPorArtista);
        System.out.println(buscarPorArtista);
        System.out.println("Lista de nome de filmes e series em ordem alfabetica:");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("Lista de filmes e series em ordem pelo ano de lancamento:");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);


    }
}
