/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.ItemPedido;
import java.util.ArrayList;
import java.util.List;

import br.edu.utfpr.entidades.Pedido;

/**
 *
 * @author tomate
 */
public class PedidoDao {

    private List<Pedido> listaPedido;

    public PedidoDao() {
        this.listaPedido = new ArrayList<>();
    }

    public void addPedido(Pedido p) {
        if (listaPedido != null && p != null) {
            listaPedido.add(p);
        }

    }

    public String imprimirListaPedido() {
        StringBuilder sb = new StringBuilder();

        for (Pedido p : listaPedido) {
            sb.append("\nPedido => ").append(p.getId()).append("\n");
            sb.append("Data do pedido: ").append(p.getData()).append("\n");
            sb.append("Cliente: ").append(p.getCliente().getNome()).append("\n");
            sb.append("Itens do pedido: ").append("\n");

            for (ItemPedido ip : p.getListaItens()) {
                sb.append("Id: ").append(ip.getId()).append(" | ");
                sb.append("Produto: ").append(ip.getProduto().getDescricao()).append("\n");
                sb.append("Preço un.: ").append(ip.getProduto().getPreco()).append(" | ");
                sb.append("Qtde.: ").append(ip.getQuantidade()).append("\n");
            };
        }

        return sb.toString();
    }
}
