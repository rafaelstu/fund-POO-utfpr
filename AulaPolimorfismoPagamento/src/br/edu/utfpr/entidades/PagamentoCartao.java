/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.entidades;

/**
 *
 * @author tomate
 */
public class PagamentoCartao extends Pagamento {

    private int parcelas;

    public PagamentoCartao() {
    }

    public PagamentoCartao(double valor, int parcelas) {
        super(valor);
        this.parcelas = parcelas;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public double calcularTotal() {
        return super.getValor() * 1.05;
    }

    @Override
    public String detalhesPagamentos() {
        return "valor da parcela: " + calcularTotal() / parcelas;
    }

    @Override
    public String tipo() {
        return "pagamento em cartao";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nparcelas: ").append(parcelas);
        return sb.toString();
    }

}
