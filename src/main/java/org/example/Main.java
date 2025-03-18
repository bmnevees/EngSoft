package org.example;

import org.example.entity.Carro;
import org.example.entity.Moto;
main

import static java.lang.Boolean.TRUE;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto("Honda",2018,"Fan","Tipo2","2 cilindrada",TRUE);

        Carro carro = new Carro("Chevrolet", 2018, "Cruze sedan", 4, "1.4 turbo", TRUE);

    }
}