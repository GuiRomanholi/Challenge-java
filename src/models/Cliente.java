package models;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;


    public void cadastrar(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        this.nome = leitor.nextLine();
        System.out.println("Qual o seu cpf? ");
        this.cpf = leitor.nextLine();
        System.out.println("Qual o seu telefone? ");
        this.telefone = leitor.nextLine();
        System.out.println("Qual o seu email? ");
        this.email = leitor.nextLine();
        System.out.println("Obrigado pelo cadastro!");
    }

    public String exibirCliente(){
        return "Bom dia " + this.nome +
                "\nSeu cpf foi cadastrado como: " + this.cpf +
                "\nSeu telefone é: " + this.telefone +
                "\nE seu email é: " + this.email;
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
