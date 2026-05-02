/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.dao.PedidoDao;
import br.edu.utfpr.entidades.Cliente;
import br.edu.utfpr.entidades.ItemPedido;
import br.edu.utfpr.entidades.Pedido;
import br.edu.utfpr.entidades.Produto;
import br.edu.utfpr.entidades.Vendedor;
import java.time.LocalDate;

/**
 *
 * @author Dell
 */
public class UsandoPedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\n\n--------------Pedido 1----------------");

        Cliente cliente1 = new Cliente("MARIA DA SILVA", 1234212);
        Cliente cliente2 = new Cliente("JOana", 123456);
        Vendedor vendedor1 = new Vendedor(1000, "POBRE", 4444);
        Vendedor vendedor2 = new Vendedor(10000, "Pedro", 123);

        Produto produto1 = new Produto("ANTEMAO", 50);
        Produto produto2 = new Produto("BOLICHE", 150);
        Produto produto3 = new Produto("CHUMBO", 200);

        Produto produto4 = new Produto("ARTERIA", 50);
        Produto produto5 = new Produto("BOMBA nuclear", 9150);
        Produto produto6 = new Produto("CABEÇA", 200);

        Pedido pedido1 = new Pedido(LocalDate.now(), cliente1, vendedor1);
        ItemPedido ip1 = new ItemPedido(produto1, 7);
        ItemPedido ip2 = new ItemPedido(produto2, 4);

        pedido1.addItem(ip1);
        pedido1.addItem(ip2);
        pedido1.addItem(ip1);

        Pedido pedido2 = new Pedido(LocalDate.now(), cliente2, vendedor2);
        ItemPedido ip3 = new ItemPedido(produto5, 10);
        pedido2.addItem(ip3);
        pedido2.addItem(ip1);
        pedido2.addItem(ip2);

        PedidoDao pd = new PedidoDao();

        pd.addPedido(pedido1);
        pd.addPedido(pedido2);

        pedido1.ordenarItemPorPreco();
        pedido2.ordenarItemPorPreco();

        pedido1.removerItem(1);

        System.out.println("\n\n\n---------Lista de pedidos geral-------------");
        System.out.println(pd.imprimirListaPedido());

        System.out.println("\n\n----------------Ordenar itens por preço--------------\n");

    }

}
