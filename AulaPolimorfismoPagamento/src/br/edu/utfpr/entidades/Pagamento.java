/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author tomate
 */
public abstract class Pagamento {

    private double valor;

    public Pagamento() {
    }

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    abstract public double calcularTotal();

    abstract public String detalhesPagamentos();

    abstract public String tipo();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(tipo());
        sb.append(String.format("\nvalor base: %.2f", valor));

        return sb.toString();
    }

}
