package com.ieschabas;
/**
 *
 */

import java.util.TreeMap;

public class List_08_TreeMap {
    static void main() {
        //Punto 1:
        //Establecemos el TreeMap
        TreeMap<String, Double> usoCPU = new TreeMap<>();

        //Punto 2:
        //Añadimos valores a la lista
        usoCPU.put("Explorer", 15.3);
        usoCPU.put("System", 5.0);
        usoCPU.put("Antivirus", 2.1);
        usoCPU.put("ServiceHost", 35.8);

        //Punto 3:
        //Imprimimos y observamos el comportamiento
        System.out.println(usoCPU.toString());

        /**
         * Como podemos observar, el TreeMap organiza la información de manera ascendente en función de su clave
         * Si los valores son numéricos, organizaría del 0 al número más alto
         * Si los valores son letras, los ordena alfabéticamente
         */

        //Punto 4_
        //Buscamos e imprimimos los valores anteriores y posteriores de "System"
        System.out.println(usoCPU.floorKey("System"));
        System.out.println(usoCPU.ceilingKey("System"));

        /**
         * Como los métodos floorKey y ceilingKey buscan el dato más próximo a lo introducido
         * Y resulta que la búsqueda "System" está en la lista
         * El resultado de ambos comandos es "System"
         */
    }
}
