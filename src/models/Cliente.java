package models;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;


    public String exibirCliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        return "Bom dia " + getNome() +
                "\nSeu cpf foi cadastrado como: " + getCpf() +
                "\nSeu telefone é: " + getTelefone() +
                "\nE seu email é: " + getEmail();
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
