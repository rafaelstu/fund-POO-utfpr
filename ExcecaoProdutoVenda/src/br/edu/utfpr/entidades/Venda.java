/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import br.edu.utfpr.excecoes.QuantidadeInsuficienteException;

/**
 *
 * @author tomate
 */
public class Venda {

    private Produto produto;
    private int quantidadeVendida;
    private double valorTotalVenda;

    public Venda(Produto produto, int quantidadeVendida) {

        this.produto = produto;
        this.quantidadeVendida = quantidadeVendida;
        this.valorTotalVenda = 0;
    }

    public Venda() {
        this.produto = new Produto();
        this.valorTotalVenda = 0;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void efetuarVenda() throws QuantidadeInsuficienteException {

        if (!produto.atualizarEstoque(quantidadeVendida)) {
            throw new QuantidadeInsuficienteException(" quantidade insuficiente para venda. estoque disponivel: "
                    + produto.getQuantidade() + ", quantidade solicitada: " + quantidadeVendida);
        }

        valorTotalVenda = quantidadeVendida * produto.getPreco();

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("produto ").append(produto.getNome());
        sb.append("\nquantidadeVendida=").append(quantidadeVendida);
        sb.append("\nvalorTotalVenda=").append(valorTotalVenda);
        sb.append("\nestoque atual=").append(produto.getQuantidade());
        return sb.toString();
    }

}
