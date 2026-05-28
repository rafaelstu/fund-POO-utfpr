/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.entidades.Pagamento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomate
 */
public class PagamentoDao {

    private List<Pagamento> pagamentos;

    public PagamentoDao() {
        this.pagamentos = new ArrayList<>();
    }

    public void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public String imprimirPagamentos() {
        StringBuilder sb = new StringBuilder();
        for (Pagamento p : pagamentos) {
            sb.append(p.tipo());
            sb.append(" | ").append(p);
            sb.append(" | ").append(p.detalhesPagamentos());
            sb.append(String.format(" | Total: R$ %.1f", p.calcularTotal()));
            sb.append("\n");
        }
        return sb.toString();
    }

}
