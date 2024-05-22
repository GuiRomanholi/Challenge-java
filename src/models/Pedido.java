package models;

import java.time.LocalDate;

public class Pedido {
    private String hora;
    private LocalDate data;
    private String numero;



    public String dadosPedido(){
        return "Hórario do Pedido: " + this.hora +
                "\nData do Pedido: " + this.data +
                "\nNúmero do Pedido: " + this.numero;
    }



    //Getters e Setters

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
