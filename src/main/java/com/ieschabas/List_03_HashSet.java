package com.ieschabas;
/**
 * Clase 3 HashSet donde instanciamos un HashSet, introducimos errores y vemos cómo se comporta
 * @author Pedro Torres Sesé
 * @version 1.0
 */

import java.util.HashSet;

public class List_03_HashSet {
    static void main() {
        //Punto 1:
        //Instanciamos el HashSet
        HashSet<String> erroresUnicos = new HashSet<>();

        //Punto 2:
        //Añadimos errores
        erroresUnicos.add("NullPointer");
        erroresUnicos.add("DB_Timeout");
        erroresUnicos.add("API_Error");
        erroresUnicos.add("NullPointer");
        erroresUnicos.add("DB_Timeout");

        //Punto 3:
        //Mostramos el conjunto
        System.out.println("Lista completa de errores: " +erroresUnicos.toString());

        //Punto 4:
        //Mostramos la existencia de "API_Error"
        System.out.println(erroresUnicos.contains("API_Error"));

    }
}
