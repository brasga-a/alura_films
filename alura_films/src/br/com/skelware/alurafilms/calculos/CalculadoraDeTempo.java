package br.com.skelware.alurafilms.calculos;

import br.com.skelware.alurafilms.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        System.out.println("debug");
        return this.tempoTotal;
    }
    /*
    public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s){
        tempoTotal += s.getDuracaoEmMinutos();
    }
    */

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
