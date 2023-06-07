package arrays;

import java.util.Arrays;
import java.util.*;

public class Exercicio {
    public static void main(String[] args){
        double total = 0;
        System.out.println("Quantidade de notas: ");
        Scanner entrada = new Scanner(System.in);
        int qntNotas = entrada.nextInt();
        double[] Notas = new double[qntNotas];
        for(int i = 0;i<Notas.length;i++)
            Notas[i] = entrada.nextDouble();
        for (double nota : Notas) {
            total += nota;
        }
    double media = total/Notas.length;
        System.out.println(media);
}}
