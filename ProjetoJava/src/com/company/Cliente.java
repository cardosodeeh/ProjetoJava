package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

import static Funções.Utils.calculaIdade;

public class Cliente {

    private static int sequence = 1;

    private int id;
    private String dataNasc;
    private String nome;
    private int idade;
    private String email;
    private String cpf;
    private int ano;
    private Endereço endereco;

    public String diferencaData(){

        SimpleDateFormat sdf
    }

    public Cliente (String nome, String email, String cpf, String dataNasc) {
        this.id = sequence++;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.idade = LocalDate.now().- Integer.parseInt(dataNasc);
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public static int getSequence() {
        return sequence;
    }

    public static void setSequence(int sequence) {
        Cliente.sequence = sequence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}