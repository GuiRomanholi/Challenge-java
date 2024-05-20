package test;

import models.Carro;
import models.Cliente;
import models.Motorista;

import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);
        Carro carro1 = new Carro();
        Motorista motorista1 = new Motorista();
        Cliente cliente1 = new Cliente();


        int opcao;
        do {
            System.out.println("-------------------------------------");
            System.out.println("\tSistema do Concert Car's" +
                    "\n-------------------------------------" +
                    "\nEscolha a opção:" +
                    "\n1 - Cadastrar Cliente" +
                    "\n2 - Informar Problema" +
                    "\n3 - Pegar Diagnostico" +
                    "\n4 - Forma de Pagamento" +
                    "\n5 - Cadastrar Motorista" +
                    "\n0 - Sair" +
                    "\n--> ");
            opcao = leitorNum.nextInt();
            switch (opcao) {
                case 1:
                    cliente1.cadastrar();
                    System.out.println(cliente1.exibirCliente());
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }
        }while (opcao != 0);{
            System.out.printf("Até Breve!");
        }
    }
}
