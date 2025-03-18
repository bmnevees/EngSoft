package org.example;

import org.example.entity.Carro;

import static java.lang.Boolean.TRUE;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Carro carro = new Carro("Chevrolet", 2018, "Cruze sedan", 4, "1.4 turbo", TRUE);

    }
}