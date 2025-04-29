package org.engSoft;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //Ex:01
       // System.out.printf("Hello Word");

       //Ex:02
       Scanner sc = new Scanner(System.in);
       // System.out.println("Qual o seu nome");
       //String nome = sc.nextLine();
        //scanner.nextLine();

        //System.out.printf("O nome do usuário é ",nome);

        //Ex:03
        System.out.println("Digite o valor da nota: ");
        double nota= sc.nextDouble();

        if (nota >=7){
            System.out.println("Aluno aprovado");
        }else {
            System.out.println("Aluno reprovado");
        }
    }
}