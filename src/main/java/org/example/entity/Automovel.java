package org.example.entity;

public class Automovel {
    String marca;
    int anoDeFabricacao;
    String modelo;

    public Automovel(String marca, int anoDeFabricacao, String modelo) {
        this.marca = marca;
        this.anoDeFabricacao = anoDeFabricacao;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void ligar(){
        System.out.printf("Automóvel ligado");
    }
    public void Desligar(){
        System.out.printf("Automóvel desligado");
    }
}
