package com.principal;

import com.aluracursos.screammatch.excepcion.ErrorEnCoversionDeDuracionException;
import com.aluracursos.screammatch.modelos.Titulo;
import com.aluracursos.screammatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();;
        while (true){
            System.out.println("Escriba el nombre de la pelicula");
            var busqueda = lectura.nextLine();

            if (busqueda.equalsIgnoreCase("salir")){
                break;
            }
            String direccion = "https://www.omdbapi.com/?t=" +
                    busqueda.replace(" ","+")+
                    "&apikey=4eb1f9e2";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(response.body());

                TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(miTituloOmdb);

                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("mi titulo ya convertido " + miTitulo );

                titulos.add(miTitulo);



            } catch (NumberFormatException e) {
                System.out.println("Ocurrio un error");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("Error en la URI, verifique la direccion.");

            }catch (ErrorEnCoversionDeDuracionException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);
        FileWriter escritura = new FileWriter("Titulo.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();
        System.out.println("Finalizo La ejecucion del programa!");
    }
}
