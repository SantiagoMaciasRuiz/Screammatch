package com.aluracursoscreammatch.calculos;

import com.aluracursos.screammatch.modelos.Titulo;
import com.aluracursos.screammatch.modelos.pelicula;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo título){
        this.tiempoTotal += título.getDuracionEnMinutos();

    }

}
