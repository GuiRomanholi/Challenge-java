package models;

public class Carro extends Veiculo{
    private String cor;

    //metodos

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + "\na cor do seu carro é " + cor;
    }



    //getters e setters

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
