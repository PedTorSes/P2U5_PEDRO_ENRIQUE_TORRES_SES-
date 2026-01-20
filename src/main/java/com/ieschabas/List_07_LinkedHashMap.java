package com.ieschabas;
/**
 * Ejercicio 07 donde establecemos un LinkedHashSet y vemos cómo funciona internamente
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class List_07_LinkedHashMap {
    static void main() {
        //Punto 1:
        //Creamos el LinkedHashMap
        LinkedHashMap<String, String> propiedadesDB = new LinkedHashMap<>();

        //Punto 2:
        //Añadimos datos a las claves y valores de la lista
        propiedadesDB.put("driver", "jbdc.Driver");
        propiedadesDB.put("url", "localhost:3306");
        propiedadesDB.put("user", "root");
        propiedadesDB.put("password", "12345");

        //Punto 3:
        //Recorremos e imprimimos los datos
        System.out.println("LISTADO DE PAREJAS:");
        System.out.println(propiedadesDB);

        //Punto 4:
        //Modificación de la clave "URL".
        System.out.println("LISTADO TRAS LA MODIFICACIÓN");
        if (propiedadesDB.containsKey("url")) {
            propiedadesDB.replace("url", "localhost:3306", "url2");
            System.out.println(propiedadesDB);
        }

        /**
         * Como podemos observar, la clave URL mantiene su posición dentro de la colección.
         * Solamente ha cambiado su valor
         */
    }
}
