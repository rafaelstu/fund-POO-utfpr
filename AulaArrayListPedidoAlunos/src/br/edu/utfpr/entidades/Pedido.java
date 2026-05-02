/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import java.time.LocalDate;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Pedido {

    private static int contadorId = 0;
    private int id;
    private LocalDate data;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<ItemPedido> listaItens;

    public Pedido() {
        this.id = ++contadorId;
        this.listaItens = new ArrayList<>();
    }

    public Pedido(LocalDate data, Cliente cliente, Vendedor vendedor) {
        this.id = ++contadorId;
        this.data = data;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.listaItens
                = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<ItemPedido> getListaItens() {
        return listaItens;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public String imprimirLista() {
        StringBuilder sb = new StringBuilder();

        listaItens.forEach(i -> sb.append(i).append('\n'));

        return sb.toString();
    }

    public void addItem(ItemPedido i) {
        if (i != null && listaItens != null) {
            listaItens.add(i);
        };
    }

    public boolean removerItem(int id) {
        return listaItens.removeIf(i -> i.getId() == id);
    }

    public void ordenarItemPorPreco() {
        listaItens.sort((ip1, ip2)
                -> Double.compare(ip1.getProduto().getPreco(), ip2.getProduto().getPreco())
        );
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nData:" + data + "\nCliente:" + cliente + "\nVendedor:"
                + vendedor + "\nLista de itens do pedido: " + imprimirLista();
    }

}
