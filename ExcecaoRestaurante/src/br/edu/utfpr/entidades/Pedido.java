/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import br.edu.utfpr.excecoes.ValorInvalidoException;

/**
 *
 * @author tomate
 */
public class Pedido {

    private String nome;
    private double valor;

    public Pedido(String nome, double valor) throws ValorInvalidoException {
        this.nome = nome;

        if (valor <= 0) {
            throw new ValorInvalidoException("valor invalido: " + valor);
        }
        this.valor = valor;
    }

    public Pedido() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("valor invalido: " + valor);
        }
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido: ").append(nome);
        sb.append(" | valor= ").append(valor);

        return sb.toString();
    }

}
