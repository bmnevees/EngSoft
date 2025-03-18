package org.example.entity;

public class Carro extends Automovel {
    private int qtdPortas;
    private String motor;
    private boolean direcaoHidraulica;

    public Carro(String marca, int anoDeFabricacao, String modelo, int qtdPortas, String motor, boolean direcaoHidraulica) {
        super(marca, anoDeFabricacao, modelo);
        this.qtdPortas = qtdPortas;
        this.motor = motor;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public void trancarPorta(){
        System.out.println("Porta trancada");
    }

    public void ligarAlarme(){
        System.out.println("Alarme ligado");
    }

}
