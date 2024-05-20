package models;

public class Problema {
    private String gravidade;
    private String historicoVeiculo;
    private String causasPossiveis;
    private String sintomaPrincipal;



    public String exibirDiagnostico(){
        return "";
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
