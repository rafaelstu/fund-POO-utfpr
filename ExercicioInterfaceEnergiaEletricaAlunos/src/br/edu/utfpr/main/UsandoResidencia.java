/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.entidades.Comercial;
import br.edu.utfpr.entidades.Isenta;
import br.edu.utfpr.entidades.Residencia;
import br.edu.utfpr.entidades.Residencial;
import br.edu.utfpr.entidades.ResidencialPopular;

/**
 *
 * @author Dell
 */
public class UsandoResidencia {

    public static void main(String[] args) {
        Residencia r1 = new Residencial("João Silva", "12345", 180, 4);
        Residencia r2 = new Comercial("Maria Souza", "67890", 250, "47.89-0-01");
        Residencia r3 = new Isenta("Prefeitura", "00001", 500, "Programa social");

        Residencia casa1 = new ResidencialPopular("Maria Silva", "102", 180, 4, true);
        Residencia casa2 = new ResidencialPopular("João Santos", "205", 300, 5, false);

        System.out.println(r1 + "\nValor total: R$ " + String.format("%.2f", r1.calculoEnergia()));
        System.out.println(r2 + "\nValor total: R$ " + String.format("%.2f", r3.calculoEnergia()));
        System.out.println(r3 + "\nValor total: R$ " + String.format("%.2f", r3.calculoEnergia()));

        System.out.println(casa1 + "\nValor total: R$ " + String.format("%.2f", casa1.calculoEnergia()));
        System.out.println(casa2 + "\nValor total: R$ " + String.format("%.2f", casa2.calculoEnergia()));

    }
}
