package models;

import java.util.Scanner;

public class FrmPagamento {
    private String id;
    private double valor;
    private String status;


    public void escolherForma(){
        Scanner leitor = new Scanner(System.in);
        int opcao;
        boolean prosseguir = true;
        while (prosseguir == true){
            System.out.println("Escolha uma das opções de pagamento pelo numero entre ()");
            System.out.println("1 - Pix\n2 - Cartão de Débito\n3 - Cartão de Crédito");
            opcao = leitor.nextInt();
            if (opcao == 1){
                System.out.println("Será gerado o código do pix");
                break;
            } else if (opcao == 2) {
                System.out.println("Será gerado o código");
                break;
            } else if (opcao == 3) {
                System.out.println("Será gerado o código");
                break;
            }else {
                System.out.println("Por favor insira a opção de pagamento pelos ()");
            }
        }
    }

    public double exibirValor(double valor){
        this.valor = valor;
        System.out.println("Esse é o valor atual: " + this.valor);
        return this.valor;
    }



    //Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
