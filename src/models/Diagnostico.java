package models;

public class Diagnostico extends Problema{
    private String descricaoSintoma;
    private String observacoesMotorista;
    private String condicoesOcorrencia;
    private String tempoOCorrencia;


    @Override
    public String exibirDiagnostico() {
        return super.exibirDiagnostico();
    }

    //Getters e Setters
    public String getDescricaoSintoma() {
        return descricaoSintoma;
    }

    public void setDescricaoSintoma(String descricaoSintoma) {
        this.descricaoSintoma = descricaoSintoma;
    }

    public String getObservacoesMotorista() {
        return observacoesMotorista;
    }

    public void setObservacoesMotorista(String observacoesMotorista) {
        this.observacoesMotorista = observacoesMotorista;
    }

    public String getCondicoesOcorrencia() {
        return condicoesOcorrencia;
    }

    public void setCondicoesOcorrencia(String condicoesOcorrencia) {
        this.condicoesOcorrencia = condicoesOcorrencia;
    }

    public String getTempoOCorrencia() {
        return tempoOCorrencia;
    }

    public void setTempoOCorrencia(String tempoOCorrencia) {
        this.tempoOCorrencia = tempoOCorrencia;
    }
}
