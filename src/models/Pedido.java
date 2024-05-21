package models;

public class Pedido {
    private String hora;
    private String data;
    private String numero;



    public String validarPedido(){
        return "";
    }



    //Getters e Setters
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
