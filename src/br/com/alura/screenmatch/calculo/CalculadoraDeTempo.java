package br.com.alura.screenmatch.calculo;
import br.com.alura.scrennmatch.modelos.Titulo;

public class CalculadoraDeTempo {

private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

     public void inclui(Titulo titulo){
         System.out.println("adicionando duracao em minutos de " + getTempoTotal());
         this.tempoTotal += titulo.getDuracaoEmMinutos();
     }

}
