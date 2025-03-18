package org.example.entity;

public class Moto extends Automovel{
    private String tipo;
    private String motor;
    private boolean partidaEletrica;

    public Moto(String marca, int anoDeFabricacao, String modelo, String tipo, String motor, boolean partidaEletrica) {
        super(marca, anoDeFabricacao, modelo);
        this.tipo = tipo;
        this.motor = motor;
        this.partidaEletrica = partidaEletrica;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public void abrirValvulaCombustivel(){
        System.out.printf("Válvula de combustível aberta");
    }

}
