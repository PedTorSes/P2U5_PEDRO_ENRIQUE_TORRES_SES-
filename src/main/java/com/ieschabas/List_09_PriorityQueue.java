package com.ieschabas;
/**
 * Ejercicio 09 con un PriorityQueue y que vemos qué podemos realizar con él
 * @author Pedro Torres
 * @version 1.0
 */

import java.util.PriorityQueue;

public class List_09_PriorityQueue {
    static void main() {
        // Punto 1:
        // Creamos el listado
        PriorityQueue<Integer> tiemposDespegue = new PriorityQueue<>();

        //Punto 2:
        //Añadimos valores
        tiemposDespegue.add(80);
        tiemposDespegue.add(10);
        tiemposDespegue.add(45);
        tiemposDespegue.add(120);
        tiemposDespegue.add(5);

        //Punto 3:
        //Mostramos y eliminamos los datos de la lista que hemos creado
        System.out.println("TIEMPO DESPEGUE INICIAL:");
        while (tiemposDespegue.size() > 0) {
            System.out.println(tiemposDespegue.poll());
        }

        /**
         * Como podemos observar, el PriorityQueue establece en los primeros valores aquellos que son de menor número
         * o bien por orden alfabético en el caso de letras.
         */

        System.out.println("TIEMPOS DESPEGUE FINAL:" + tiemposDespegue.toString());

    }
}
