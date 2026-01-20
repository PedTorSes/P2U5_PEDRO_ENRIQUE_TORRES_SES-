package com.ieschabas;
/**
 * Clase LinkedList donde instanciamos un LinkedList, añadimos valores e imprimimos en consola
 * @author Pedro Torres Sesé
 * @version 1.0
 */

import java.util.LinkedList;

public class List_02_LinkedList {
    static void main() {
        //Punto 1:
        //Instanciamos LinkedList
        LinkedList<String> historialComandos = new LinkedList<>();

        //Punto 2:
        //Añadimos valores al final de la lista
        historialComandos.addLast("ls - l");
        historialComandos.addLast("cd/home");

        //Punto 3:
        //Añadimos valores al inicio de la lista:
        historialComandos.addFirst("shutdown -r");

        //Punto 5:
        //Mostramos la lista antes de la eliminación:
        System.out.println("Historial inicial:");
        for (String historial : historialComandos) {
            System.out.println(historial);
        }

        //Punto 4:
        //Buscamos y eliminamos el primer elemento insertado.
        historialComandos.pollFirst();

        //Punto 5:
        //Imprimimos el historial antes y después de la extracción.
        System.out.println("Historial final: ");
        for (String historial : historialComandos) {
            System.out.println(historial);
        }


    }
}

