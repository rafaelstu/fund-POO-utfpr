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
public class Produto {

    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean atualizarEstoque(int quantidadeVendida) throws QuantidadeInsuficienteException {
        if (quantidade >= quantidadeVendida) {
            quantidade -= quantidadeVendida;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Produto: ").append(nome);
        sb.append("\nqtd: ").append(quantidade);
        sb.append("\npreco: ").append(preco);

        return sb.toString();
    }

}
