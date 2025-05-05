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
       /* System.out.println("Digite o valor da nota: ");
        double nota= sc.nextDouble();

        if (nota >=7){
            System.out.println("Aluno aprovado");
        }else {
            System.out.println("Aluno reprovado");
        }*/

       /* Aluno aluno = new Aluno("Beatriz",26,"105844","Av Industrias");
        System.out.println(aluno);

        aluno.nomeAluno = "Higor Jean";
        aluno.idadeAluno = 25;

        System.out.println(aluno);*/

    //Ex:05
    Cliente cliente = new Cliente(123456789L,"Beatriz Morais","889988","Av Industrias","105844",26);
    System.out.println(cliente);

    cliente.nome = "Diego Guiraldelli";
    cliente.idade = 28;

    System.out.println(cliente);
    }

}