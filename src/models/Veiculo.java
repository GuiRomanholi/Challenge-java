package models;

public abstract class Veiculo {
    protected String placa;
    protected String marca;
    protected String modelo;


    //metodos

    public String exibirDetalhes(){
        return "Bom dia Úsuario, seu veiculo de placa " + this.placa
                + "de marca " + this.marca + "\ne de modelo " + this.modelo
                + " já está cadastrado no nosso sistema";
    }


    //getters e setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
