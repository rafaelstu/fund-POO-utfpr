/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.transporte.Aviao;
import br.edu.utfpr.transporte.Caminhao;
import br.edu.utfpr.transporte.Transporte;

/**
 *
 * @author tomate
 */
public class TesteTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caminhao c = new Caminhao(507, 15000, 4.5);
        Aviao a = new Aviao(7500, 700000, 750);

        tentarAdicionarCarga(c, 14500);
        tentarAdicionarCarga(a, 600000);
        tentarAdicionarCarga(c, 1500);
        imprimirInformacoes(c, "Caminhão");
        imprimirInformacoes(a, "Avião");

        tentarRemoverCarga(c, 500);

        System.out.println("após remover 500kg do caminhao");

        imprimirInformacoes(c, "Caminhão");

    }

    private static void imprimirInformacoes(Transporte t, String nome) {
        StringBuilder sb = new StringBuilder("\n");

        sb.append(nome).append(":\n");
        sb.append(t.toString());
        sb.append(String.format("\ncustoTotal: R$ %.2f", t.calcularCusto()));
        System.out.println(sb);
    }

    private static void tentarAdicionarCarga(Transporte t, double peso) {
        boolean sucesso = t.adicionarCarga(peso);
        if (sucesso) {
            System.out.printf("%.2fkg adicionados à carga.%n", peso);
        } else {
            System.out.printf("não foi possível adicionar %.2fkg (limite excedido).%n", peso);
        }
    }

    private static void tentarRemoverCarga(Transporte t, double peso) {
        boolean sucesso = t.removerCarga(peso);
        if (sucesso) {
            System.out.printf("%.2fkg removidos da carga.%n", peso);
        } else {
            System.out.printf("não foi possível remover %.2fkg (carga insuficiente).%n", peso);
        }
    }
}
