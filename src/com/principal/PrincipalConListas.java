package com.principal;

import com.aluracursos.screammatch.modelos.Serie;
import com.aluracursos.screammatch.modelos.Titulo;
import com.aluracursos.screammatch.modelos.pelicula;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        pelicula mipelicula = new pelicula("Encanto",2021);
        mipelicula.evalua(9);
        pelicula otraPelicula = new pelicula("Matrix",1998);
        otraPelicula.evalua(8);
        var peliculaDeSantiago = new pelicula("Señor de los anillos",2021);
        peliculaDeSantiago.evalua(6);
        Serie casaDragon = new Serie("La casa del dragon",2022);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(mipelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeSantiago);
        lista.add(casaDragon);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof pelicula pelicula && pelicula.getClasificacion()>3){

                System.out.println(pelicula.getClasificacion());
            }
        }
        ArrayList<String> ListaDeArtistas= new ArrayList<>();
        ListaDeArtistas.add("Penelope Cruz");
        ListaDeArtistas.add("Antonio Banderas");
        ListaDeArtistas.add("Ricardo Darin");

        Collections.sort(ListaDeArtistas);
        System.out.println("Lista de Artistas ordenadas"+lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha" + lista);
    }
}
