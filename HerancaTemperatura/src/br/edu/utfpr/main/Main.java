/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.temperatura.Temperatura;
import java.util.Scanner;

/**
 *
 * @author tomate
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Temperatura t = new Temperatura();
        Scanner s = new Scanner(System.in);

        System.out.println("informe o nome da cidade: ");
        t.setCidade(s.nextLine());

        for (int i = 0; i < 7; i++) {
            System.out.println("informe a temperatura do dia " + (i + 1) + ": ");
            t.setTemperaturas(i, s.nextDouble());
        }

        System.out.println("\nresultado: ");
        System.out.println(t);
        System.out.println(String.format("\n media: %.2f", t.calcularMedia()));
        System.out.println(String.format("\n maior temperatura: %.2f", t.maiorTemperatura()));
        System.out.println(String.format("\n menor temperatura: %.2f", t.menorTemperatura()));

        s.close();
    }

}
