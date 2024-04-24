package com.principal;

import com.aluracursos.screammatch.modelos.Episodio;
import com.aluracursos.screammatch.modelos.FiltroRecomendacion;
import com.aluracursos.screammatch.modelos.Serie;
import com.aluracursos.screammatch.modelos.pelicula;
import com.aluracursoscreammatch.calculos.CalculadoraDeTiempo;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {
        pelicula mipelicula = new pelicula("Encanto",2021);

        mipelicula.setDuracionEnMinutos(120);
        mipelicula.setIncluidoEnElPlan(true);
        mipelicula.muestraFichaTecnica();
        mipelicula.evalua(10);
        mipelicula.evalua(10);
        System.out.println("total de evaluaciones:"+mipelicula.getTotalDeLasEvaluaciones());
        System.out.println(mipelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del dragon",2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodios(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        pelicula otraPelicula = new pelicula("Matrix",1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(mipelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo para ver tus titulos favoritos:"
                +calculadora.getTiempoTotal() + " minutos");
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(mipelicula);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Episodio1");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(30);
        filtroRecomendacion.filtra(episodio);

        var peliculaDeSantiago = new pelicula("Señor de los anillos",2021);
        peliculaDeSantiago.setDuracionEnMinutos(180);



        ArrayList<pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeSantiago);
        listaDePeliculas.add(mipelicula);
        listaDePeliculas.add(otraPelicula);
        System.out.println("Tamaño de la lista:"+listaDePeliculas.size());
        System.out.println("El primer item es:"+listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas);

        System.out.println("ToString de la pelicula: " + listaDePeliculas.get(0).toString());
    }

}
