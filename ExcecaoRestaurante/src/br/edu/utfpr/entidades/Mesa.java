/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author tomate
 */
public class Mesa {

    private int numero;
    private Cliente cliente;
    private Pedido pedido;

    public Mesa(int numero, Cliente cliente, Pedido pedido) {
        this.numero = numero;
        this.cliente = cliente;
        this.pedido = pedido;
    }

    public Mesa() {
        this.cliente = new Cliente();
        this.pedido = new Pedido();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mesa: ").append(numero);
        sb.append(" | cliente=").append(cliente.getNome());
        sb.append(" | pedido=").append(pedido.getNome());
        return sb.toString();
    }

}
