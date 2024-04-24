package com.aluracursos.screammatch.modelos;

import com.aluracursoscreammatch.calculos.Clasificable;

public class FiltroRecomendacion {
    public void filtra(Clasificable clasificacion){
        if (clasificacion.getClasificacion()>= 4){
            System.out.println("Muy bien Evaluado");
        }else if(clasificacion.getClasificacion()>=2){
            System.out.println("Popular en el momento");

        }else{
            System.out.println("Agregarlo a ver despues puede ser interesante...");
        }
    }
}
