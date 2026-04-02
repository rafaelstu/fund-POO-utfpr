/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.temperatura.Temperatura;
import br.edu.utfpr.temperatura.TemperaturaLab;
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

        //lab
        TemperaturaLab tL = new TemperaturaLab();

        System.out.println("informe a temperatura maxima permitida no laboratorio");
        tL.setLimiteTemperatura(s.nextDouble());
        tL.setCidade(t.getCidade());

        for (int i = 0; i < 7; i++) {
            tL.setTemperaturas(i, t.getTemperatura(i));
        }
        System.out.println("dados de temperatura do laboratorio");
        System.out.println(tL);
        System.out.println("controle do laboratorio");
        if (tL.isSeguro()) {
            System.out.println("temperatura dentro do limite de segurança");
        } else {
            System.out.println("ALEERTA DE EMERGENCIA! TEMPERATURA ACIME DO LIMITE DE SEGURANÇA!!!!!!!11!!!1!!1!1!!");
        }
        s.close();
    }

}
