package models;

import java.util.Scanner;

public class Problema {
    private String gravidade;
    private String historicoVeiculo;


    public void exibirSituacaoProblema(){
        System.out.println("A gravidade do problema do carro é: " + this.gravidade);
        System.out.println("O historico do veiculo confirmado é: " + this.historicoVeiculo);
    }


    //Getters e Setters
    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public String getHistoricoVeiculo() {
        return historicoVeiculo;
    }

    public void setHistoricoVeiculo(String historicoVeiculo) {
        this.historicoVeiculo = historicoVeiculo;
    }

}
