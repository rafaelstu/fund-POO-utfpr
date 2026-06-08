/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.utfpr.main;

import br.edu.utfpr.exception.TrataDivisaoPorZero;
import br.edu.utfpr.operacoes.Operacoes;
import java.util.InputMismatchException;
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
        Scanner s = new Scanner(System.in);

        try {

            System.out.println("informe o primeiro numero");
            double n1 = s.nextDouble();
            System.out.println("informe o segundo numero");
            double n2 = s.nextDouble();

            Operacoes op = new Operacoes(n1, n2);

            System.out.println(op.somar());

            System.out.println(op.dividir());
        } catch (TrataDivisaoPorZero | InputMismatchException e) {
            System.out.println("erro: " + e.getMessage());
        }

        s.close();
    }

}
