package org.example;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        SortedSet <String> listaAprovados = new TreeSet<String>();
        listaAprovados.add("1.2");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for(String candidato : listaAprovados){
                System.out.println(candidato);


    }
}}
