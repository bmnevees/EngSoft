package org.engSoft;

public class Aluno {
    private String nomeAluno;
    private int idadeAluno;
    private String cpf;
    private String endereco;

    public Aluno(String nomeAluno, int idadeAluno, String cpf, String endereco) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", idadeAluno=" + idadeAluno +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
