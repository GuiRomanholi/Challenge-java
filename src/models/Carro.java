package models;

public class Carro extends Veiculo{
    private String cor;
    private Cliente cliente;

    //metodos

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + "\nA cor do seu carro é " + cor +
                " seu carro está cadastrado.";

    }


    //getters e setters

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
