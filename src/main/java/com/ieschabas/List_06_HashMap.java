package com.ieschabas;

import java.util.HashMap;

import static java.util.HashMap.newHashMap;

public class List_06_HashMap {
    static void main() {
        //Punto 1:
        //Establecemos HashMap
        HashMap<Integer, String> usuariosConectados = new HashMap();

        //Putno 2:
        // Introducimos valores:
        usuariosConectados.put(101, "admin_user");
        usuariosConectados.put(205, "guest_user");
        usuariosConectados.put(101, "super_admin");

        //Punto 3:
        // Imprimimos el valor de la clave 101
        /**
         * Como podemos ver con el siguiente comando, la clave 101 ahora corresponde al valor "super_admin"
         */
        System.out.println(usuariosConectados.get(101));

        //Punto 4:
        //Verificamos si el 205 sigue conectado

        System.out.println(usuariosConectados.containsKey(205));


    }
}
