/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.dao.PagamentoDao;
import br.edu.utfpr.entidades.Pagamento;
import br.edu.utfpr.entidades.PagamentoBoleto;
import br.edu.utfpr.entidades.PagamentoCartao;
import br.edu.utfpr.entidades.PagamentoPix;
import java.time.LocalDate;

/**
 *
 * @author tomate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PagamentoDao dao = new PagamentoDao();

        // 1 pagamento em cartão
        dao.adicionarPagamento(new PagamentoCartao(1000.0, 2));

        // 1 pagamento PIX
        dao.adicionarPagamento(new PagamentoPix(100.0));

        // 2 pagamentos em boleto
        dao.adicionarPagamento(new PagamentoBoleto(2000.0, LocalDate.now().plusDays(3)));
        dao.adicionarPagamento(new PagamentoBoleto(5000.0, LocalDate.now().plusDays(5)));

        // Exibir todos
        System.out.print(dao.imprimirPagamentos());

        // Contar por tipo com instanceof
        int qtdCartao = 0, qtdPix = 0, qtdBoleto = 0;

        for (Pagamento p : dao.getPagamentos()) {
            if (p instanceof PagamentoCartao) {
                qtdCartao++;
            } else if (p instanceof PagamentoPix) {
                qtdPix++;
            } else if (p instanceof PagamentoBoleto) {
                qtdBoleto++;
            }
        }

        System.out.println("Quantidade de pagamentos em cartão: " + qtdCartao);
        System.out.println("Quantidade de pagamentos PIX: " + qtdPix);
        System.out.println("Quantidade de pagamentos boleto: " + qtdBoleto);
    }
}
