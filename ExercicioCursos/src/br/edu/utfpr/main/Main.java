/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.cursos.MarketingDigital;
import br.edu.utfpr.cursos.Programacao;

/**
 *
 * @author tomate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Programacao programacao = new Programacao("Programação", "alberto einstenio", 380, "python", 10, 40);
        MarketingDigital marketing = new MarketingDigital("Marketing de Conteúdo", "Carlos arlos", 222, "plataforma", 300, 2500, 500);

        System.out.println("curso de urso");
        System.out.println(programacao.toString() + "\nCusto total para o curso de urso: " + programacao.calcularCustoTotal());
        System.out.println("marketing arkeek");
        System.out.println(marketing.toString() + "\nCusto total para aaoaaoa: " + marketing.calcularCustoTotal());

    }

}
