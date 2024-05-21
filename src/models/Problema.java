package models;

import java.util.Scanner;

public class Problema {
    private String gravidade;
    private String historicoVeiculo;
    private String causasPossiveis;
    private String sintomaPrincipal;



    public void informarProblema(){
        int prosseguir;
        boolean volta = true;
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);
        System.out.println("Por Favor informe o ocorrido.");
        this.historicoVeiculo = leitor.nextLine();
        while (volta == true){
            System.out.println("Fique Tranquilo, você gostaria de chamar um guincho? (1 = Sim) e (2 = Não)");
            prosseguir = leitorNum.nextInt();
            if (prosseguir == 1){
                Guincho guincho1 = new Guincho();
                guincho1.setPlaca("1FH5DF");
                guincho1.setMarca("CSM");
                guincho1.setAno_fabricacao("1990");
                guincho1.acionarGuincho();
                System.out.println("Aqui estão os detalhes do guincho" +
                        "\n-------------------------------------");
                System.out.println(guincho1.exibirDetalhes());
                break;
            } else if (prosseguir == 2) {
                System.out.println("Retornando ao menu...");
                break;
            }else {
                System.out.println("Por favor digite 1 para Sim ou 2 para Não");
            }
        }
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

    public String getCausasPossiveis() {
        return causasPossiveis;
    }

    public void setCausasPossiveis(String causasPossiveis) {
        this.causasPossiveis = causasPossiveis;
    }

    public String getSintomaPrincipal() {
        return sintomaPrincipal;
    }

    public void setSintomaPrincipal(String sintomaPrincipal) {
        this.sintomaPrincipal = sintomaPrincipal;
    }
}
