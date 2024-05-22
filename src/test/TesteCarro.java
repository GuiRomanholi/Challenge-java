package test;

import models.*;

import java.time.LocalDate;
import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");
        Cliente cliente = new Cliente();
        cliente.setNome("Vitor");
        cliente.setCpf("355.233.654-12");
        cliente.setEmail("vitinho@email.com");
        cliente.setTelefone("(11) 23234-2399");


        System.out.println(cliente.exibirCliente("Vitor","355.233.654-12"));

        System.out.println("-------------------------------------------------------");

        Carro carro = new Carro();
        carro.setPlaca("1FD3R4");
        carro.setCor("Prata");
        carro.setMarca("Fiat");
        carro.setModelo("CRONOS");


        System.out.println(carro.exibirDetalhes());

        System.out.println("-------------------------------------------------------");

        Guincho guincho = new Guincho();
        guincho.setMarca("Ford");
        guincho.setPlaca("3FGU76");
        guincho.setAno_fabricacao("2006");

        System.out.println(guincho.exibirDetalhes());
        guincho.acionarGuincho();

        System.out.println("-------------------------------------------------------");

        Diagnostico diagnostico = new Diagnostico();
        diagnostico.exibirDiagnostico();
        diagnostico.mostrarDescricao();


        System.out.println("-------------------------------------------------------");

        Endereco endereco = new Endereco();
        endereco.setCep("08480040");
        endereco.setCidade("São Paulo");
        endereco.setEstado("São Paulo");
        endereco.setNumero("223");

        System.out.println(endereco.exibirEndereco());

        System.out.println("-------------------------------------------------------");

        System.out.println("DADOS DO PEDIDO");
        Pedido pedido = new Pedido();
        pedido.setData(LocalDate.ofEpochDay(12/10/2024));
        pedido.setHora("10:10");
        pedido.setNumero("13642");

        System.out.println(pedido.dadosPedido());

        System.out.println("-------------------------------------------------------");

        FrmPagamento frmPagamento = new FrmPagamento();
        frmPagamento.setId("4235113");
        frmPagamento.setStatus("Aprovado");
        frmPagamento.escolherForma();
        frmPagamento.exibirValor(200);
        

        System.out.println("-------------------------------------------------------");


    }
}
