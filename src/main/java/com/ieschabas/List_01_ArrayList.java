package com.ieschabas;

/**
 * Clase con un array list en el que vamos a introducir varios datos, accederemos a un valor en concreto, modificaremos un valor y mostraremos la cantidad total de los elementos
 * @author Pedro Torres Sesé
 * @version 1.0
 */

import java.util.ArrayList;

public class List_01_ArrayList {
    static void main() {

        //Punto 1
        //Instanciamos el Arraylist:
        ArrayList<String> estadoSensores = new ArrayList<>();

        //Punto 2:
        //Añadimos los valores a la lista
        estadoSensores.add("OK");
        estadoSensores.add("ERROR");
        estadoSensores.add("OK");
        estadoSensores.add("WARNING");
        estadoSensores.add("OFFLINE");

        //Punto 3:
        //Mostramos el estado del sensor 4 (valor 3 porque empieza con 0)
        System.out.println("El cuarto sensor es: " + estadoSensores.get(3));

        //Punto 4:
        //Modificamos el valor del sensor 2
        ((ArrayList<String>) estadoSensores).set(1, "MAINTENANCE");

        //Punto 5:
        //Recorremos el arraylist
        //Mostramos en pantalla el listado final
        int i = 0;
        for (String sensor : estadoSensores) {

            i++;
            System.out.println("Estado sensor " + i + ":");
            System.out.println(sensor);

        }
    }
}
