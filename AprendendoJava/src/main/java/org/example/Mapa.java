package org.example;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(20, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println("\n\n\n"+usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println(usuarios.get(4));

        for(int chave: usuarios.keySet())
            System.out.println(chave);
        for(String Valor: usuarios.values())
            System.out.println(Valor);
        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.println(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }

    }
}
