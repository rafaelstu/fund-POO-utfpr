/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.funcionarios.Gerente;
import br.edu.utfpr.funcionarios.Telefonista;

/**
 *
 * @author tomate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente g = new Gerente("rafael", 17000, "rafael", "rafael");
        Telefonista t = new Telefonista("rafael", 6500, 5433);

        System.out.println("gerente");
        System.out.println(g.toString());
        System.out.println(String.format("valor da bonificao: %.2f", g.calcularBonificacao()));
        System.out.println(String.format("salario total: %.2f", g.calcularSalarioTotal()));
        System.out.println("\n");
        System.out.println("telefonista");
        System.out.println(t.toString());
        System.out.println(String.format("valor da bonificao: %.2f", t.calcularBonificacao()));
        System.out.println(String.format("salario total: %.2f", t.calcularSalarioTotal()));

    }

}
