package br.com.alura.scrennmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int TotalVizualizacoes;


    public int getTotalVizualizacoes() {
        return TotalVizualizacoes;
    }

    public void setTotalVizualizacoes(int totalVizualizacoes) {
        TotalVizualizacoes = totalVizualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (TotalVizualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }

    }
}
