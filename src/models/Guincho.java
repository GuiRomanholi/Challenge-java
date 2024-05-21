package models;

public class Guincho extends Veiculo{
    private String chassi;
    private String ano_fabricacao;


    //metodos

    @Override
    public String exibirDetalhes() {
        return "O Guincho de placa " + this.placa
                + " e de marca " + this.marca + " e foi fabricado " + this.ano_fabricacao
                + " está a caminho!";
    }

    public String acionarGuincho(){
       return "Seu Guincho está a caminho";
    }


    //getters e setters
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(String ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }
}
