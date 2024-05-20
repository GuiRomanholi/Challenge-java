package models;

import java.util.Scanner;

public class Motorista {
    private String id;
    private String nome;
    private double salario;

    public String exibirMotorista(){
        return "Bem vindo " + this.nome + "a partir de agora seu sálario é " + this.salario;
    }

    public double aumentoSalario(){
        double valorAcrescimo;
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Quanto deseja aumentar no sálario?");
        valorAcrescimo = leitor.nextDouble();
        return this.salario += valorAcrescimo;
    }


    //Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
