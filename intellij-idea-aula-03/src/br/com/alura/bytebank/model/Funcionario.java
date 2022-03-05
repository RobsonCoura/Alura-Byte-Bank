package br.com.alura.bytebank.model;

import java.time.LocalDate;

public class Funcionario {

    private String nome;
    private int matricula;
    private LocalDate dataNascimento;

    public Funcionario(String nome, int matricula, LocalDate dataNascimento){
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }
    public String getNome() { return  nome;}

    public int getMatricula() { return matricula;}

    public LocalDate getDataNascimento() { return dataNascimento;}

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", matricula=" + getMatricula() +
                ", dataNascimento=" + getMatricula() +
                '}';
    }
}
