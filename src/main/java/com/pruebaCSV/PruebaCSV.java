package com.pruebaCSV;

/*
    Ejemplo muy sencillo de acceso a un archivo .csv desde JAva
*/

public class PruebaCSV
{
    /*
     * @author Delia Díaz
     * */

    public static void main(String[] args) {

        LectorCSV miLector = new LectorCSV();
        miLector.leerCSV("./src/main/resources/datos/pokemon.csv");

    }
}