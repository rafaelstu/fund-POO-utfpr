/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.imc.Imc;
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
        Imc imc = new Imc();
        double imcCalc;

        Imc imcCodigo = new Imc(69, 1.75);
        double imcCalcCodigo = imcCodigo.calcularImc();
        System.out.println("valores imc definidos na inicialização: " + imcCodigo.toString());
        System.out.println("calculo do imc definido na inicialização: " + imcCalcCodigo);
        System.out.println("classificação imc definido na inicialização: " + imcCodigo.classificacaoImc(imcCalcCodigo));

        Scanner input = new Scanner(System.in);

        System.out.println("informe o peso (kg): ");
        imc.setPeso(input.nextDouble());
        System.out.println("informe a altura (metros): ");
        imc.setAltura(input.nextDouble());
        System.out.println("valores imc definidos pelo usuario: " + imc.toString());

        imcCalc = imc.calcularImc();

        if (imcCalc != 0) {
            System.out.println("calculo do imc definido pelo usuario: " + imcCalc);
            System.out.println("classificação imc definido pelo usuario: " + imc.classificacaoImc(imcCalc));
        } else {
            System.out.println("nao foi possivel calcular");
        }

    }

}
