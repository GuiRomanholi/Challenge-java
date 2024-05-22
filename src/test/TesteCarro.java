package test;

import models.*;

import java.time.LocalDate;
import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        Scanner leitorNum = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        Cliente cliente = new Cliente();
        cliente.setNome("Vitor");
        cliente.setCpf("355.233.654-12");
        cliente.setEmail("vitinho@email.com");
        cliente.setTelefone("(11) 23234-2399");


        System.out.println(cliente.exibirCliente("Vitor","355.233.654-12"));

        System.out.println("-------------------------------------------------------\n");
        boolean prosseguir = true;
        int continuar;
        while (prosseguir == true){
            System.out.println("Deseja ver os detalhes do Carro? (Sim = 1) e (Não = 2)");
            continuar = leitorNum.nextInt();
            if (continuar == 1){
                Carro carro = new Carro();
                carro.setPlaca("1FD3R4");
                carro.setCor("Prata");
                carro.setMarca("Fiat");
                carro.setModelo("CRONOS");

                System.out.println(carro.exibirDetalhes());
                break;

            } else if (continuar == 2) {
                System.out.println("Prosseguindo...");
                break;
            }else {
                System.out.println("Por favor informe 1 para Sim e 2 para Não");
            }
        }

        System.out.println("-------------------------------------------------------\n");

        while (prosseguir == true){
            System.out.println("Deseja ver os detalhes do Guincho? (Sim = 1) e (Não = 2)");
            continuar = leitorNum.nextInt();
            if (continuar == 1){
                Guincho guincho = new Guincho();
                guincho.setMarca("Ford");
                guincho.setPlaca("3FGU76");
                guincho.setAno_fabricacao("2006");

                System.out.println(guincho.exibirDetalhes());
                guincho.acionarGuincho();
                break;

            } else if (continuar == 2) {
                System.out.println("Prosseguindo...");
                break;
            }else {
                System.out.println("Por favor informe 1 para Sim e 2 para Não");
            }
        }


        System.out.println("-------------------------------------------------------\n");

        while (prosseguir == true){
            System.out.println("Deseja tentar resolver o problema? (Sim = 1) e (Não = 2)");
            continuar = leitorNum.nextInt();
            if (continuar == 1){
                Diagnostico diagnostico = new Diagnostico();
                diagnostico.exibirDiagnostico();
                diagnostico.mostrarDescricao();
                break;

            } else if (continuar == 2) {
                System.out.println("Prosseguindo...");
                break;
            }else {
                System.out.println("Por favor informe 1 para Sim e 2 para Não");
            }
        }

        System.out.println("-------------------------------------------------------\n");

        while (prosseguir == true){
            System.out.println("Deseja ver detalhes do Endereço? (Sim = 1) e (Não = 2)");
            continuar = leitorNum.nextInt();
            if (continuar == 1){
                Endereco endereco = new Endereco();
                endereco.setCep("08480040");
                endereco.setCidade("São Paulo");
                endereco.setEstado("São Paulo");
                endereco.setNumero("223");

                System.out.println(endereco.exibirEndereco());
                break;
            } else if (continuar == 2) {
                System.out.println("Prosseguindo...");
                break;
            }else {
                System.out.println("Por favor informe 1 para Sim e 2 para Não");
            }
        }



        System.out.println("-------------------------------------------------------\n");

        while (prosseguir == true){
            System.out.println("Deseja ver os dados do pedido? (Sim = 1) e (Não = 2)");
            continuar = leitorNum.nextInt();
            if (continuar == 1){
                System.out.println("DADOS DO PEDIDO");
                Pedido pedido = new Pedido();
                pedido.setData(LocalDate.ofEpochDay(12/10/2024));
                pedido.setHora("10:10");
                pedido.setNumero("13642");

                System.out.println(pedido.dadosPedido());
                break;
            } else if (continuar == 2) {
                System.out.println("Prosseguindo...");
                break;
            }else {
                System.out.println("Por favor informe 1 para Sim e 2 para Não");
            }
        }


        System.out.println("-------------------------------------------------------\n");

        while (prosseguir == true){
            System.out.println("Deseja escolher a forma de pagamento? (Sim = 1) e (Não = 2)");
            continuar = leitorNum.nextInt();
            if (continuar == 1){
                FrmPagamento frmPagamento = new FrmPagamento();
                frmPagamento.setId("4235113");
                frmPagamento.setStatus("Aprovado");
                frmPagamento.escolherForma();
                frmPagamento.exibirValor(200);
                break;
            } else if (continuar == 2) {
                System.out.println("Prosseguindo...");
                break;
            }else {
                System.out.println("Por favor informe 1 para Sim e 2 para Não");
            }
        }

        System.out.println("-------------------------------------------------------\n");

        while (prosseguir == true){
            System.out.println("Deseja ver a situação do veiculo? (Sim = 1) e (Não = 2)");
            continuar = leitorNum.nextInt();
            if (continuar == 1){
                Problema problema = new Problema();
                problema.setGravidade("Alta");
                problema.setHistoricoVeiculo("Veiculo Zero");
                problema.exibirSituacaoProblema();
                break;
            } else if (continuar == 2) {
                System.out.println("Prosseguindo...");
                break;
            }else {
                System.out.println("Por favor informe 1 para Sim e 2 para Não");
            }
        }


        System.out.println("-------------------------------------------------------\n");

        while (prosseguir == true){
            System.out.println("Deseja ver a oficina que seu veículo foi direcionado? (Sim = 1) e (Não = 2)");
            continuar = leitorNum.nextInt();
            if (continuar == 1){
                Oficina oficina = new Oficina();
                oficina.setNome("AutoPrime");
                oficina.setCnpj("12.345.678/0001-90");
                oficina.setContato("(11) 93774-3726");
                oficina.setRazao_social("Oficina Mecânica AutoPrime Ltda");

                System.out.println(oficina.oficinaRecebeuCarro());
                break;
            } else if (continuar == 2) {
                System.out.println("Prosseguindo...");
                break;
            }else {
                System.out.println("Por favor informe 1 para Sim e 2 para Não");
            }
        }
    }
}
