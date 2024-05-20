package models;

public class FrmPagamento {
    private String id;
    private String valor;
    private String data;
    private String status;


    public String escolherForma(){
        return "";
    }

    public double exibirValor(){
        return 0;
    }



    //Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
