/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author tomate
 */
public class PagamentoPix extends Pagamento {

    public PagamentoPix() {
    }

    public PagamentoPix(double valor) {
        super(valor);
    }

    public double calcularDesconto() {
        return super.getValor() * 0.1;
    }

    @Override
    public double calcularTotal() {
        return super.getValor() + calcularDesconto();
    }

    @Override
    public String detalhesPagamentos() {
        return "desconto: " + calcularDesconto();
    }

    @Override
    public String tipo() {
        return "pagamento em pix";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());

        return sb.toString();
    }

}
