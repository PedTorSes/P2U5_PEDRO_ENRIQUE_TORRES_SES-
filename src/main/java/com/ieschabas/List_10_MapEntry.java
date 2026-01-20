package com.ieschabas;
/**
 * Ejercicio número 10 en el que creamos un HashMap y trabajamos con él para comprobar cómo funciona
 * @author Pedro Torres
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class List_10_MapEntry {
    static void main() {
        //Punto 1:
        //1.1 Creamos el HashMap
        HashMap <String, Integer> inventario = new HashMap<>();
        //1.2 Introducimos 4 productos
        inventario.put("Tornillo", 1);
        inventario.put("Destornillador", 2);
        inventario.put("Llave allen", 3);
        inventario.put("Martillo", 4);

        //Punto 2:
        //Implementamos un bucle que añada los objetos
        int suma = 0;
        System.out.println("LISTADO DEL INVENTARIO");
        for(Map.Entry<String, Integer> item : inventario.entrySet()) {
            //Punto 3:
            //Recorremos el listado e imprimimos el valor
            System.out.println(item);

            //Calculamos la suma total de todos los valores
            suma = suma + item.getValue();
        }
        //Imprimimos el resultado de la suma
        System.out.println("El resultado de la suma es: " + suma);

    }
}
