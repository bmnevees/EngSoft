package org.engSoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[] numeros = {8, 9, 7, 6, 4};
        //System.out.println(numeros[3]);

        /*for (int i=0;i<10;i++){
            System.out.println(i);
        }
        int i=0;
        while (i<10){
            System.out.println(i);
            i++;
        }
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while (i<10);*/

        /*int[] numeros = {8, 5, 1, 2, 9};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(números[i]);
        }

        List<Integer> inteiros = Arrays.asList(2,3,4,8,9);
        for(Integer i : inteiros){
            System.out.println(i);
        }*/


        List<String> listaConvidados = new ArrayList<>();
        boolean maisConvidados;
        do {
            System.out.println("Insira o numero de convidados");
            double nConvidados = sc.nextDouble();
            for (int i = 0; i < nConvidados; i++) {
                System.out.println("Digite o nome do convidado");
                String nome = sc.nextLine();
                sc.nextLine();
                listaConvidados.add(nome);
            }
            System.out.println("Deseja inserir mais convidados?");
            maisConvidados = sc.nextBoolean();
        } while (maisConvidados);

        for (String i : listaConvidados) {
            System.out.println(i);
        }

    }
}
