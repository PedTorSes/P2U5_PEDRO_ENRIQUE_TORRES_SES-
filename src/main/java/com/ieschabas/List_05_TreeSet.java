package com.ieschabas;
/**
 * Ejercicio 5 en el cual vamos a crear un TreeSet y vamos a ver cómo se comporta
 * @author Pedro Torres Sesé
 * @version 1.0
 */

import java.util.TreeSet;

public class List_05_TreeSet {
    static void main() {
        //Punto 1:
        //Instanciamos el TreeSet
        TreeSet<String> clasificacionJugadores = new TreeSet<>();

        //Punto 2:
        //Añadimos valores a la lista
        clasificacionJugadores.add("Zoe");
        clasificacionJugadores.add("Ana");
        clasificacionJugadores.add("Carlos");
        clasificacionJugadores.add("David");
        clasificacionJugadores.add("Ana");

        //Punto 3:
        //Imprimimos por pantalla

        System.out.println(clasificacionJugadores.toString());

        //Punto 4:
        // Localizamos e imprimimos primer y último valor de la lista

        System.out.println(clasificacionJugadores.first());
        System.out.println(clasificacionJugadores.last());



    }
}
