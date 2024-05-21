package models;

import java.util.Scanner;

public class Motorista {
    private String id;
    private String nome;
    private double salario;


    public void cadastrar(){
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        this.nome = leitor.nextLine();
        System.out.println("Qual o seu id? ");
        this.id = leitor.nextLine();
        System.out.println("Qual o seu sálario? ");
        this.salario = leitorNum.nextDouble();
        System.out.println("Obrigado pelo cadastro!");
    }
    public String exibirMotorista(){
        return "Muito bom! Você " + this.nome + " foi cadastrado no sistema, a partir de agora seu sálario é R$" + this.salario;
    }

    public double aumentoSalario(){
        double valorAcrescimo;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quanto deseja aumentar no sálario?");
        valorAcrescimo = leitor.nextDouble();
        System.out.println("Sálario aumentado, parabens!");
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
