package com.aluracursos.screammatch.modelos;

public class Serie extends Titulo {
    int temporadas;
    int episodiosPorTemporada;
    int MinutosPorEpisodios;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }


    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * MinutosPorEpisodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return MinutosPorEpisodios;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        MinutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public String toString() {
        return "Serie:" + this.getNombre() + " (" + this.getFechaDeLanzamiento()+")";
    }
}
