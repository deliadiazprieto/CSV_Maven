package com.pruebaCSV;
/*
* Esta clase se encarga de leer el archivo .csv que se le pase como parámetro
* No devuelve nada, sino que muestra el contenido del csv por el terminal
* */

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LectorCSV {


    public void leerCSV(String nombreArchivo)
    {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String[] fila;
            /*Lo que hace el readNext es que cada vez que termina de leer una fila, salta a la siguiente*/
            while((fila = csvReader.readNext()) != null)
            {
                System.out.println(fila[0] + " | " + fila[1] + " | " + fila[2] + " | ");
                /*
                * Va a imprimir el campo 0,1,2 de todos los pokemons que hay en el csv
                * */

            }

            csvReader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

