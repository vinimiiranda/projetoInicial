package br.com.alura.scrennmatch.modelos;
import br.com.alura.screenmatch.calculo.Classificavel;
public class Serie extends Titulo implements Classificavel {

     private int temporadas;
     private boolean ativa;
     private int episodiosPortemporada;
     private int minutosPorEpisodios;

    public Serie(String nome, int anoDeLancamento, int DuracaoEmMinutos, int temporadas,int episodiosPortemporada) {
        super(nome, anoDeLancamento, DuracaoEmMinutos);
    }

    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public boolean Ativa() {
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public int getEpisodiosPortemporada() {
        return episodiosPortemporada;
    }
    public void setEpisodiosPortemporada(int episodiosPortemporada) {
        this.episodiosPortemporada = episodiosPortemporada;
    }
    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }
    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPortemporada * minutosPorEpisodios;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }

    @Override
    public String toString() {
        return "Serie : " + this.getNome() + "(" + this.getAnoDeLancamento() + ")" + "(" + this.getDuracaoEmMinutos() + ")"
                +"("+ this.getTemporadas() + ")" + "(" + this.getEpisodiosPortemporada() + ")";
    }
}
