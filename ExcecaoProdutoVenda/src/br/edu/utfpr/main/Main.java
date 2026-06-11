/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.entidades.Produto;
import br.edu.utfpr.entidades.Venda;
import br.edu.utfpr.excecoes.QuantidadeInsuficienteException;

/**
 *
 * @author tomate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p = new Produto("notebook", 10, 2500);
        System.out.println(p);

        try {
            Venda venda1 = new Venda(p, 5);
            venda1.efetuarVenda();
            System.out.println(venda1);

            Venda venda2 = new Venda(p, 6);
            venda2.efetuarVenda();
            System.out.println(venda2);
        } catch (QuantidadeInsuficienteException e) {
            System.out.println("erro: " + e.getMessage());
        }

    }

}
