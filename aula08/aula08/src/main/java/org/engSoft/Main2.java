package org.engSoft;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Ensino medio concluido?");
        //boolean concluiuEM = sc.nextBoolean();

        //System.out.println("Informe a idade: ");
        //int idade = sc.nextInt();

        //System.out.println("Qual a nota de corte?");
        //double notaCorte = sc.nextDouble();

        System.out.println("Digite o valor da nota: ");
        double notaProva= sc.nextDouble();

        System.out.println("Digite o valor do trabalho: ");
        double notaTrabalho= sc.nextDouble();

        System.out.println("Digite o valor da nota sub: ");
        double notaSub= sc.nextDouble();


        //if (concluiuEM && notaProva>notaCorte && idade>=18){
        //    System.out.println("Pode iniciar a faculdade");
        //}else {
        //    System.out.println("Nao pode iniciar a faculdade");
        //}
        if ((notaProva + notaTrabalho)>7 || (notaSub+notaTrabalho)>7){
            System.out.printf("Aprovado");
        }else {
            System.out.printf("Reprovado");
        }
    }
}
