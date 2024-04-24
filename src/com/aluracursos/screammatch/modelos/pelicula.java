package com.aluracursos.screammatch.modelos;

import com.aluracursoscreammatch.calculos.Clasificable;

public class pelicula extends Titulo implements Clasificable {
    private String director;

    public pelicula(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public int getClasificacion() {
        return (int) calculaMedia()/2;
    }

    @Override
    public String toString() {
        return "pelicula: " + this.getNombre() + " (" + getFechaDeLanzamiento() + ")";
    }
}
