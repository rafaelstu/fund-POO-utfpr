/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

import java.time.LocalDate;

/**
 *
 * @author tomate
 */
public class PagamentoBoleto extends Pagamento {

    private LocalDate dataVencimento;

    public PagamentoBoleto() {
    }

    public PagamentoBoleto(double valor, LocalDate dataVencimento) {
        super(valor);
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public double calcularTotal() {
        return getValor() + 2.00;
    }

    public long diasParaVencimento() {
        return java.time.temporal.ChronoUnit.DAYS
                .between(LocalDate.now(),
                        dataVencimento);
    }

    @Override
    public String detalhesPagamentos() {
        return "Dias para vencimento: " + diasParaVencimento();
    }

    @Override
    public String tipo() {
        return "Pagamento em boleto";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nvencimento: ").append(dataVencimento);
        return sb.toString();
    }

}
