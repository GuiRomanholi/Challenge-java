package models;

import java.util.Scanner;

public class Guincho extends Veiculo{
    private String chassi;
    private String ano_fabricacao;


    //metodos

    @Override
    public String exibirDetalhes() {
        return "O Guincho de placa " + this.placa
                + " e de marca " + this.marca + " que foi fabricado " + this.ano_fabricacao;
    }

    public void acionarGuincho(){
        Scanner leitorNum = new Scanner(System.in);
        boolean volta = true;
        int prosseguir;
        while (volta == true){
            System.out.println("Fique Tranquilo, você gostaria de chamar um guincho? (1 = Sim) e (2 = Não)");
            prosseguir = leitorNum.nextInt();
            if (prosseguir == 1){
                System.out.println("O Guincho está a caminho.");
                break;
            } else if (prosseguir == 2) {
                System.out.println("--> Retornando...");
                break;
            }else {
                System.out.println("Por favor digite 1 para Sim ou 2 para Não");
            }
        }
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
