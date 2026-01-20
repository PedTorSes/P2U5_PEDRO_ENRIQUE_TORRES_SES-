package com.ieschabas;
/**
 * Ejercicio 4 en el que instanciamos un LinkedHashSet y vemos cómo funciona
 * @author Pedro Torres Sesé
 * @version 1.0
 */

import java.util.LinkedHashSet;

public class List_04_LinkedHashSet {
    static void main() {
        //Punto 1:
        //Instanciamos el LinkedHashSet
        LinkedHashSet<String> filtrosAplicados = new LinkedHashSet<>();

        //Punto 2:
        //Añadimos valores a la lista
        filtrosAplicados.add("FECHA");
        filtrosAplicados.add("CLIENTE");
        filtrosAplicados.add("FECHA");
        filtrosAplicados.add("PRODUCTO");
        filtrosAplicados.add("CLIENTE");

        //Punto 3;
        //Recorremos el LinkedHashSet y vemos qué ocurre
        for (String filtros : filtrosAplicados) {
            System.out.println(filtros);
        }

        /**
         * Lo que ocurre en el LinkedHashSet es que la lista almacena los datos por orden de inserción
         * Cuando vamos a introducir el valor duplicado, el índice no se actualiza, sino que mantiene el orden de entrada.
         */

    }
}
