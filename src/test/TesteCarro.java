package test;

import models.*;

import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);
        Carro carro1 = new Carro();
        Problema problema1 = new Problema();
        Motorista motorista1 = new Motorista();
        Cliente cliente1 = new Cliente();
        Diagnostico diagnostico1 = new Diagnostico();



        int opcao;
        do {
            System.out.println("---------------------------------------------------------");
            System.out.println("\tS I S T E M A - D O - C O N C E R T - C A R ' S" +
                    "\n---------------------------------------------------------" +
                    "\nEscolha a opção:" +
                    "\n1 - Cadastrar Cliente" +
                    "\n2 - Informar Problema e Pedir Guincho" +
                    "\n3 - Pegar Diagnostico" +
                    "\n4 - Forma de Pagamento" +
                    "\n5 - Cadastrar Motorista" +
                    "\n6 - Avaliação" +
                    "\n0 - Sair" +
                    "\n--> ");
            opcao = leitorNum.nextInt();
            switch (opcao) {
                case 1:
                    cliente1.cadastrar();
                    System.out.println(cliente1.exibirCliente());
                    break;
                case 2:
                    problema1.informarProblema();
                    break;
                case 3:
                    diagnostico1.exibirDiagnostico();
                    break;
                case 4:

                    break;
                case 5:
                    int resposta;
                    boolean volta = true;
                    motorista1.cadastrar();
                    System.out.println(motorista1.exibirMotorista());
                    while (volta == true){
                        System.out.println("Deseja aumentar o sálario do Motorista? (1 = Sim) e (2 = Não)");
                        resposta = leitorNum.nextInt();
                        if (resposta == 1){
                            motorista1.aumentoSalario();
                            break;
                        } else if (resposta == 2) {
                            System.out.println("Retornando ao Sistema Principal...");
                            break;
                        }else {
                            System.out.println("Por favor digite 1 para Sim ou 2 para Não");
                        }
                    }
                    break;
                case 6:

                    break;
            }
        }while (opcao != 0);{System.out.println("Até Breve!");}
    }
}
